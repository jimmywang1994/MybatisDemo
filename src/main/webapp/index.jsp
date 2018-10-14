<html>
<script src="/js/jquery-1.7.2.js"></script>
<script>
    $(function () {
        $.ajax({
            url:'/student/showStudents',
            type:'get',
            dataType:'json',
            success:function (redata) {
                console.log(redata)
            }
        })
    })
</script>
<body>
<h2>Hello World!</h2>
</body>
</html>
