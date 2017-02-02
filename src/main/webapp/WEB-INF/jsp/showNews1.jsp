<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>欧洲杯！谁能问鼎冠军？来！为你支持的球队投票</title>
	<link rel="stylesheet" type="text/css" href="css/normalize.css"/>
	<link rel="stylesheet" type="text/css" href="css/local.css"/>
	<link rel="stylesheet" type="text/css" href="css/default.css">
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<script src="http://libs.useso.com/js/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/jquery.touchSwipe.js"></script>
    <script type="text/javascript" src="js/jquery.horizonScroll.js"></script>
    <script type="text/javascript" src="js/jquery-doubleTap.js"></script>
    <script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
    <script type="text/javascript" src="https://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
</head>
	<body>
		<section data-role="section" id="section-section1">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news1.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news1.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea1" ondblclick="changeLikesUp1()">
				<img id="imageUp1" src="${news1.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news1.content}</span>
			</div>
			<div id="imageDownArea1" ondblclick="changeLikesDown1()">
				<img id="imageDown1" src="${news1.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft1" class="barImageStyleLeft"  onclick="changeLikesUp1()"/>
							<font id="leftDesc1" style="text-align:center;">(${news1.descLeft})</font>
							<font id="barFontLeft1">${news1.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight1" class="barImageStyleRight"  onclick="changeLikesDown1()"/>
							<font id="rightDesc1">(${news1.descRight})</font>
							<font id="barFontRight1">${news1.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news1.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
    <script type="text/javascript">
	    var lianjie = location.href.split('#')[0];
	    var sig = "";
	    if(lianjie=="http://www.yonxipay.com/InfoPlatform/getTopic.htm"){
	    	sig='${signature1}';
	    }else{
	    	sig='${signature2}';
	    }
    
	    /**
	    wx.config({
	        debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
	        appId: '${appId}', // 必填，公众号的唯一标识
	        timestamp: "${timestamp}", // 必填，生成签名的时间戳
	        nonceStr: 'noncestr', // 必填，生成签名的随机串
	        signature: sig,// 必填，签名，见附录1
	        jsApiList: ['showMenuItems','onMenuShareTimeline','onMenuShareAppMessage'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
	    });
	    wx.ready(function () {
	        wx.showMenuItems({
	            menuList: [
	                'menuItem:profile', // 添加查看公众号
	                'menuItem:addContact',
	                'menuItem:nightMode'
	            ]
	        });
	        wx.onMenuShareTimeline({
		        title: '欧洲杯！谁能问鼎冠军？来！为你支持的球队投票', // 分享标题
		        link: 'http://www.yonxipay.com/InfoPlatform/getTopic.htm', // 分享链接
		        success: function () { 
		            alert("分享成功");
		        },
		        cancel: function () { 
		        	alert("分享失败");
		        }
		    });
	        wx.onMenuShareAppMessage({
	            title: '欧洲杯！谁能问鼎冠军？来！为你支持的球队投票', // 分享标题
	            desc: '', // 分享描述
	            link: 'http://www.yonxipay.com/InfoPlatform/getTopic.htm', // 分享链接
	        });
	    });
	    wx.showMenuItems({
            menuList: [
                'menuItem:profile', // 添加查看公众号
                'menuItem:addContact',
                'menuItem:nightMode'
            ]
        });
	    */
	    
	    
	    //alert(location.href.split('#')[0]);
	    
	    $('section').horizon();
	    function getComment(newsId,username,userImage){
	    	$.ajax({
				data:{"newsId":newsId,"username":username,"userImage":userImage}, 
				type:"GET",
				dataType: 'json',
				url:"updateComment.htm",
				success:function(data){
					alert("success");
				}
			});
	    };
	    function sendUserLike(newsId,type,num){
			$.ajax({
				data:{"newsId":newsId,"type":type,"num":num}, 
				type:"POST",
				dataType: 'json',
				url:"updateUserLike.htm",
				success:function(data){
					alert("success");
				}
			});
		};
	    
	    var userLikesUp1 = false;
	    var userLikesDown1 = false;
	    if("${news1.type}"=="topicnews"){
	    	document.getElementById("barFontRight1").innerHTML="${news1.dislikes}";
	    	document.getElementById('imageUpArea1').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea1').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft1").src="images/like.png";
	    	document.getElementById("barImageStyleRight1").src="images/dislike.png";
	    	$("#leftDesc1").hide();
	    	$("#rightDesc1").hide();
	    }else{
	    	document.getElementById("barFontRight1").innerHTML="${news1.likesDown}";
	    	document.getElementById('imageUpArea1').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea1').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft1").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight1").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea1").doubleTap(function() {
	    	userLikesUp1 = !userLikesUp1;
	    	var content=document.getElementById("barFontLeft1").innerHTML;
	    	var likesUp1 = parseInt(content);
	    	if(userLikesUp1){
	    		likesUp1 =likesUp1+1;
	    		document.getElementById('barImageStyleLeft1').src="images/likeEnd.png";
	    		sendUserLike("${news1.id}","likesUp","1");
	    	}else{
				likesUp1 =likesUp1-1;
				document.getElementById('barImageStyleLeft1').src="images/likeStart.png";
				sendUserLike("${news1.id}","likesUp","-1");
			}
	    	if("${news1.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft1').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft1").innerHTML=likesUp1;
        });
	    function changeLikesUp1(){
	    	userLikesUp1 = !userLikesUp1;
	    	var content=document.getElementById("barFontLeft1").innerHTML;
	    	var likesUp1 = parseInt(content);
	    	if(userLikesUp1){
	    		likesUp1 =likesUp1+1;
	    		document.getElementById('barImageStyleLeft1').src="images/likeEnd.png";
	    		sendUserLike("${news1.id}","likesUp","1");
	    	}else{
				likesUp1 =likesUp1-1;
				document.getElementById('barImageStyleLeft1').src="images/likeStart.png";
				sendUserLike("${news1.id}","likesUp","-1");
			}
	    	if("${news1.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft1').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft1").innerHTML=likesUp1;
	    };
	    
	    $("#imageDownArea1").doubleTap(function() {
	    	userLikesDown1 = !userLikesDown1;
	    	var content=document.getElementById("barFontRight1").innerHTML;
	    	var likesDown1 = parseInt(content);
	    	if(userLikesDown1){
	    		likesDown1 =likesDown1+1;
	    		document.getElementById('barImageStyleRight1').src="images/likeEnd.png";
		    	sendUserLike("${news1.id}","likesDown","1");
	    	}else{
	    		likesDown1 =likesDown1-1;
	    		document.getElementById('barImageStyleRight1').src="images/likeStart.png";
	    		sendUserLike("${news1.id}","likesDown","-1");
			}
	    	if("${news1.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight1').src="images/dislike.png";
	    		sendUserLike("${news1.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight1").innerHTML=likesDown1;
        });
	    function changeLikesDown1(){
	    	userLikesDown1 = !userLikesDown1;
	    	var content=document.getElementById("barFontRight1").innerHTML;
	    	var likesDown1 = parseInt(content);
	    	if(userLikesDown1){
	    		likesDown1 =likesDown1+1;
	    		document.getElementById('barImageStyleRight1').src="images/likeEnd.png";
		    	sendUserLike("${news1.id}","likesDown","1");
	    	}else{
	    		likesDown1 =likesDown1-1;
	    		document.getElementById('barImageStyleRight1').src="images/likeStart.png";
	    		sendUserLike("${news1.id}","likesDown","-1");
			}
	    	if("${news1.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight1').src="images/dislike.png";
	    		sendUserLike("${news1.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight1").innerHTML=likesDown1;
	    }
	</script>
	</body>
</html>
