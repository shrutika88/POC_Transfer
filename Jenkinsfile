node(){
    stage('Code Checkout'){
        checkout([$class: 'GitSCM', branches: [[name: '*/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/shrutika88/Calculator.git']]])
    }
    stage('Building source code'){
        bat'''
            cd %WORKSPACE%
            mvn clean install
        '''
    }
    stage('Publish JUnit test cases'){
        step([$class: 'JUnitResultArchiver', testResults: 'target/surefire-reports/TEST-com.example.calculator.addition.AdditionApplicationTests.xml'])
    }
}
