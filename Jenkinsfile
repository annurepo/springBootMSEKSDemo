pipeline {
  agent any
    tools {
      			maven 'MAVEN 3.8.4'
      			jdk 'jdk-11.0.13.8-hotspot'
    }
    stages {      
        stage('Build maven') {
            steps { 
            	sh 'pwd'      
                sh 'mvn  clean install package'
            }
        }
       }
}