pipeline{
    agent any
        stages {
            stage("one") {
                steps {
                    if (env.BRANCH_NAME == 'master'){
                        sh 'echo "hello hello from branch MASTER!!"'
                    }else{
                        echo "This should never occur"
                    }
                }
            }
        }
}
