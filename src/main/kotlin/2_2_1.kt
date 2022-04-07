fun main(args: Array<String>) {

    WallService.add(Post(0, 33, 200322, "Заметка1"))
    WallService.add(Post(0, 44,210322, "Заметка2"))
    WallService.add(Post(0, 55,220322, "Заметка3"))
    WallService.add(Post(1, 66,230322, "Заметка4"))

    WallService.update(Post(2, 77,300322, "0000000"))
}








