def call() {
    withSonarQubeEnv('sonar-scanner') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Youtube1 -Dsonar.projectKey=Youtube1 '''
    }
}
