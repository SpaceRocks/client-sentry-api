#!/bin/bash

#######################################################

# App artifact_id taskapi-0.0.12
# App next_version 0.0.12


artifact_id=$1
app_version=$2

artifact=${artifact_id}.${AWS_S3_BUCKET_ARTIFACT_POSTFIX}
aws_s3_bucket_key=${AWS_S3_BUCKET_ARTIFACT_PATH}${app_version}/${artifact}
version_label=v${app_version}
echo "##########################"
echo "Deploy to aws"
echo "##########################"
echo "App name ${APPLICATION_NAME} "
echo "App AWS S3 BUCKET ${AWS_S3_BUCKET} "
echo "App AWS S3 BUCKET_PATH ${aws_s3_bucket_key}"
echo "App Version  ${app_version}"
echo "App Artifact ${artifact}"


echo "Deploy Application Version to Elastic Beanstalk"
aws elasticbeanstalk create-application-version --application-name ${AWS_APP_VERSION_NAME} --version-label ${version_label}  --description "application version created by CI pipeline"  --source-bundle S3Bucket=${AWS_S3_BUCKET},S3Key=${aws_s3_bucket_key} --auto-create-application

aws elasticbeanstalk update-environment --environment-name ${AWS_APP_ENVIRONMENT_NAME} --version-label ${version_label}
