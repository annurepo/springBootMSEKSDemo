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
        
        stage('Copy Artifact') {
           steps { 
           sh 'pwd'
		   sh 'cp -r ./target/*.jar ./dockerf'
           }
        }
        stage('Build docker image') {
           steps {
               script {         
                 def customImage = docker.build('annus26/springBootMSEKSDemo', "./dockerf")
                 docker.withRegistry('https://registry.hub.docker.com', 'dockerhubcred') {
                 customImage.push("${env.BUILD_NUMBER}")
              }                     
           }
        }
	  }
   }
}