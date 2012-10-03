import spock.lang.*
import geb.*
import geb.spock.*

class TwitterSpec extends GebReportingSpec {

    def "the DFW Groovy Grails UG Twitter page should load"() {
        when:
        to TwitterPage

        then:
        at TwitterPage
    }
}
