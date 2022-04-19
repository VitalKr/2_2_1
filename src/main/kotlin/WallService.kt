object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var id: Int = 0

    fun add(post: Post): Post {

        if (posts.isEmpty()) {
            id = 1
            posts = arrayOf(post.copy(id = id))
        } else {
            id = posts.last().id + 1
            posts = posts + post.copy(id = id)
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val newText = post.text
        val id = post.id
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(
                    ownerId = post.ownerId,
                    date = post.date,
                    text = newText
                )
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (comment.postID == post.id){
                comments += comment
            }
            else { java.lang.RuntimeException ("PostNotFoundException")}
        }
    }
}