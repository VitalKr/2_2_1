 data class AttachmentVideo(val video: Video, override val type: String = "video")
     : Attachment {
     class Video(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )


}



