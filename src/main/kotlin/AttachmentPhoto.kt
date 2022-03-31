data class AttachmentPhoto(val photo: Photo, override val type: String = "photo")
    : Attachment {
    data class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int
    )

}

