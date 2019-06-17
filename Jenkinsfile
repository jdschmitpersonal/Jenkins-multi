@Library('PipelineShared')_
import com.personal.Shared
node('master'){
    stage("one") {
        def field = new Shared()
        field.sharedfile()
    }
}
