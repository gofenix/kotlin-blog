package com.easy.kotlin.kotlinblog.entity

import java.util.*
import javax.persistence.*

@Entity
class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1

    @Version
    var version: Long = 0

    var title: String = ""
    var content: String = ""
    var author: String = "Lucas"
    var gmtCreated: Date = Date()
    var gmtModified: Date = Date()
    var isDelected: Int = 0 // 1 is yes, 0 is no
    var deletedDate: Date = Date()

//    constructor()

//    constructor(id: String, version: String, title: String, content: String,
//                author: String, gmtCreated: String, gmtModified: String, isDeleｃted: String,
//                deletedDate: String) {
//        this.id = id.toLong()
//        this.version = version.toLong()
//        this.content = content
//        this.author = author
//        this.gmtCreated = Date(gmtCreated)
//        this.gmtModified = Date(gmtModified)
//        this.isDelected = isDelected.toInt()
//        this.deletedDate = Date(deletedDate)
//    }

    override fun toString(): String {
        return "Article(id=$id, version=$version, title=$title, content=$content, " +
                "author=$author, gmtCreated=$gmtCreated, gmtModified=$gmtModified, " +
                "isDelected=$isDelected, deletedDate=$deletedDate)"
    }
}