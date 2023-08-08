package de.elastic2ls.sharedPipelineLib

def build(){
  sh(script: 'gradle build -x test',returnStdout: true).trim()
}

def test(){
  sh(script: 'gradle test',returnStdout: true).trim()
}

def jacocoTestReport(){
  sh(script: 'gradle jacocoTestReport',returnStdout: true).trim()
}

def sonarqube(){
  sh(script: 'gradle sonarqube',returnStdout: true).trim()
}
