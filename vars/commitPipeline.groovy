/**
 * Hello world step.
 */
def call(Map templateParams) {   
pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
			echo "ala"
                }
            }
            stage('Unit test') {
                steps {
			echo "ola"
                }
            }
        }
    }
}
