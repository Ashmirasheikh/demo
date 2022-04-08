pipeline{
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/Ashmirasheikh/demo.git'
            }
        }
        stage('test') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}