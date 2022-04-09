job('NodeJS example') {
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
        shell("npm install")
    }
}
