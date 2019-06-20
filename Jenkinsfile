node('master'){
    
    
    checkout scm
    /*
    def rootDir = pwd()
    def propFile = load("./PropertyList.groovy")
    
    def props = propFile.getPropertyList('1.0.0', true)
    def stages = props.get('var1').split(',')
    */
    def String[] datas = readYaml file: './testyml.yml'
    def count = 1
    for(i = 0 ; i < datas.test.var1.length ; i++){
        stage(datas.test.var1[i]) {
            count = count + 1
              timeout(time: 1, unit: 'HOURS') {
                    input 'Deploy to: ' + datas.test.var1[0] + '?'
               }
                echo 'Current stage' + count
        }
    }

}
