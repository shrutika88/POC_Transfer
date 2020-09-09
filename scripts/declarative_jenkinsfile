pipeline {
    agent{
        node{
            label'Slave'
        }
    }
    stages{
        stage('Code Checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/shrutika88/Calculator.git']]])
            }
        }
        stage('Building source code'){
            steps{
                bat'''
                    cd %WORKSPACE%
                    mvn clean install
                '''
            }
        }
    }
    post{
        always{
            step([$class: 'JUnitResultArchiver', testResults: 'target/surefire-reports/TEST-com.example.calculator.addition.AdditionApplicationTests.xml'])
        }
    }
}
