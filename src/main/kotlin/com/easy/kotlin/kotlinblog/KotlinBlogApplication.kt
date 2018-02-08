package com.easy.kotlin.kotlinblog

import com.easy.kotlin.kotlinblog.entity.Article
import com.easy.kotlin.kotlinblog.repository.ArticleRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinBlogApplication{
    @Bean
    fun init(articleRepository: ArticleRepository)=CommandLineRunner{
        val article: Article= Article()
        article.author="Lucas"
        article.title="学习kotlin"
        article.content="如何开始学习kotlin呢，这里我给大家提供一个方法，。。。。"
        articleRepository.save(article)
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinBlogApplication>(*args)
}
