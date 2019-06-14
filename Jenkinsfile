#!/usr/bin/groovy
@library('PipelineShared') _
PipelineShared.echojob()
pipeline{
    agent any
        stages {
            stage("one") {
                steps { script {
                    if (env.BRANCH_NAME == 'master'){
                        sh 'echo "hello hello from branch MASTER!!"'
                    }else{
                        echo "This should never occur"
                    } }
                }
            }
        }
}
