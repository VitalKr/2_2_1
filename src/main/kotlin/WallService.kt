object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        //  posts += post
        val id = posts.lastIndex + 1
        //     println(id)
        posts = posts + post.copy(id = id)
        println(posts.last())
        // println()
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val text = post.text
        val id = post.component1()

        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(text = text)
                println(posts[index])
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment, post: Post) {
        for ((index, post) in posts.withIndex()) {
            if (comment.postID == post.id)
                TODO()
        }
    }
}