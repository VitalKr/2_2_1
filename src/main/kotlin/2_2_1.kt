fun main(args: Array<String>) {

    WallService.add(Post(1, 1,200322, "Заметка1", null, null,null,null))
    WallService.add(Post(1, 2,210322, "Заметка2", null, null,null,null))
    WallService.add(Post(1, 3,220322, "Заметка3", null, null,null,null))
    WallService.add(Post(1, 4,230322, "Заметка4",null, null,null,null))

    WallService.update(Post(3, 2,30, "0000000",null, null,null,null))

    WallService.createComment(Comment(2,4,4,"Комментарий1",
        AttachmentPhoto(AttachmentPhoto.Photo(1, 2, 3, 4)), 24, 25))


}








