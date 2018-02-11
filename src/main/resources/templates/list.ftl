<!DOCTYPE html>
<html>
<head>
<#include "common/head.ftl">
</head>
<body>
<#include "common/navbar.ftl">
<div class="container-fluid">
<#--<h1>我的博客</h1>-->
<#--<a href="addArticleView" target="_blank" class="btn btn-primary pull-right add-article">写文章</a>-->
    <table id="articlesDataTable" class="table table-responsive table-bordered">
        <thead>
        <th>序号</th>
        <th>标题</th>
        <th>作者</th>
        <th>发表时间</th>
        <th>操作</th>
        </thead>
        <tbody>
        <#list articles as article>
        <tr>
            <td>${article.id}</td>
            <td><a target="_blank" href="detailArticleView?id=${article.id}">${article.title}</a></td>
            <td>${article.author}</td>
            <td>${article.gmtModified}</td>
            <td>
                <a href="editArticleView?id=${article.id}" target="_blank">编辑</a>
                &nbsp;&nbsp;
                <#--<a href="deleteArticle?id=${article.id}">删除</a>-->
                <a href="javascript:void(0);" onclick="deleteArticle(${article.id})">删除</a>
            </td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>

<script>
    function deleteArticle(id) {
        $.ajax({
            url: "deleteArticle",
            data: {"id": id},
            type: "POST",
            async: false,
            success: function () {
                location.reload()
                alert("已经删除")
            }
        })
    }

</script>

</html>