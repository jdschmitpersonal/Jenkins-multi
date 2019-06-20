node('master'){
    
    
    checkout scm
    /*
    def rootDir = pwd()
    def propFile = load("./PropertyList.groovy")
    
    def props = propFile.getPropertyList('1.0.0', true)
    def stages = props.get('var1').split(',')
    */
    def datas = readYaml file: './testyml.yml'
    println(datas)
    def stages = datas['test']['var1']
    def count = 1
    for(i = 0 ; i < stages.length ; i++){
        stage(stages[i]) {
            count = count + 1
              timeout(time: 1, unit: 'HOURS') {
                    input 'Deploy to: ' + stages[i] + '?'
               }
                echo 'Current stage' + count
        }
    }

}
