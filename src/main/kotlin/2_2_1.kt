fun main(args: Array<String>) {

    WallService.add(Post(1, 200322, "Заметка1", null, null,null,null))
    WallService.add(Post(1, 210322, "Заметка2", null, null,null,null))
    WallService.add(Post(1, 220322, "Заметка3", null, null,null,null))
    WallService.add(Post(1, 230322, "Заметка4",null, null,null,null))

    WallService.update(Post(3, 30, "0000000",null, null,null,null))
}








