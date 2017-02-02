<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="http://libs.useso.com/js/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/input-style.css">
<link rel="stylesheet" type="text/css" href="css/local.css">
<title>Insert title here</title>
</head>
<body>
	<div class="commentTitleDiv">
		<table class="tableStyle">
			<tr class="tableTrStyle">
				<td >
					<img id="returnImage" onclick="turnBack()" class="returnImage" src="images/return.png"/>
				</td>
				<td class="commentTitleTdStyle">
					<font class="commentFunt" style="font-size:18px;">评论</font>
					<font id="newsId" style="visibility:hidden;">${newsId}</font>
				</td>
			</tr>
		</table>
	</div>
	<div id="commentDiv" class="commentDiv">
		<table id="commentTable" style="width: 100%;">
			<c:forEach items="${commentList}" var="comment">
					<tr class="commentTr">
						<td class="commentInputTdPortrait" >
							<img class="portraitImage" src="${comment.portrait}"/>
						</td>
						<td class="commentInputTdComment" >
							<font class="usernameFont" >${comment.userName}</font><br /> 
							<font >${comment.content}</font>
						</td>
					</tr>
			</c:forEach>
		</table>
	</div>
	<div class="inputDiv">
		<table style="width:100%;height:100%;">
			<tr>
				<td class="commentInputPortrait" align="center">
					<img class="portraitImage" src="${userImage}"/>
				</td>
				<td class="commentDownInputTd">
					<input id="commentInput" class="effect-1" type="text" oninput="commentOnInput()" placeholder="添加评论...">
	  				<!-- <span class="focus-border"></span> -->
				</td>
				<td class="commentDownInputButtonTd" align="center">
					<button id="sendCommentBtn" onclick="sendComment()" >发布</button>
				</td>
			</tr>
		</table>
	</div> 	
</body>

<script type="text/javascript">
	$(window).load(function(){
		document.getElementById("sendCommentBtn").disabled=true;
		var bodyHeight =window.screen.availHeight;
		document.getElementById("commentDiv").style.height=bodyHeight*0.8+ "px";;
	});  
	
	function commentOnInput(){
		if(document.getElementById("commentInput").value != ""){
		    document.getElementById("sendCommentBtn").disabled=false;
		}else{
			document.getElementById("sendCommentBtn").disabled=true;
		}
	};
	
	function appendComment(commentContent){
		// 使用createElement创建元素
		var commentTr = document.createElement('tr');
		var imageTd = document.createElement('td');
		var image = document.createElement('img');
		var userTd = document.createElement('td');
		var usernameSpan = document.createElement('span');
		var br = document.createElement('br');
		var commentSpan = document.createElement('span');
		
		// 添加class
		imageTd.className = 'commentInputTdPortrait';
		userTd.className = 'commentInputTdComment';
		usernameSpan.className = 'usernameFont';
		image.className="portraitImage";
		commentTr.className="commentTr";
		// 属性
		image.src="${userImage}";
		// 文本
		usernameSpan.innerHTML="${username}";
		commentSpan.innerHTML=commentContent;
		// 在容器元素中放入其他元素
		imageTd.appendChild(image);
		userTd.appendChild(usernameSpan);
		userTd.appendChild(br);
		userTd.appendChild(commentSpan);
		commentTr.appendChild(imageTd);
		commentTr.appendChild(userTd);
		document.getElementById("commentTable").appendChild(commentTr);
	}
	
	function sendComment(){
		var comment=document.getElementById("commentInput").value;
		var newsId=document.getElementById("newsId").innerHTML;
		var userId="${userId}";
		appendComment(comment);
		document.getElementById("commentInput").value="";
		$.ajax({
			data:{"comment":comment,"newsId":newsId,"userId":userId}, 
			type:"POST",
			dataType: 'json',
			url:"updateComment.htm",
			success:function(data){
				alert("success");
			}
		});
	};
	
	function turnBack(){
		history.go(-1);
	}

	function changeCommentLikes(id){
		$.ajax({
			data:"commentId="+id, 
			type:"POST",
			dataType: 'json',
			url:"updateComment.htm",
			success:function(data){
				alert("success");
			}
			});
	};
</script>

</html>