data class AttachmentVideo(val video: Video) : Attachment("video") {
    data class Video(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )


}



