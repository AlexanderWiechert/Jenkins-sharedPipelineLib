#!groovy
import de.elastic2ls.sharedPipelineLib.Gradle

def call() {
    new Gradle().build()
}
