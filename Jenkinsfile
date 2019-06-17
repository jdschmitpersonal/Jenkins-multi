@Library('PipelineShared')_

node('master'){
    stage("one") {
        def share = new com.personal.sharedfile.call()
        share 'john'
    }
}
