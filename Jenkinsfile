pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Build the project using Maven
                sh './mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                sh './mvnw test'
            }
        }
        stage('Package') {
            steps {
                // Package the application
                sh './mvnw package'
            }
        }
        stage('Deploy') {
            steps {
                // Example deployment step (adjust as needed)
                echo 'Deploying the application...'
            }
        }
    }

    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build or deployment failed.'
        }
    }
}