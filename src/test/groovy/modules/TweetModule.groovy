import geb.*

class TweetModule extends Module {
    static content = {
        header { $('h2.js-timeline-title') }
        tweet { $('div.tweet') }
        firstTweet{ tweet.first() }
        profileModal{ $('#profile_popup') }
    }

    void clickFirstTweetName(){
        firstTweet.find('.fullname').click()
    }

    Boolean isProfileModalOpen(def tweetId){
        profileModal.attr('style').contains('display: block;') && tweetId.equals(profileModal.attr('data-associated-tweet-id'))
    }
}
