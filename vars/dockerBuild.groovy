def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=f066ee6482msh5eb0c38c4905129p1263bdjsn685342ada955 -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}

