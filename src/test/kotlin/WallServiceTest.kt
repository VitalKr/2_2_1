import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService

        val idOld = service.add(Post(1, 2, 1, "",null, null,null,null))
        val idNew = service.add(Post(1, 2, 2,"",null, null,null,null))

        assertNotEquals(idOld.id, idNew.id)
    }

    @Test
    fun updateExisting_true() {
        val service = WallService

        service.add(Post(1, 1, 1,"1111111",null, null,null,null))
        service.add(Post(2, 2, 2,"2222222",null, null,null,null))
        service.add(Post(3, 3, 3,"33333333",null, null,null,null))
        // создаём информацию об обновлении
        val update = Post(2, 2, 2,"11111111",null, null,null,null)

        
        // создаём информацию об обновлении
        val update = Post(2, 2, 2,"11111111")

        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateExisting_false() {
        val service = WallService


        service.add(Post(1, 1, 1,"1111111",null, null,null,null))
        service.add(Post(2, 2, 2,"2222222",null, null,null,null))
        service.add(Post(3, 3, 3,"33333333",null, null,null,null))

        val update = Post(5, 2, 1,"11111111",null, null,null,null)

       

        val result = service.update(update)
        assertFalse(result)
    }
    @Test
    fun shouldThrow_true(){
        val service = WallService
        service.add(Post(1, 1, 1,"1111111",null, null,null,null))
        service.add(Post(2, 2, 2,"2222222",null, null,null,null))
        service.add(Post(3, 3, 3,"33333333",null, null,null,null))


       val comment = Comment(2,3,4,"Комментарий1",
            AttachmentPhoto(AttachmentPhoto.Photo(1, 2, 3, 4)), 24, 25)

        val result = service.createComment(comment)
        assertTrue(result)
    }
    @Test(expected = PostNotFoundException::class)
    fun shouldThrow_false(){
        val service = WallService
        service.add(Post(1, 1, 1,"1111111",null, null,null,null))
        service.add(Post(2, 2, 2,"2222222",null, null,null,null))
        service.add(Post(3, 3, 3,"33333333",null, null,null,null))

        WallService.createComment(Comment(5,5,4,"Комментарий1",
            AttachmentPhoto(AttachmentPhoto.Photo(1, 2, 3, 4)), 24, 25))

    }
}
