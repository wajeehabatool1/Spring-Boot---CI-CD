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
### Docker Agent File

The Jenkins pipeline will run inside this Docker container to optimize resource usage. Once the pipeline is complete, the container will be removed. This Docker file includes all necessary dependencies, such as Maven, JDK and Docker CLI.

**Note:** The built image from this Dockerfile is already used in the Jenkins pipeline and is pushed to Docker Hub.

#### Dockerfile Overview

- **Base Image:** Uses Maven 3.9.2 with Eclipse Temurin JDK 17.
- **Docker CLI Installation:** The image includes Docker CLI, installed via the `apt-get` package manager.
- **Working Directory:** Sets the working directory to `/app`.

### Dockerfile
This Dockerfile sets up a Java runtime environment to run the application artifact.

## Kubernetes Deployment Overview

This deployment sets up a Spring Boot application with the following configuration:

- **Name:** `spring-boot-app`
- **Replicas:** 2 instances for high availability
- **Label Selector:** Matches `app: spring-boot-app` to manage pods
- **Container Configuration:** Uses image `wajeeha835/springboot-cicd:replaceImageTag` and exposes port 8080
## Jenkins Pipeline Overview

This Jenkins pipeline automates the CI/CD process for a Spring Boot application:

- **Agent:** Uses Docker with the image `wajeeha835/docker_agent:v1`.
- **Stages:**
  - **Checkout:** Checks out code from the Git repository (commented out in the provided code).
  - **Build and Test:** Builds the project using Maven and creates a JAR file.
  - **Static Code Analysis:** Runs SonarQube analysis using credentials for authentication.
  - **Build and Push Docker Image:** Builds a Docker image tagged with the build number and pushes it to Docker Hub.
  - **Update Deployment File:** Updates the deployment YAML file with the new Docker image tag and pushes changes to GitHub.
## Pre-Requisites
System should have Jenkins , SonarQube, ArgoCD, Kubernetes installed and running
#### start Jenkins
```bash
sudo systemctl start jenkins
```
#### start SonarQube
```bash
sudo systemctl start jenkins
```
#### start Kubernetes
```bash
sudo systemctl start jenkins
```
#### start ArgoCD
```bash
sudo systemctl start jenkins
```
### Following credentials should be configured in jenkins









