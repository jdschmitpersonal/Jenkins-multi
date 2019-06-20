node('master'){
    
    
    checkout scm

    def rootDir = pwd()
    def propFile = load("./PropertyList.groovy")
    
    def props = propFile.getPropertyList('1.0.0', true)
    def stages = props.get('var1').split(',')
    
    def count = 1
    for(i = 0 ; i < stages.length ; i++){
        stage(stages[i]) {
            count = count + 1
              timeout(time: 1, unit: 'HOURS') {
               }
                echo 'Current stage' + count
        }
    }

}
