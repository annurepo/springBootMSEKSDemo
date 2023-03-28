pipeline {
	agent none
  stages {
  	stage('Maven Install') {
    	agent {
      	docker {
        	image 'MAVEN 3.8.4'
        }
      }
      steps {
      	sh 'mvn clean install'
      }
    }
  }
}