import geb.*

class TwitterPage extends Page {
    String username

    static url = "http://twitter.com"

    static at = {
        tweets != null
        profileCard != null
    }

    static content = {
        tweets { module TweetModule }
        profileCard { module ProfileModule }
    }

    String getHandle(){ "@$username" }
}
