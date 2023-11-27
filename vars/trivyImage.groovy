def call() {
    sh 'trivy image hyareldocker1/youtube1:latest > trivyimage.txt'
}
