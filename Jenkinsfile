@Library('PipelineShared')_
def shared = new com.personal.sharedfile()
stages{
    stage("one") {
        steps{
            shared 'john'
        }
    }
}
