#!/bin/bash

# #######################################################
# Get Artifact Id
# #######################################################
set -e
app_version=$1
artifact_id="$(mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.artifactId | grep -v '\[')"
artifact_tag=${artifact_id}-${app_version}
echo "${artifact_tag}"