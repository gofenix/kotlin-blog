<!DOCTYPE html>
<html>
<#include "common/head.ftl">
<body>
<#include "common/navbar.ftl">
<div class="container">
    <h3>${article.title}</h3>
    <h6>${article.author}</h6>
    <h6>${article.gmtModified}</h6>
    <textarea id="articleContentShow" placeholder="<#escape x as x?html>${article.content}</#escape>"
              style="display: none"></textarea>
    <div id="article-content" class="markdown-body"></div>
</div>
<script>
    $(function () {
        var parser=new Mditor.Parser()
        var articleContent=document.getElementById('articleContentShow').placeholder
        articleContent=unescape(articleContent)
        var html=parser.parse(articleContent)
        $('#article-content').append(html)
    })
</script>
</body>
</html>