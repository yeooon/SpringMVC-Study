<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
h1{
color:#00cbfe;
}
p{
color:#fff;}
img{
width:100%;}
#popup_content_wrap {
width: 100%;
    height: 100%;   
    top: 0;
    left: 0;   
 position: fixed;	
    background: rgba(0, 0, 0, 0.74);
    z-index: 9999999;
}
#popup_content {
    width: 50%;
    height: 300px;
    padding:20px;
	 position: relative;
	top: 15%;
    left: 25%;
    background: #1b100ed9;
    border: 10px solid #00cbfe;  
   
    
}
    </style>
  </head>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  
<div class="col-lg-12">
<div class="row">
<center><h1>This is example of page load popup.....</h1></center>
<hr>
<img src="https://upload.wikimedia.org/wikipedia/commons/8/8d/Yarra_Night_Panorama%2C_Melbourne_-_Feb_2005.jpg">
</div><!---end of row--->
</div><!---end of col-12--->
<!---page load popup_content---->
<div id="popup_content_wrap" style='display:none'>
    <div id="popup_content">
        <center>
             <h1>Page Load popup</h1> 
<hr><hr>			 <p>Lorem ipsum dolor sit amet, onsectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et. Advertise your ads Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut laboreet.</p>
            <input type="submit" name="submit" value="Continue" class="btn btn-primary" onClick="popup_content('hide')" />
        </center>
    </div>
</div>
</html>