#!groovy
import de.elastic2ls.sharedPipelineLib.Gradle
def call(){
    withCredentials([string(credentialsId: 'SONAR', variable: 'TOKEN')]) {
      def sonarurl = readFile('gradle.properties').replaceAll('systemProp.sonar.host.url=http://localhost:9000','systemProp.sonar.host.url=https://sonarqube.gkkdcc.de/')
      writeFile file:'gradle.properties', text: sonarurl+"\r\nsystemProp.sonar.login=${TOKEN}"
    }
    new Gradle().sonarqube()
}
