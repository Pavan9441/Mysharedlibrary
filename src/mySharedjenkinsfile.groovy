// File: Mysharedlibrary/src/mySharedLibrary.groovy
def call() {
    def config = readJSON file: "${WORKSPACE}/Mysharedlibrary/resources/cicdConfig.json"

    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    mySharedFunction()
                }
            }
            stage('Build') {
                steps {
                    echo "Building.."
                    // Add your build steps using config properties if needed
                }
            }
            stage('Test') {
                steps {
                    echo "Testing.."
                    // Add your test steps using config properties if needed
                }
            }
            // Add other stages based on your configuration
        }
    }
}

