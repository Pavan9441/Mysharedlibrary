// File: Mysharedlibrary/src/mySharedLibrary.groovy
def call() {
    echo "pipeline step called"
    def config = readJSON file: "${WORKSPACE}/Mysharedlibrary/resources/cicdConfig.json"
    echo config
    echo "pipeline triggering"
    pipeline {
        agent any
        stages {
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

