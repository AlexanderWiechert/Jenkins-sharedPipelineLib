#!groovy
import de.elastic2ls.sharedPipelineLib.Docker

def call(String mongodburl, String imageTag, String dockerfilepath) {
    new Docker().buildmongodb(mongodburl, imageTag, dockerfilepath)
}
