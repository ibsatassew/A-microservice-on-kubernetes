# Microservice Assignment

This repository contains the code and Kubernetes manifests for the Microservice assignment. The assignment involves building a small microservice, deploying it to Kubernetes, and exposing endpoints for configuration and Fibonacci sequence generation.

## Assignment Overview

Each week, we build upon the skills learned in the course, adding new ideas and concepts. This assignment focuses on enhancing a microservice by adding endpoints to retrieve environment configuration and generate Fibonacci sequences.

### Requirements

- Implement a RESTful route "/config" to retrieve environment variables.
- Write logs containing the retrieved environment configuration.
- Use Kubernetes ConfigMaps to define environment variables.
- Expose the retrieved environment variables and logs in the "/config" endpoint response.
- Implement a RESTful route "/fib" to generate Fibonacci sequences.
- Expose both "/config" and "/fib" routes in the Swagger UI.
- Deploy the microservice to Kubernetes with 3 Pods.
- Expose the microservice as a NodePort Service on port 31234.

## Getting Started

To get started with this assignment, follow the instructions below:

1. Clone this repository to your local machine.
2. Build the microservice Docker image using the provided Dockerfile.
3. Deploy the microservice to Kubernetes using the provided YAML manifests.
4. Access the exposed endpoints ("/config" and "/fib") using the assigned NodePort.

## Directory Structure

- `src/`: Contains the source code for the microservice.
- `docker/`: Contains the Dockerfile for containerization.
- `kubernetes/`: Contains Kubernetes manifests for deployment.

## Usage

Once the microservice is deployed and running, you can access the following endpoints:

- `/config`: Retrieves environment variables and logs.
- `/fib?length=<num>`: Generates a Fibonacci sequence of the specified length.

## Artifacts

Before submission, ensure the following artifacts are prepared:

- `status.png`: Screenshot of Kubernetes resources (`kubectl get services,deployments,pods,configmaps`).
- `curl.txt`: Terminal output of cURL commands for "/config" and "/fib" endpoints.

## Author

Ibsa Tassew Geleta 

## License

This project is licensed under the [MIT License](LICENSE).
