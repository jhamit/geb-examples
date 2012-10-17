import spock.lang.*
import geb.*
import geb.spock.*

class TwitterSpec extends GebReportingSpec {

    def joshsTwitterPage = new TwitterPage(username: 'josh_hamit')

    def "Josh's Twitter page should load"() {
        when:
        to TwitterPage, joshsTwitterPage.username

        then:
        at TwitterPage
    }

    def "The tweet section should be titled appropriately"() {
        when:
        to TwitterPage, joshsTwitterPage.username

        then:
        tweets.header.text() == "Tweets"
    }

    def "Clicking name on first tweet opens modal"() {
        when:
        to TwitterPage, joshsTwitterPage.username

        and:
        tweets.clickFirstTweetName()

        then:
        tweets.isProfileModalOpen(tweets.firstTweet.attr('data-item-id'))
    }

    def "Profile uses custom profile image"() {
        when:
        to TwitterPage, joshsTwitterPage.username

        then:
        profileCard.isAvatarDefault() == false
    }

    def "Twitter handle correctly displays on page"() {
        when:
        to TwitterPage, joshsTwitterPage.username

        then:
        joshsTwitterPage.handle == profileCard.handle.text()
    }
}
