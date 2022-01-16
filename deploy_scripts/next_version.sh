#!/bin/bash

# #######################################################
# get next version (before release:prepare)
# #######################################################
set -e
nextversion="$(mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | grep -v '\[')"
next_app_version=${nextversion%%-*}
echo "$next_app_version"

