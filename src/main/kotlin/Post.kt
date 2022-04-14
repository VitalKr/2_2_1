data class Post(
    val id: Int = 0,
    val ownerId: Int,
//    val fromId: Int,
//    val createdBy: Int,
    val date: Int,
    val text: String,
//    val replyOwnerId: Int,
//    val replyPostId: Int,
//    val friendsOnly: Boolean,
//    val postType: String,
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val postponedId: Boolean
    val comments: Comments ?,
    val likes: Likes ?,
    val reposts: Reposts ?,
    val views: Views ?
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean,
        val groupsCanPost: Boolean,
        val canClose: Boolean,
        val canOpen: Boolean,
        val copyright: String,
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean,
        val canLike: Boolean,
        val canPublish: Boolean
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean
    )

    data class Views(
        val count: Int
    )

}


