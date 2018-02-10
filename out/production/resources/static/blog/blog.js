$(function () {
    $('#addArticleBtn').on('click', function () {
        saveArticle()
    })

    function saveArticle() {
        $.ajax({
            url: "saveArticle",
            data: $('#addArticleForm').serialize(),
            type: "POST",
            async: false,
            success: function (resp) {
                if (resp) {
                    saveArticleSuccess(resp)
                } else {
                    saveArticleFail()
                }
            },
            error: function () {
                saveArticleFail()
            }
        })
    }

    function saveArticleSuccess(resp) {
        alert('保存成功： ' + JSON.stringify(resp))
        window.open('detailArticleView?id=' + resp.id)
    }

    function saveArticleFail() {
        alert('保存失败')
    }


    $('#editArticleBtn').on('click', function () {
        updateArticle()
    })

    function updateArticle() {
        $.ajax({
            url: "saveArticle",
            data: $('#editArticleForm').serialize(),
            type: "POST",
            async: false,
            success: function (resp) {
                if (resp) {
                    updateArticleSuccess(resp)
                } else {
                    updateArticleFail()
                }
            },
            error: function () {
                updateArticleFail()
            }
        })
    }

    function updateArticleSuccess(resp) {
        alert('保存成功： ' + JSON.stringify(resp))
        window.open('detailArticleView?id=' + resp.id)
    }

    function updateArticleFail() {
        alert('保存失败')
    }


    //这个option是自定义dataTables用的
    var aLengthMenu = [7, 10, 20, 50, 100, 200]
    var dataTableOptions = {
        "bDestroy": true,
        dom: 'lfrtip',
        "paging": true,
        "lengthChange": true,
        "searching": true,
        "ordering": true,
        "info": true,
        "autoWidth": true,
        "processing": true,
        "stateSave": true,
        responsive: true,
        fixedHeader: true,
        order: [[1, "desc"]],
        "aLengthMenu": aLengthMenu,
        language: {
            "search": "<div style='border-radius: 10px; margin-left: auto; margin-right: 2px; width: 760px;'> _INPUT_ <span class='btn btn-primary'><span class='fa fa-search'></span>搜索</span></div>",
            paginate: {
                previous: "上一页",
                next: "下一页",
                first: "第一页",
                last: "最后"
            }
        },
        zeroRecords: "没有内容",
        info: "总计 _TOTAL_ 条，共 _PAGES_ 页，_START_ - _END_",
        infoEmpty: "0条记录",
        infoFiltered: ""
    }
    $('#articlesDataTable').DataTable(dataTableOptions)
})