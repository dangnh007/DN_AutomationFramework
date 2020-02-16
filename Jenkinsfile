node {
    stage('Get Code') {
    // Get code from Github repository
        git credentialsId: 'dangnh007@gmail.com', url: 'https://github.com/dangnh007/DN_AutomationFramework'
    }

    stage('Execute test then generate the report') {
        // Clean project
        bat label: 'Clean Project', script: 'mvn clean'
        // Execute test
        bat label: 'Execute test', script: 'mvn clean verify'
    }

    stage('Public HTML report to Jenkins') {
        cucumber cucumber-pretty: -1, failed : -1, surefile-reports: -1, fileIncludePattern: '**/*.json'
    }
}