package de.elastic2ls.sharedPipelineLib

def build(String imageTag){
        sh(script: "docker build -t $imageTag .")
}

def buildmongodb(String mongodburl, String imageTag, String dockerfilepath){
        sh(script: "docker build --build-arg mongodb_url=$mongodburl -t $imageTag --no-cache $dockerfilepath")
}

def push(String imageTag){
        sh(script: "docker push $imageTag")
}
