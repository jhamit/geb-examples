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

/*    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage

        and:
        q = "wikipedia"

        then:
        at GoogleResultsPage

        and:
        firstResultLink.text() == "Wikipedia"

        when:
        firstResultLink.click()

        then:
        waitFor { at WikipediaPage }
    }
*/
}
