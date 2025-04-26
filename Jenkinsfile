pipeline {
    agent any

    tools {
        maven 'Maven'
    }

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
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                // Package the application
                sh 'mvn package'
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
            echo "Build id : ${BUILD_ID}"
            echo "Build url : ${BUILD_URL}"
        }
        failure {
            echo 'Build or deployment failed.'
        }
    }
}