pipeline {
    agent any

    tools {
            maven 'Maven-3.9'
        }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Smoke Test') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=testng.xml'
            }
        }
    }

    post {
        always {

            junit allowEmptyResults: true,
                  testResults: 'target/surefire-reports/*.xml'

            archiveArtifacts artifacts: 'test-output/ExtentReport.html',
                              allowEmptyArchive: true
        }
    }
}