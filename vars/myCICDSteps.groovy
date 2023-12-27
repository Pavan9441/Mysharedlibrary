// vars/myCICDSteps.groovy

def runCICDSteps() {
    node {
    stage('Build') {
        echo 'Running build...'
        // Add your build steps here
    }
    stage('Test') {
        echo 'Running tests...'
        // Add your test steps here
    }
    stage('Sonar Analysis') {
        echo 'Running Sacnning...'
        // Add your test steps here
    }
    stage('Create Package') {
        echo 'Deploying...'
        // Add your deployment steps here
    }
    stage('Deploy') {
        echo 'Deploying...'
        // Add your deployment steps here
    }
    }

}
