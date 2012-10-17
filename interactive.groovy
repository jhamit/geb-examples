import groovy.grape.Grape
Grape.grab([group:'org.codehaus.geb', module:'geb-core', version:'0.7.2'])
Grape.grab([group:'org.seleniumhq.selenium', module:'selenium-firefox-driver', version:'2.25.0'])
Grape.grab([group:'org.seleniumhq.selenium', module:'selenium-support',version:'2.25.0'])
import geb.*
import java.util.logging.*

new File("interactive.properties").withInputStream {
    LogManager.logManager.readConfiguration it }

b = new Browser(baseUrl: "https://twitter.com/")
b.go()
