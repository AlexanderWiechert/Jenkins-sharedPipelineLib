#!groovy

import de.elastic2ls.sharedPipelineLib.Git

def call() {
    new Git().commit()
}
