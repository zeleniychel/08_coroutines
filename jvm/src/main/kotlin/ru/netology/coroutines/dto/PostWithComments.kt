package ru.netology.coroutines.dto

data class PostWithComments(
    val post: Post,
    val comments: List<CommentWithAuthor> = emptyList(),
    val author: Author
)
