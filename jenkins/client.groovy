package net.demo

String test () {

    node("shared") {
	    stage "\u001B[31m I'm Red \u2717 \u001B[0m build & compile"
		echo "Building project..."
		sleep(3000)
		stage "\u001B[31m I'm Red \u2717 \u001B[0m upload to central repository"
		echo "Uploading artifact to Nexus/Artifactory..."
		sleep(3000)
    }
	stage "Deploy to dev"
	input message: 'Do you want to deploy?', submitter: 'Yes'
}