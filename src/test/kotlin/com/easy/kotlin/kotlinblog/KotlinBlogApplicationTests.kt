package com.easy.kotlin.kotlinblog

import com.easy.kotlin.kotlinblog.entity.Article
import com.easy.kotlin.kotlinblog.repository.ArticleRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinBlogApplicationTests {

	@Autowired
	val articleRepository: ArticleRepository? = null

	@Test
	fun contextLoads() {
	}

	@Test
	fun testRepository(){
		articleRepository?.save(Article())
	}

}
