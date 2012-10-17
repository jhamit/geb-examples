import geb.*

class TwitterPage extends Page {
    static at = { title == "DFW Groovy Grails UG (dfw2gug) on Twitter" }
    static url = "http://twitter.com"
    static content = {
        tweets { module TweetModule }
        profileCard { module ProfileModule }
    }
}
