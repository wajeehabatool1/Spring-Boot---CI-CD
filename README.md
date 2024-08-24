# Jenkins Pipeline for Spring Boot Application Using Maven , SonarQube, ArgoCD And Kubernetes
## Tools Used
- **Jenkins**: Automates the build, test, and deployment processes.
- **Maven**: Manages dependencies and builds the Spring Boot application.
- **SonarQube**: Provides static code analysis to ensure code quality.
- **Docker**: Containerizes the Spring Boot application.
- **ArgoCD**: Manages continuous delivery and deployments on Kubernetes.
- **Kubernetes**: Orchestrates the deployment and management of containerized applications.


## Docker Files
This project contains multiple Dockerfiles, each designed for different purposes. Below is an explanation of each Dockerfile and its intended use.
### SpringBoot_DockerFile
This multi-stage Dockerfile is designed to build and run a Spring Boot application locally on your machine using containerization. 

#### Build the Docker Image
```bash
docker build -f SpringBoot_DockerFile -t spring-boot-app .
```
#### Run the Docker Container
```bash
docker run -p 8080:8080 spring-boot-app
```
## Docker Agent File

The Jenkins pipeline will run inside this Docker container to optimize resource usage. Once the pipeline is complete, the container will be removed. This Docker file includes all necessary dependencies, such as Maven, JDK and Docker CLI.

**Note:** The built image from this Dockerfile is already used in the Jenkins pipeline and is pushed to Docker Hub.

#### Dockerfile Overview

- **Base Image:** Uses Maven 3.9.2 with Eclipse Temurin JDK 17.
- **Docker CLI Installation:** The image includes Docker CLI, installed via the `apt-get` package manager.
- **Working Directory:** Sets the working directory to `/app`.



