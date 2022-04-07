import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val idOld = service.add(Post(1, 2,2, ""))
        val idNew = service.add(Post(1, 3,2, ""))
        assertNotEquals(idOld.id, idNew.id)
    }

    @Test
    fun updateExisting_true() {
        val service = WallService

        service.add(Post(1, 1, 1,"1111111"))
        service.add(Post(2, 2, 2,"2222222"))
        service.add(Post(3, 3, 3,"33333333"))
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

        service.add(Post(1, 1, 1,"1111111"))
        service.add(Post(2, 2, 2,"22222222"))
        service.add(Post(3, 3, 3, "33333333"))

        val update = Post(4, 2, 2,"11111111")

        val result = service.update(update)

        assertFalse(result)
    }
}
