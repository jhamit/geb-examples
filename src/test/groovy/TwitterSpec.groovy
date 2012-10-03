import spock.lang.*
import geb.*
import geb.spock.*

class TwitterSpec extends GebReportingSpec {

    def "The DFW Groovy Grails UG Twitter page should load"() {
        when:
        to TwitterPage

        then:
        at TwitterPage
    }
}
