#!/bin/sh

# first argument is port to listen to, defaults to 8080
# second argument is admin port to listen to, defaults to 8081

java "-Ddw.server.applicationConnectors[0].port=${1:-8080}" "-Ddw.server.adminConnectors[0].port=${2:-8081}" -jar target/verapdf-rest.jar server
