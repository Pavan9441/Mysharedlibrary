// vars/myCICDSteps.groovy

def runCICDSteps() {
    stage('Build') {
        echo 'Running build...'
        // Add your build steps here
    }
    stage('Test') {
        echo 'Running tests...'
        // Add your test steps here
    }
    stage('Deploy') {
        echo 'Deploying...'
        // Add your deployment steps here
    }
}