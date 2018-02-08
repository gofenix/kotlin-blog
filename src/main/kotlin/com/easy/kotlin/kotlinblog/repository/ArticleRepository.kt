package com.easy.kotlin.kotlinblog.repository

import com.easy.kotlin.kotlinblog.entity.Article
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long>{
    override fun findAll(): List<Article>
}