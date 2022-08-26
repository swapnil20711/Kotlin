fun main() {
    SharingWidget.incrementTLikes()
    SharingWidget.incrementTLikes()
    SharingWidget.incrementTLikes()
    SharingWidget.incrementTLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()
    /* Anonymous object */
    var obj = object {
        private var name = "swapnil"
        fun display() {
            println("$name  phodega")
        }
    }
    obj.display()
}

object SharingWidget {
    private var twitterLikes = 0
    private var fbLikes = 0
    fun incrementTLikes() {
        twitterLikes++
    }

    fun incrementFbLikes() {
        fbLikes++
    }

    fun display() {
        println("Twitter - $twitterLikes\nFb - $fbLikes")
    }
}