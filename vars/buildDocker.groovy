#!groovy
import de.elastic2ls.sharedPipelineLib.Docker

def call(String imageTag) {
    new Docker().build(imageTag)
}
