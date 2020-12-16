def call(Map params) {
    withMaven(maven: 'MVN_360') {
        sh "mvn --version"
        //sh "echo ${UseVPN}"
    }
}
      
return this
