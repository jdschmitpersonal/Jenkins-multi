@Library('PipelineShared')_
import src.com.personal.Shared
node('master'){
    stage("one") {
        def field = new Shared()
        field.sharedfile()
    }
}
