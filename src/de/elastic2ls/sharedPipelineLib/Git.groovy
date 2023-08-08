package de.elastic2ls.sharedPipelineLib

def branch(){
        return sh(script: 'git name-rev --name-only HEAD|cut -d "/" -f3',returnStdout: true).trim()
}

def commit(){
        return sh(script: 'git rev-parse --short HEAD',returnStdout: true).trim()
}
