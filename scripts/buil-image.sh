#!/bin/bash
docker build -t angelfym/springboot-application-ci:latest .
docker tag angelfym/springboot-application-ci:latest angelfym/springboot-application-ci:upload