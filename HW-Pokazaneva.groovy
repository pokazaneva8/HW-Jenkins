pipeline {
    agent any

    stages {
        stage('Disk space') {
            steps {
                sh(script: 'df -h')
            }
        }
    }
}
