
job('NodeJS Docker example') {
    node {
        env.NODEJS_HOME = "${tool 'Node 4.x'}"
        // on linux / mac
        env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
    }
    scm {
        git('https://github.com/HakimiX/docker-app') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in
        // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('hakimixx/docker-nodejs-demo')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('dockerhub')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}
