def call() {
    sh 'trivy image hyareldocker1/youtube:latest > trivyimage.txt'
}
