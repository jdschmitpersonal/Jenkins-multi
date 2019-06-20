node('master'){
    def rootDir = pwd()
    def propFile = load("${rootDir}/vars/PropertyList.groovy")
    
    def props = propFile.getPropertyList('1.0.0', true)
    def stages = props.get('var1').split(',')
    
    def count = 1
    for(i = 0 ; i < stages.length ; i++){
        stage(stages[i]) {
            echo 'Current stage' + count
            count = count + 1
        }
    }

}
