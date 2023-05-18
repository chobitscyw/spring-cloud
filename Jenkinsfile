// pipeline {
//     agent any
//
//     stages {
//         stage('Build') {
//             steps {
//                 echo 'Hello World'
//             }
//         }
//     }
// }

pipeline {
    agent any

    tools {
        maven 'mvn-3.5.0'
    }

    stages {
        stage('Build') {
            steps {
                //sh "mvn clean package spring-boot:repackage"
                sh "printenv"
            }
        }
    }
}
