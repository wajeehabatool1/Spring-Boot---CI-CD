# Jenkins Pipeline for Spring Boot Application Using Maven , SonarQube, ArgoCD And Kubernetes
## Docker Files
This project contains multiple Dockerfiles, each designed for different purposes. Below is an explanation of each Dockerfile and its intended use.
###SpringBoot_DockerFile
This multi-stage Dockerfile is designed to build and run a Spring Boot application locally on your machine using containerization. 
####Build the Docker Image
```bash
docker build -f SpringBoot_DockerFile -t spring-boot-app .
####Run the Docker Container
'''bash
docker run -p 8080:8080 spring-boot-app



