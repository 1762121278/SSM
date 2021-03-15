<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<form>
    <label>舒江涛，欢迎来到南京</label>
     <input type="button" id="but1" value="店家发送AJAX" onclick="but2()">
</form>

<script>
    function but2() {
        $.ajax({
            type:'GET',
            url:'http://localhost:8081/ssm/selectAll',
            success:function(data){
                alert(data)
            }
        })}
</script>
</body>
</html>