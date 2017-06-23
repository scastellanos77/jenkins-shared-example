/**
 * Hello world step.
 */
def call(Map templateParams) {   
pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                     echo "Building project @templateParams.name"
                     sh "./gradlew compileJava"
                }
            }
            stage('Unit test') {
                steps {
                     echo "Testing project @templateParams.name"
                     sh "./gradlew test"
                }
            }
        }
    }
}
