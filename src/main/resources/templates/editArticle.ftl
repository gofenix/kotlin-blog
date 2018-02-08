<!DOCTYPE html>
<html>
<#include "common/head.ftl">
<#include "common/navbar.ftl">
<script>
    $(function () {
        var mditor = Mditor.fromTextarea(document.getElementById('articleContentEditor'))
        mditor.split = true
        mditor.fullscreen = false
        mditor.on('ready', function () {
            mditor.value = $('#articleContent').val()
        })

    })
</script>
<body>
<div class="container-fluid">
<#--<h2>写文章</h2>-->
    <form id="addArticleForm" class="form-horizontal">
        <div class="form-group">
            <input type="text" name="title" class="form-control" placeholder="文章标题" value="${article.title}"/>
        </div>

        <div class="form-group">
            <textarea id="articleContentEditor" type="text" name="content" class="form-control" rows="20"
                      placeholder=""></textarea>
        </div>
        <div class="form-group save-article">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary" id="addArticleBtn">保存并退出</button>
            </div>
        </div>
    </form>
    <h1 id="articleContent">${article.content}</h1>
    <h1>${article.title}</h1>
</div>
</body>
</html>