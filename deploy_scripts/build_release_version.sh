#!/bin/bash

set -e
artifact_id=$1
app_version=$2
echo "##########################"
echo "Build & release app"
echo "##########################"
echo "App version ${app_version} "

# #######################################################
# Build and release hard version of Application
# #######################################################
mvn -B release:clean release:prepare -DscmCommentPrefix="--skip-ci Preparing next build version - build" -DtagNameFormat="v@{project.version}"
git checkout tags/v${app_version} -b inter-${app_version}

# #######################################################
# Deploy artifact to S3
# #######################################################
mvn clean deploy

# #######################################################
# Deploy package to S3
# #######################################################
cd target
zip -r ../${artifact_id}.zip ${artifact_id}.jar .platform .ebextensions
aws s3 mv ../${artifact_id}.zip s3://${AWS_S3_BUCKET}/${AWS_S3_BUCKET_ARTIFACT_PATH}${app_version}/${artifact_id}.zip