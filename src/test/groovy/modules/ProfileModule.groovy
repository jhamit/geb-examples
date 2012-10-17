import geb.*

class ProfileModule extends Module {
    static content = {
        profileCard { $('.profile-card') }
        fullname { profileCard.find('.fullname') }
        handle { profileCard.find('.username') }
        description { profileCard.find('.bio') }
        location { profileCard.find('.location') }
        website { profileCard.find('.url') }
        avatar { profileCard.find('img.avatar') }
    }

    def isAvatarDefault() {
        avatar.attr('src').contains('/default_profile_images/')
    }
}
