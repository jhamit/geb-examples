import geb.*

class TweetModule extends Module {
    static content = {
        header { $('h2.js-timeline-title') }
        tweet { $('div.tweet') }
    }
}
