node('master'){
    
    
    checkout scm

    def rootDir = pwd()
    def propFile = load("./PropertyList.groovy")
    
    def props = propFile.getPropertyList('1.0.0', true)
    def stages = props.get('var1').split(',')
    
    def count = 1
    for(i = 0 ; i < stages.length ; i++){
        stage(stages[i]) {
              timeout(time: 1, unit: 'HOURS') {
                   def exitDeploy = input 'Deploy to: ' + stages[0] + '?'
               }
            if(exitDeploy){
                echo 'Current stage' + count
                count = count + 1
            } else {
                return
            }

        }
    }

}
