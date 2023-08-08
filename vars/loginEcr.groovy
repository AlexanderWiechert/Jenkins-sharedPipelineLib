#!groovy

def call() {
    sh "eval \$(aws ecr get-login --region eu-central-1|awk {'print \$1, \$2, \$3, \$4, \$5, \$6, \$9'})"
  }
