data class Comment(
    val ownerId: Int,
    val postID: Int,
    val fromGroup: Int,
    val message: String,
    val attachment: Attachment,
    val stickerId: Int,
    val guid: Int
)

