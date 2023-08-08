#!groovy
@Library('sharedPipelineLib@master') _

pipeline {
  agent { node
    { label 'jenkins-slave-docker' }
  }
  environment {
    sonar = credentials('SONAR')
  }
  stages {

    stage('Checkout') {
      steps {
        cleanWs()
        script {
          checkout([
            $class: 'GitSCM', branches: [[name: '*/master']],
            userRemoteConfigs: [[url: 'git@github.com:elastic2ls-com/example-changeme.git',credentialsId: 'deployKey']]
            ])
          }
        }
    }

    stage('Build') {
      steps {
        catchError(buildResult: 'UNSTABLE', stageResult: 'FAILURE'){
          script {
              runGradleJoacoco()
            }
          }
        }
    }
  }

}
