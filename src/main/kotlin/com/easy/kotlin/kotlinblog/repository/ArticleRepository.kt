package com.easy.kotlin.kotlinblog.repository

import com.easy.kotlin.kotlinblog.entity.Article
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

interface ArticleRepository : CrudRepository<Article, Long> {
    override fun findAll(): List<Article>


    @Transactional
    @Modifying
    @Query(value = "update article set content=?1 where id=?2 ", nativeQuery = true)
    fun updateById(content: String, id: Long): Unit
}