<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery.min.js"></script>
<script>
  $(document).ready(function() {
     $('#execute').on('click', function(e){
        e.preventDefault();
        updateData();
     });
     $('#stop').on('click', function(e) {
       e.preventDefault();  
      clearTimeout(timerID); // 타이머 정지 
      $('#showTime').html("");
     })
  });
  

function updateData(){
   $.ajax({
      url:"http://localhost:8090/GetServer",
      type:"get",
      cache:false,
      success:function(data){  //getserver로 요청한  echo의 결과값이  data임
         $('#showTime').html(data);
      }
   });
   timerID=setTimeout("updateData()",2000);// 2초마다 갱신 처리
}

</script>
<title>Insert title here</title>
</head>
<body>
  <p>time: <span id= "showTime"></span></p>
  <input type="button" id="execute" value="실행"/>
  <input type="button" id="stop" value="정지"/>
</body>
</html>