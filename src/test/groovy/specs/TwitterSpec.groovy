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

    def "The tweet section should be titled appropriately"() {
        when:
        to TwitterPage

        then:
        tweets.header.text() == "Tweets"
    }

    def "Clicking name on first tweet opens modal"() {
        when:
        to TwitterPage

        and:
        tweets.clickFirstTweetName()

        then:
        b.$('#profile_popup').attr('style') == 'display: block;'
    }
}
