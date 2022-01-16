#!/bin/bash

set -e
echo "##########################"
echo "Environment Setup"
echo "##########################"
#######################################################
# Setup environment
#######################################################
#### setup git config
git config --global user.email $BUILDER_EMAIL
git config --global user.name $BUILDER_NAME

#### setup MVN creds
mkdir -p ~/.m2
echo "<settings><servers><server><id>${AWS_S3_BUCKET}</id><username>${AWS_ACCESS_KEY_ID_S3}</username><password>${AWS_SECRET_ACCESS_KEY_S3}</password></server></servers></settings>" > ~/.m2/settings.xml


#### setup AWS creds
mkdir -p ~/.aws
echo -e "[default] \naws_access_key_id = ${AWS_ACCESS_KEY_ID_S3} \naws_secret_access_key = ${AWS_SECRET_ACCESS_KEY_S3}" > ~/.aws/credentials

#### Install AWS CLI
pip install awscli

#### checkout release branch
git checkout ${BRANCH_RELEASE}


