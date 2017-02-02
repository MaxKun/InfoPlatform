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
		<section data-role="section" id="section-section2">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news2.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news2.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea2" ondblclick="changeLikesUp2()">
				<img id="imageUp2" src="${news2.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news2.content}</span>
			</div>
			<div id="imageDownArea2" ondblclick="changeLikesDown2()">
				<img id="imageDown2" src="${news2.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft2" class="barImageStyleLeft"  onclick="changeLikesUp2()"/>
							<font id="leftDesc2" style="text-align:center;">(${news2.descLeft})</font>
							<font id="barFontLeft2">${news2.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight2" class="barImageStyleRight"  onclick="changeLikesDown2()"/>
							<font id="rightDesc2">(${news2.descRight})</font>
							<font id="barFontRight2">${news2.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news2.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section3">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news3.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news3.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea3" ondblclick="changeLikesUp3()">
				<img id="imageUp3" src="${news3.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news3.content}</span>
			</div>
			<div id="imageDownArea3" ondblclick="changeLikesDown3()">
				<img id="imageDown3" src="${news3.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft3" class="barImageStyleLeft"  onclick="changeLikesUp3()"/>
							<font id="leftDesc3" style="text-align:center;">(${news3.descLeft})</font>
							<font id="barFontLeft3">${news3.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight3" class="barImageStyleRight"  onclick="changeLikesDown3()"/>
							<font id="rightDesc3">(${news3.descRight})</font>
							<font id="barFontRight3">${news3.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news3.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section4">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news4.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news4.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea4" ondblclick="changeLikesUp4()">
				<img id="imageUp4" src="${news4.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news4.content}</span>
			</div>
			<div id="imageDownArea4" ondblclick="changeLikesDown4()">
				<img id="imageDown4" src="${news4.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft4" class="barImageStyleLeft"  onclick="changeLikesUp4()"/>
							<font id="leftDesc4" style="text-align:center;">(${news4.descLeft})</font>
							<font id="barFontLeft4">${news4.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight4" class="barImageStyleRight"  onclick="changeLikesDown4()"/>
							<font id="rightDesc4">(${news4.descRight})</font>
							<font id="barFontRight4">${news4.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news4.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section5">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news5.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news5.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea5" ondblclick="changeLikesUp5()">
				<img id="imageUp5" src="${news5.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news5.content}</span>
			</div>
			<div id="imageDownArea5" ondblclick="changeLikesDown5()">
				<img id="imageDown5" src="${news5.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft5" class="barImageStyleLeft"  onclick="changeLikesUp5()"/>
							<font id="leftDesc5" style="text-align:center;">(${news5.descLeft})</font>
							<font id="barFontLeft5">${news5.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight5" class="barImageStyleRight"  onclick="changeLikesDown5()"/>
							<font id="rightDesc5">(${news5.descRight})</font>
							<font id="barFontRight5">${news5.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news5.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section6">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news6.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news6.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea6" ondblclick="changeLikesUp6()">
				<img id="imageUp6" src="${news6.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news6.content}</span>
			</div>
			<div id="imageDownArea6" ondblclick="changeLikesDown6()">
				<img id="imageDown6" src="${news6.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft6" class="barImageStyleLeft"  onclick="changeLikesUp6()"/>
							<font id="leftDesc6" style="text-align:center;">(${news6.descLeft})</font>
							<font id="barFontLeft6">${news6.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight6" class="barImageStyleRight"  onclick="changeLikesDown6()"/>
							<font id="rightDesc6">(${news6.descRight})</font>
							<font id="barFontRight6">${news6.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news6.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section7">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news7.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news7.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea7" ondblclick="changeLikesUp7()">
				<img id="imageUp7" src="${news7.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news7.content}</span>
			</div>
			<div id="imageDownArea7" ondblclick="changeLikesDown7()">
				<img id="imageDown7" src="${news7.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft7" class="barImageStyleLeft"  onclick="changeLikesUp7()"/>
							<font id="leftDesc7" style="text-align:center;">(${news7.descLeft})</font>
							<font id="barFontLeft7">${news7.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight7" class="barImageStyleRight"  onclick="changeLikesDown7()"/>
							<font id="rightDesc7">(${news7.descRight})</font>
							<font id="barFontRight7">${news7.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news7.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section8">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news8.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news8.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea8" ondblclick="changeLikesUp8()">
				<img id="imageUp8" src="${news8.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news8.content}</span>
			</div>
			<div id="imageDownArea8" ondblclick="changeLikesDown8()">
				<img id="imageDown8" src="${news8.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft8" class="barImageStyleLeft"  onclick="changeLikesUp8()"/>
							<font id="leftDesc8" style="text-align:center;">(${news8.descLeft})</font>
							<font id="barFontLeft8">${news8.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight8" class="barImageStyleRight"  onclick="changeLikesDown8()"/>
							<font id="rightDesc8">(${news8.descRight})</font>
							<font id="barFontRight8">${news8.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news8.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section9">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news9.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news9.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea9" ondblclick="changeLikesUp9()">
				<img id="imageUp9" src="${news9.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news9.content}</span>
			</div>
			<div id="imageDownArea9" ondblclick="changeLikesDown9()">
				<img id="imageDown9" src="${news9.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft9" class="barImageStyleLeft"  onclick="changeLikesUp9()"/>
							<font id="leftDesc9" style="text-align:center;">(${news9.descLeft})</font>
							<font id="barFontLeft9">${news9.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight9" class="barImageStyleRight"  onclick="changeLikesDown9()"/>
							<font id="rightDesc9">(${news9.descRight})</font>
							<font id="barFontRight9">${news9.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news9.id}&username=${username}&userImage=${userImage}&userId=${userId}">
							<img class="barImageStyle" src="images/comment.png" /></a>
						</td>
					</tr>
				</table>
			</div>
		</section>
		<section data-role="section" id="section-section10">
			<div class="titleDiv">
				<table class="tableStyle">
					<tr class="tableTrStyle">
						<td class="titleTdStyle">
							<img id="titleImg" src="${news10.channelPic}" class="titleImageStyle" alt="出自"/>
						</td>
						<td>
							<font>${news10.channelName}</font>
						</td>
					</tr>
				</table>
			</div>
			
			<div id="imageUpArea10" ondblclick="changeLikesUp10()">
				<img id="imageUp10" src="${news10.picUp}" class="imageStyle" alt="imageUp"/>
				<span class="textSpan">${news10.content}</span>
			</div>
			<div id="imageDownArea10" ondblclick="changeLikesDown10()">
				<img id="imageDown10" src="${news10.picDown}" class="imageStyle" alt="imageDown"/>
			</div>
			
			<div class="barDiv">
				<table class="tableStyle">
					<tr class="barTitleDiv">
						<td class="downsideTdLeft" align="center" >
							<img id="barImageStyleLeft10" class="barImageStyleLeft"  onclick="changeLikesUp10()"/>
							<font id="leftDesc10" style="text-align:center;">(${news10.descLeft})</font>
							<font id="barFontLeft10">${news10.likesUp}</font>
							<font>:</font>
							<img id="barImageStyleRight10" class="barImageStyleRight"  onclick="changeLikesDown10()"/>
							<font id="rightDesc10">(${news10.descRight})</font>
							<font id="barFontRight10">${news10.likesDown}</font>
						</td>
						<td class="downsideTdRight" align="center" >
							<a href="getComment.htm?newsId=${news10.id}&username=${username}&userImage=${userImage}&userId=${userId}">
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
	    
	    var userLikesUp2 = false;
	    var userLikesDown2 = false;
	    if("${news2.type}"=="topicnews"){
	    	document.getElementById("barFontRight2").innerHTML="${news2.dislikes}";
	    	document.getElementById('imageUpArea2').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea2').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft2").src="images/like.png";
	    	document.getElementById("barImageStyleRight2").src="images/dislike.png";
	    	$("#leftDesc2").hide();
	    	$("#rightDesc2").hide();
	    }else{
	    	document.getElementById("barFontRight2").innerHTML="${news2.likesDown}";
	    	document.getElementById('imageUpArea2').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea2').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft2").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight2").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea2").doubleTap(function() {
	    	userLikesUp2 = !userLikesUp2;
	    	var content=document.getElementById("barFontLeft2").innerHTML;
	    	var likesUp2 = parseInt(content);
	    	if(userLikesUp2){
	    		likesUp2 =likesUp2+1;
	    		document.getElementById('barImageStyleLeft2').src="images/likeEnd.png";
	    		sendUserLike("${news2.id}","likesUp","1");
	    	}else{
				likesUp2 =likesUp2-1;
				document.getElementById('barImageStyleLeft2').src="images/likeStart.png";
				sendUserLike("${news2.id}","likesUp","-1");
			}
	    	if("${news2.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft2').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft2").innerHTML=likesUp2;
        });
	    function changeLikesUp2(){
	    	userLikesUp2 = !userLikesUp2;
	    	var content=document.getElementById("barFontLeft2").innerHTML;
	    	var likesUp2 = parseInt(content);
	    	if(userLikesUp2){
	    		likesUp2 =likesUp2+1;
	    		document.getElementById('barImageStyleLeft2').src="images/likeEnd.png";
	    		sendUserLike("${news2.id}","likesUp","1");
	    	}else{
				likesUp2 =likesUp2-1;
				document.getElementById('barImageStyleLeft2').src="images/likeStart.png";
				sendUserLike("${news2.id}","likesUp","-1");
			}
	    	if("${news2.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft2').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft2").innerHTML=likesUp2;
	    };
	    
	    $("#imageDownArea2").doubleTap(function() {
	    	userLikesDown2 = !userLikesDown2;
	    	var content=document.getElementById("barFontRight2").innerHTML;
	    	var likesDown2 = parseInt(content);
	    	if(userLikesDown2){
	    		likesDown2 =likesDown2+1;
	    		document.getElementById('barImageStyleRight2').src="images/likeEnd.png";
		    	sendUserLike("${news2.id}","likesDown","1");
	    	}else{
	    		likesDown2 =likesDown2-1;
	    		document.getElementById('barImageStyleRight2').src="images/likeStart.png";
	    		sendUserLike("${news2.id}","likesDown","-1");
			}
	    	if("${news2.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight2').src="images/dislike.png";
	    		sendUserLike("${news2.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight2").innerHTML=likesDown2;
        });
	    function changeLikesDown2(){
	    	userLikesDown2 = !userLikesDown2;
	    	var content=document.getElementById("barFontRight2").innerHTML;
	    	var likesDown2 = parseInt(content);
	    	if(userLikesDown2){
	    		likesDown2 =likesDown2+1;
	    		document.getElementById('barImageStyleRight2').src="images/likeEnd.png";
		    	sendUserLike("${news2.id}","likesDown","1");
	    	}else{
	    		likesDown2 =likesDown2-1;
	    		document.getElementById('barImageStyleRight2').src="images/likeStart.png";
	    		sendUserLike("${news2.id}","likesDown","-1");
			}
	    	if("${news2.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight2').src="images/dislike.png";
	    		sendUserLike("${news2.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight2").innerHTML=likesDown2;
	    }
	    
	    var userLikesUp3 = false;
	    var userLikesDown3 = false;
	    if("${news3.type}"=="topicnews"){
	    	document.getElementById("barFontRight3").innerHTML="${news3.dislikes}";
	    	document.getElementById('imageUpArea3').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea3').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft3").src="images/like.png";
	    	document.getElementById("barImageStyleRight3").src="images/dislike.png";
	    	$("#leftDesc3").hide();
	    	$("#rightDesc3").hide();
	    }else{
	    	document.getElementById("barFontRight3").innerHTML="${news3.likesDown}";
	    	document.getElementById('imageUpArea3').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea3').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft3").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight3").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea3").doubleTap(function() {
	    	userLikesUp3 = !userLikesUp3;
	    	var content=document.getElementById("barFontLeft3").innerHTML;
	    	var likesUp3 = parseInt(content);
	    	if(userLikesUp3){
	    		likesUp3 =likesUp3+1;
	    		document.getElementById('barImageStyleLeft3').src="images/likeEnd.png";
	    		sendUserLike("${news3.id}","likesUp","1");
	    	}else{
				likesUp3 =likesUp3-1;
				document.getElementById('barImageStyleLeft3').src="images/likeStart.png";
				sendUserLike("${news3.id}","likesUp","-1");
			}
	    	if("${news3.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft3').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft3").innerHTML=likesUp3;
        });
	    function changeLikesUp3(){
	    	userLikesUp3 = !userLikesUp3;
	    	var content=document.getElementById("barFontLeft3").innerHTML;
	    	var likesUp3 = parseInt(content);
	    	if(userLikesUp3){
	    		likesUp3 =likesUp3+1;
	    		document.getElementById('barImageStyleLeft3').src="images/likeEnd.png";
	    		sendUserLike("${news3.id}","likesUp","1");
	    	}else{
				likesUp3 =likesUp3-1;
				document.getElementById('barImageStyleLeft3').src="images/likeStart.png";
				sendUserLike("${news3.id}","likesUp","-1");
			}
	    	if("${news3.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft3').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft3").innerHTML=likesUp3;
	    };
	    
	    $("#imageDownArea3").doubleTap(function() {
	    	userLikesDown3 = !userLikesDown3;
	    	var content=document.getElementById("barFontRight3").innerHTML;
	    	var likesDown3 = parseInt(content);
	    	if(userLikesDown3){
	    		likesDown3 =likesDown3+1;
	    		document.getElementById('barImageStyleRight3').src="images/likeEnd.png";
		    	sendUserLike("${news3.id}","likesDown","1");
	    	}else{
	    		likesDown3 =likesDown3-1;
	    		document.getElementById('barImageStyleRight3').src="images/likeStart.png";
	    		sendUserLike("${news3.id}","likesDown","-1");
			}
	    	if("${news3.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight3').src="images/dislike.png";
	    		sendUserLike("${news3.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight3").innerHTML=likesDown3;
        });
	    function changeLikesDown3(){
	    	userLikesDown3 = !userLikesDown3;
	    	var content=document.getElementById("barFontRight3").innerHTML;
	    	var likesDown3 = parseInt(content);
	    	if(userLikesDown3){
	    		likesDown3 =likesDown3+1;
	    		document.getElementById('barImageStyleRight3').src="images/likeEnd.png";
		    	sendUserLike("${news3.id}","likesDown","1");
	    	}else{
	    		likesDown3 =likesDown3-1;
	    		document.getElementById('barImageStyleRight3').src="images/likeStart.png";
	    		sendUserLike("${news3.id}","likesDown","-1");
			}
	    	if("${news3.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight3').src="images/dislike.png";
	    		sendUserLike("${news3.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight3").innerHTML=likesDown3;
	    }
	    
	    var userLikesUp4 = false;
	    var userLikesDown4 = false;
	    if("${news4.type}"=="topicnews"){
	    	document.getElementById("barFontRight4").innerHTML="${news4.dislikes}";
	    	document.getElementById('imageUpArea4').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea4').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft4").src="images/like.png";
	    	document.getElementById("barImageStyleRight4").src="images/dislike.png";
	    	$("#leftDesc4").hide();
	    	$("#rightDesc4").hide();
	    }else{
	    	document.getElementById("barFontRight4").innerHTML="${news4.likesDown}";
	    	document.getElementById('imageUpArea4').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea4').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft4").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight4").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea4").doubleTap(function() {
	    	userLikesUp4 = !userLikesUp4;
	    	var content=document.getElementById("barFontLeft4").innerHTML;
	    	var likesUp4 = parseInt(content);
	    	if(userLikesUp4){
	    		likesUp4 =likesUp4+1;
	    		document.getElementById('barImageStyleLeft4').src="images/likeEnd.png";
	    		sendUserLike("${news4.id}","likesUp","1");
	    	}else{
				likesUp4 =likesUp4-1;
				document.getElementById('barImageStyleLeft4').src="images/likeStart.png";
				sendUserLike("${news4.id}","likesUp","-1");
			}
	    	if("${news4.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft4').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft4").innerHTML=likesUp4;
        });
	    function changeLikesUp4(){
	    	userLikesUp4 = !userLikesUp4;
	    	var content=document.getElementById("barFontLeft4").innerHTML;
	    	var likesUp4 = parseInt(content);
	    	if(userLikesUp4){
	    		likesUp4 =likesUp4+1;
	    		document.getElementById('barImageStyleLeft4').src="images/likeEnd.png";
	    		sendUserLike("${news4.id}","likesUp","1");
	    	}else{
				likesUp4 =likesUp4-1;
				document.getElementById('barImageStyleLeft4').src="images/likeStart.png";
				sendUserLike("${news4.id}","likesUp","-1");
			}
	    	if("${news4.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft4').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft4").innerHTML=likesUp4;
	    };
	    
	    $("#imageDownArea4").doubleTap(function() {
	    	userLikesDown4 = !userLikesDown4;
	    	var content=document.getElementById("barFontRight4").innerHTML;
	    	var likesDown4 = parseInt(content);
	    	if(userLikesDown4){
	    		likesDown4 =likesDown4+1;
	    		document.getElementById('barImageStyleRight4').src="images/likeEnd.png";
		    	sendUserLike("${news4.id}","likesDown","1");
	    	}else{
	    		likesDown4 =likesDown4-1;
	    		document.getElementById('barImageStyleRight4').src="images/likeStart.png";
	    		sendUserLike("${news4.id}","likesDown","-1");
			}
	    	if("${news4.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight4').src="images/dislike.png";
	    		sendUserLike("${news4.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight4").innerHTML=likesDown4;
        });
	    function changeLikesDown4(){
	    	userLikesDown4 = !userLikesDown4;
	    	var content=document.getElementById("barFontRight4").innerHTML;
	    	var likesDown4 = parseInt(content);
	    	if(userLikesDown4){
	    		likesDown4 =likesDown4+1;
	    		document.getElementById('barImageStyleRight4').src="images/likeEnd.png";
		    	sendUserLike("${news4.id}","likesDown","1");
	    	}else{
	    		likesDown4 =likesDown4-1;
	    		document.getElementById('barImageStyleRight4').src="images/likeStart.png";
	    		sendUserLike("${news4.id}","likesDown","-1");
			}
	    	if("${news4.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight4').src="images/dislike.png";
	    		sendUserLike("${news4.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight4").innerHTML=likesDown4;
	    }
	    
	    var userLikesUp5 = false;
	    var userLikesDown5 = false;
	    if("${news5.type}"=="topicnews"){
	    	document.getElementById("barFontRight5").innerHTML="${news5.dislikes}";
	    	document.getElementById('imageUpArea5').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea5').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft5").src="images/like.png";
	    	document.getElementById("barImageStyleRight5").src="images/dislike.png";
	    	$("#leftDesc5").hide();
	    	$("#rightDesc5").hide();
	    }else{
	    	document.getElementById("barFontRight5").innerHTML="${news5.likesDown}";
	    	document.getElementById('imageUpArea5').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea5').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft5").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight5").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea5").doubleTap(function() {
	    	userLikesUp5 = !userLikesUp5;
	    	var content=document.getElementById("barFontLeft5").innerHTML;
	    	var likesUp5 = parseInt(content);
	    	if(userLikesUp5){
	    		likesUp5 =likesUp5+1;
	    		document.getElementById('barImageStyleLeft5').src="images/likeEnd.png";
	    		sendUserLike("${news5.id}","likesUp","1");
	    	}else{
				likesUp5 =likesUp5-1;
				document.getElementById('barImageStyleLeft5').src="images/likeStart.png";
				sendUserLike("${news5.id}","likesUp","-1");
			}
	    	if("${news5.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft5').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft5").innerHTML=likesUp5;
        });
	    function changeLikesUp5(){
	    	userLikesUp5 = !userLikesUp5;
	    	var content=document.getElementById("barFontLeft5").innerHTML;
	    	var likesUp5 = parseInt(content);
	    	if(userLikesUp5){
	    		likesUp5 =likesUp5+1;
	    		document.getElementById('barImageStyleLeft5').src="images/likeEnd.png";
	    		sendUserLike("${news5.id}","likesUp","1");
	    	}else{
				likesUp5 =likesUp5-1;
				document.getElementById('barImageStyleLeft5').src="images/likeStart.png";
				sendUserLike("${news5.id}","likesUp","-1");
			}
	    	if("${news5.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft5').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft5").innerHTML=likesUp5;
	    };
	    
	    $("#imageDownArea5").doubleTap(function() {
	    	userLikesDown5 = !userLikesDown5;
	    	var content=document.getElementById("barFontRight5").innerHTML;
	    	var likesDown5 = parseInt(content);
	    	if(userLikesDown5){
	    		likesDown5 =likesDown5+1;
	    		document.getElementById('barImageStyleRight5').src="images/likeEnd.png";
		    	sendUserLike("${news5.id}","likesDown","1");
	    	}else{
	    		likesDown5 =likesDown5-1;
	    		document.getElementById('barImageStyleRight5').src="images/likeStart.png";
	    		sendUserLike("${news5.id}","likesDown","-1");
			}
	    	if("${news5.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight5').src="images/dislike.png";
	    		sendUserLike("${news5.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight5").innerHTML=likesDown5;
        });
	    function changeLikesDown5(){
	    	userLikesDown5 = !userLikesDown5;
	    	var content=document.getElementById("barFontRight5").innerHTML;
	    	var likesDown5 = parseInt(content);
	    	if(userLikesDown5){
	    		likesDown5 =likesDown5+1;
	    		document.getElementById('barImageStyleRight5').src="images/likeEnd.png";
		    	sendUserLike("${news5.id}","likesDown","1");
	    	}else{
	    		likesDown5 =likesDown5-1;
	    		document.getElementById('barImageStyleRight5').src="images/likeStart.png";
	    		sendUserLike("${news5.id}","likesDown","-1");
			}
	    	if("${news5.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight5').src="images/dislike.png";
	    		sendUserLike("${news5.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight5").innerHTML=likesDown5;
	    }
	    
	    var userLikesUp6 = false;
	    var userLikesDown6 = false;
	    if("${news6.type}"=="topicnews"){
	    	document.getElementById("barFontRight6").innerHTML="${news6.dislikes}";
	    	document.getElementById('imageUpArea6').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea6').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft6").src="images/like.png";
	    	document.getElementById("barImageStyleRight6").src="images/dislike.png";
	    	$("#leftDesc6").hide();
	    	$("#rightDesc6").hide();
	    }else{
	    	document.getElementById("barFontRight6").innerHTML="${news6.likesDown}";
	    	document.getElementById('imageUpArea6').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea6').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft6").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight6").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea6").doubleTap(function() {
	    	userLikesUp6 = !userLikesUp6;
	    	var content=document.getElementById("barFontLeft6").innerHTML;
	    	var likesUp6 = parseInt(content);
	    	if(userLikesUp6){
	    		likesUp6 =likesUp6+1;
	    		document.getElementById('barImageStyleLeft6').src="images/likeEnd.png";
	    		sendUserLike("${news6.id}","likesUp","1");
	    	}else{
				likesUp6 =likesUp6-1;
				document.getElementById('barImageStyleLeft6').src="images/likeStart.png";
				sendUserLike("${news6.id}","likesUp","-1");
			}
	    	if("${news6.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft6').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft6").innerHTML=likesUp6;
        });
	    function changeLikesUp6(){
	    	userLikesUp6 = !userLikesUp6;
	    	var content=document.getElementById("barFontLeft6").innerHTML;
	    	var likesUp6 = parseInt(content);
	    	if(userLikesUp6){
	    		likesUp6 =likesUp6+1;
	    		document.getElementById('barImageStyleLeft6').src="images/likeEnd.png";
	    		sendUserLike("${news6.id}","likesUp","1");
	    	}else{
				likesUp6 =likesUp6-1;
				document.getElementById('barImageStyleLeft6').src="images/likeStart.png";
				sendUserLike("${news6.id}","likesUp","-1");
			}
	    	if("${news6.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft6').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft6").innerHTML=likesUp6;
	    };
	    
	    $("#imageDownArea6").doubleTap(function() {
	    	userLikesDown6 = !userLikesDown6;
	    	var content=document.getElementById("barFontRight6").innerHTML;
	    	var likesDown6 = parseInt(content);
	    	if(userLikesDown6){
	    		likesDown6 =likesDown6+1;
	    		document.getElementById('barImageStyleRight6').src="images/likeEnd.png";
		    	sendUserLike("${news6.id}","likesDown","1");
	    	}else{
	    		likesDown6 =likesDown6-1;
	    		document.getElementById('barImageStyleRight6').src="images/likeStart.png";
	    		sendUserLike("${news6.id}","likesDown","-1");
			}
	    	if("${news6.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight6').src="images/dislike.png";
	    		sendUserLike("${news6.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight6").innerHTML=likesDown6;
        });
	    function changeLikesDown6(){
	    	userLikesDown6 = !userLikesDown6;
	    	var content=document.getElementById("barFontRight6").innerHTML;
	    	var likesDown6 = parseInt(content);
	    	if(userLikesDown6){
	    		likesDown6 =likesDown6+1;
	    		document.getElementById('barImageStyleRight6').src="images/likeEnd.png";
		    	sendUserLike("${news6.id}","likesDown","1");
	    	}else{
	    		likesDown6 =likesDown6-1;
	    		document.getElementById('barImageStyleRight6').src="images/likeStart.png";
	    		sendUserLike("${news6.id}","likesDown","-1");
			}
	    	if("${news6.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight6').src="images/dislike.png";
	    		sendUserLike("${news6.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight6").innerHTML=likesDown6;
	    }
	    
	    var userLikesUp7 = false;
	    var userLikesDown7 = false;
	    if("${news7.type}"=="topicnews"){
	    	document.getElementById("barFontRight7").innerHTML="${news7.dislikes}";
	    	document.getElementById('imageUpArea7').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea7').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft7").src="images/like.png";
	    	document.getElementById("barImageStyleRight7").src="images/dislike.png";
	    	$("#leftDesc7").hide();
	    	$("#rightDesc7").hide();
	    }else{
	    	document.getElementById("barFontRight7").innerHTML="${news7.likesDown}";
	    	document.getElementById('imageUpArea7').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea7').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft7").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight7").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea7").doubleTap(function() {
	    	userLikesUp7 = !userLikesUp7;
	    	var content=document.getElementById("barFontLeft7").innerHTML;
	    	var likesUp7 = parseInt(content);
	    	if(userLikesUp7){
	    		likesUp7 =likesUp7+1;
	    		document.getElementById('barImageStyleLeft7').src="images/likeEnd.png";
	    		sendUserLike("${news7.id}","likesUp","1");
	    	}else{
				likesUp7 =likesUp7-1;
				document.getElementById('barImageStyleLeft7').src="images/likeStart.png";
				sendUserLike("${news7.id}","likesUp","-1");
			}
	    	if("${news7.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft7').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft7").innerHTML=likesUp7;
        });
	    function changeLikesUp7(){
	    	userLikesUp7 = !userLikesUp7;
	    	var content=document.getElementById("barFontLeft7").innerHTML;
	    	var likesUp7 = parseInt(content);
	    	if(userLikesUp7){
	    		likesUp7 =likesUp7+1;
	    		document.getElementById('barImageStyleLeft7').src="images/likeEnd.png";
	    		sendUserLike("${news7.id}","likesUp","1");
	    	}else{
				likesUp7 =likesUp7-1;
				document.getElementById('barImageStyleLeft7').src="images/likeStart.png";
				sendUserLike("${news7.id}","likesUp","-1");
			}
	    	if("${news7.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft7').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft7").innerHTML=likesUp7;
	    };
	    
	    $("#imageDownArea7").doubleTap(function() {
	    	userLikesDown7 = !userLikesDown7;
	    	var content=document.getElementById("barFontRight7").innerHTML;
	    	var likesDown7 = parseInt(content);
	    	if(userLikesDown7){
	    		likesDown7 =likesDown7+1;
	    		document.getElementById('barImageStyleRight7').src="images/likeEnd.png";
		    	sendUserLike("${news7.id}","likesDown","1");
	    	}else{
	    		likesDown7 =likesDown7-1;
	    		document.getElementById('barImageStyleRight7').src="images/likeStart.png";
	    		sendUserLike("${news7.id}","likesDown","-1");
			}
	    	if("${news7.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight7').src="images/dislike.png";
	    		sendUserLike("${news7.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight7").innerHTML=likesDown7;
        });
	    function changeLikesDown7(){
	    	userLikesDown7 = !userLikesDown7;
	    	var content=document.getElementById("barFontRight7").innerHTML;
	    	var likesDown7 = parseInt(content);
	    	if(userLikesDown7){
	    		likesDown7 =likesDown7+1;
	    		document.getElementById('barImageStyleRight7').src="images/likeEnd.png";
		    	sendUserLike("${news7.id}","likesDown","1");
	    	}else{
	    		likesDown7 =likesDown7-1;
	    		document.getElementById('barImageStyleRight7').src="images/likeStart.png";
	    		sendUserLike("${news7.id}","likesDown","-1");
			}
	    	if("${news7.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight7').src="images/dislike.png";
	    		sendUserLike("${news7.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight7").innerHTML=likesDown7;
	    }
	    
	    var userLikesUp8 = false;
	    var userLikesDown8 = false;
	    if("${news8.type}"=="topicnews"){
	    	document.getElementById("barFontRight8").innerHTML="${news8.dislikes}";
	    	document.getElementById('imageUpArea8').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea8').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft8").src="images/like.png";
	    	document.getElementById("barImageStyleRight8").src="images/dislike.png";
	    	$("#leftDesc8").hide();
	    	$("#rightDesc8").hide();
	    }else{
	    	document.getElementById("barFontRight8").innerHTML="${news8.likesDown}";
	    	document.getElementById('imageUpArea8').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea8').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft8").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight8").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea8").doubleTap(function() {
	    	userLikesUp8 = !userLikesUp8;
	    	var content=document.getElementById("barFontLeft8").innerHTML;
	    	var likesUp8 = parseInt(content);
	    	if(userLikesUp8){
	    		likesUp8 =likesUp8+1;
	    		document.getElementById('barImageStyleLeft8').src="images/likeEnd.png";
	    		sendUserLike("${news8.id}","likesUp","1");
	    	}else{
				likesUp8 =likesUp8-1;
				document.getElementById('barImageStyleLeft8').src="images/likeStart.png";
				sendUserLike("${news8.id}","likesUp","-1");
			}
	    	if("${news8.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft8').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft8").innerHTML=likesUp8;
        });
	    function changeLikesUp8(){
	    	userLikesUp8 = !userLikesUp8;
	    	var content=document.getElementById("barFontLeft8").innerHTML;
	    	var likesUp8 = parseInt(content);
	    	if(userLikesUp8){
	    		likesUp8 =likesUp8+1;
	    		document.getElementById('barImageStyleLeft8').src="images/likeEnd.png";
	    		sendUserLike("${news8.id}","likesUp","1");
	    	}else{
				likesUp8 =likesUp8-1;
				document.getElementById('barImageStyleLeft8').src="images/likeStart.png";
				sendUserLike("${news8.id}","likesUp","-1");
			}
	    	if("${news8.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft8').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft8").innerHTML=likesUp8;
	    };
	    
	    $("#imageDownArea8").doubleTap(function() {
	    	userLikesDown8 = !userLikesDown8;
	    	var content=document.getElementById("barFontRight8").innerHTML;
	    	var likesDown8 = parseInt(content);
	    	if(userLikesDown8){
	    		likesDown8 =likesDown8+1;
	    		document.getElementById('barImageStyleRight8').src="images/likeEnd.png";
		    	sendUserLike("${news8.id}","likesDown","1");
	    	}else{
	    		likesDown8 =likesDown8-1;
	    		document.getElementById('barImageStyleRight8').src="images/likeStart.png";
	    		sendUserLike("${news8.id}","likesDown","-1");
			}
	    	if("${news8.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight8').src="images/dislike.png";
	    		sendUserLike("${news8.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight8").innerHTML=likesDown8;
        });
	    function changeLikesDown8(){
	    	userLikesDown8 = !userLikesDown8;
	    	var content=document.getElementById("barFontRight8").innerHTML;
	    	var likesDown8 = parseInt(content);
	    	if(userLikesDown8){
	    		likesDown8 =likesDown8+1;
	    		document.getElementById('barImageStyleRight8').src="images/likeEnd.png";
		    	sendUserLike("${news8.id}","likesDown","1");
	    	}else{
	    		likesDown8 =likesDown8-1;
	    		document.getElementById('barImageStyleRight8').src="images/likeStart.png";
	    		sendUserLike("${news8.id}","likesDown","-1");
			}
	    	if("${news8.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight8').src="images/dislike.png";
	    		sendUserLike("${news8.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight8").innerHTML=likesDown8;
	    }
	    
	    var userLikesUp9 = false;
	    var userLikesDown9 = false;
	    if("${news9.type}"=="topicnews"){
	    	document.getElementById("barFontRight9").innerHTML="${news9.dislikes}";
	    	document.getElementById('imageUpArea9').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea9').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft9").src="images/like.png";
	    	document.getElementById("barImageStyleRight9").src="images/dislike.png";
	    	$("#leftDesc9").hide();
	    	$("#rightDesc9").hide();
	    }else{
	    	document.getElementById("barFontRight9").innerHTML="${news9.likesDown}";
	    	document.getElementById('imageUpArea9').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea9').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft9").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight9").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea9").doubleTap(function() {
	    	userLikesUp9 = !userLikesUp9;
	    	var content=document.getElementById("barFontLeft9").innerHTML;
	    	var likesUp9 = parseInt(content);
	    	if(userLikesUp9){
	    		likesUp9 =likesUp9+1;
	    		document.getElementById('barImageStyleLeft9').src="images/likeEnd.png";
	    		sendUserLike("${news9.id}","likesUp","1");
	    	}else{
				likesUp9 =likesUp9-1;
				document.getElementById('barImageStyleLeft9').src="images/likeStart.png";
				sendUserLike("${news9.id}","likesUp","-1");
			}
	    	if("${news9.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft9').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft9").innerHTML=likesUp9;
        });
	    function changeLikesUp9(){
	    	userLikesUp9 = !userLikesUp9;
	    	var content=document.getElementById("barFontLeft9").innerHTML;
	    	var likesUp9 = parseInt(content);
	    	if(userLikesUp9){
	    		likesUp9 =likesUp9+1;
	    		document.getElementById('barImageStyleLeft9').src="images/likeEnd.png";
	    		sendUserLike("${news9.id}","likesUp","1");
	    	}else{
				likesUp9 =likesUp9-1;
				document.getElementById('barImageStyleLeft9').src="images/likeStart.png";
				sendUserLike("${news9.id}","likesUp","-1");
			}
	    	if("${news9.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft9').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft9").innerHTML=likesUp9;
	    };
	    
	    $("#imageDownArea9").doubleTap(function() {
	    	userLikesDown9 = !userLikesDown9;
	    	var content=document.getElementById("barFontRight9").innerHTML;
	    	var likesDown9 = parseInt(content);
	    	if(userLikesDown9){
	    		likesDown9 =likesDown9+1;
	    		document.getElementById('barImageStyleRight9').src="images/likeEnd.png";
		    	sendUserLike("${news9.id}","likesDown","1");
	    	}else{
	    		likesDown9 =likesDown9-1;
	    		document.getElementById('barImageStyleRight9').src="images/likeStart.png";
	    		sendUserLike("${news9.id}","likesDown","-1");
			}
	    	if("${news9.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight9').src="images/dislike.png";
	    		sendUserLike("${news9.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight9").innerHTML=likesDown9;
        });
	    function changeLikesDown9(){
	    	userLikesDown9 = !userLikesDown9;
	    	var content=document.getElementById("barFontRight9").innerHTML;
	    	var likesDown9 = parseInt(content);
	    	if(userLikesDown9){
	    		likesDown9 =likesDown9+1;
	    		document.getElementById('barImageStyleRight9').src="images/likeEnd.png";
		    	sendUserLike("${news9.id}","likesDown","1");
	    	}else{
	    		likesDown9 =likesDown9-1;
	    		document.getElementById('barImageStyleRight9').src="images/likeStart.png";
	    		sendUserLike("${news9.id}","likesDown","-1");
			}
	    	if("${news9.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight9').src="images/dislike.png";
	    		sendUserLike("${news9.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight9").innerHTML=likesDown9;
	    }
	    
	    var userLikesUp10 = false;
	    var userLikesDown10 = false;
	    if("${news10.type}"=="topicnews"){
	    	document.getElementById("barFontRight10").innerHTML="${news10.dislikes}";
	    	document.getElementById('imageUpArea10').setAttribute("class", "imageUpAreaNews");
	    	document.getElementById('imageDownArea10').setAttribute("class", "imageDownAreaNews");
	    	document.getElementById("barImageStyleLeft10").src="images/like.png";
	    	document.getElementById("barImageStyleRight10").src="images/dislike.png";
	    	$("#leftDesc10").hide();
	    	$("#rightDesc10").hide();
	    }else{
	    	document.getElementById("barFontRight10").innerHTML="${news10.likesDown}";
	    	document.getElementById('imageUpArea10').setAttribute("class", "imageAreaChoice");
	    	document.getElementById('imageDownArea10').setAttribute("class", "imageAreaChoice");
	    	document.getElementById("barImageStyleLeft10").src="images/likeStart.png";
	    	document.getElementById("barImageStyleRight10").src="images/likeStart.png";
	    }
	    
	    $("#imageUpArea10").doubleTap(function() {
	    	userLikesUp10 = !userLikesUp10;
	    	var content=document.getElementById("barFontLeft10").innerHTML;
	    	var likesUp10 = parseInt(content);
	    	if(userLikesUp10){
	    		likesUp10 =likesUp10+1;
	    		document.getElementById('barImageStyleLeft10').src="images/likeEnd.png";
	    		sendUserLike("${news10.id}","likesUp","1");
	    	}else{
				likesUp10 =likesUp10-1;
				document.getElementById('barImageStyleLeft10').src="images/likeStart.png";
				sendUserLike("${news10.id}","likesUp","-1");
			}
	    	if("${news10.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft10').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft10").innerHTML=likesUp10;
        });
	    function changeLikesUp10(){
	    	userLikesUp10 = !userLikesUp10;
	    	var content=document.getElementById("barFontLeft10").innerHTML;
	    	var likesUp10 = parseInt(content);
	    	if(userLikesUp10){
	    		likesUp10 =likesUp10+1;
	    		document.getElementById('barImageStyleLeft10').src="images/likeEnd.png";
	    		sendUserLike("${news10.id}","likesUp","1");
	    	}else{
				likesUp10 =likesUp10-1;
				document.getElementById('barImageStyleLeft10').src="images/likeStart.png";
				sendUserLike("${news10.id}","likesUp","-1");
			}
	    	if("${news10.type}"=="topicnews"){
	    		document.getElementById('barImageStyleLeft10').src="images/like.png";
	    	}
	    	document.getElementById("barFontLeft10").innerHTML=likesUp10;
	    };
	    
	    $("#imageDownArea10").doubleTap(function() {
	    	userLikesDown10 = !userLikesDown10;
	    	var content=document.getElementById("barFontRight10").innerHTML;
	    	var likesDown10 = parseInt(content);
	    	if(userLikesDown10){
	    		likesDown10 =likesDown10+1;
	    		document.getElementById('barImageStyleRight10').src="images/likeEnd.png";
		    	sendUserLike("${news10.id}","likesDown","1");
	    	}else{
	    		likesDown10 =likesDown10-1;
	    		document.getElementById('barImageStyleRight10').src="images/likeStart.png";
	    		sendUserLike("${news10.id}","likesDown","-1");
			}
	    	if("${news10.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight10').src="images/dislike.png";
	    		sendUserLike("${news10.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight10").innerHTML=likesDown10;
        });
	    function changeLikesDown10(){
	    	userLikesDown10 = !userLikesDown10;
	    	var content=document.getElementById("barFontRight10").innerHTML;
	    	var likesDown10 = parseInt(content);
	    	if(userLikesDown10){
	    		likesDown10 =likesDown10+1;
	    		document.getElementById('barImageStyleRight10').src="images/likeEnd.png";
		    	sendUserLike("${news10.id}","likesDown","1");
	    	}else{
	    		likesDown10 =likesDown10-1;
	    		document.getElementById('barImageStyleRight10').src="images/likeStart.png";
	    		sendUserLike("${news10.id}","likesDown","-1");
			}
	    	if("${news10.type}"=="topicnews"){
	    		document.getElementById('barImageStyleRight10').src="images/dislike.png";
	    		sendUserLike("${news10.id}","dislike","1");
	    	}
	    	document.getElementById("barFontRight10").innerHTML=likesDown10;
	    }
	    
	</script>
	</body>
</html>
