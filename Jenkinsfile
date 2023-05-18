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

    stages {
        stage('Build') {
            steps {
                sh "mvn clean package spring-boot:repackage"
                sh "printenv"
            }
        }
    }
}
