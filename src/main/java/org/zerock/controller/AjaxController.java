package org.zerock.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//GetServer Uri가 get 타입으로 요청되면  초를  텍스트로   응답하는 컨드롤러

@Controller
public class AjaxController {

	@GetMapping("/jQuery/ajax")
	public void ajax() {
		
	}
	
	@GetMapping("/GetServer")
	@ResponseBody
	public String second() {
	    Calendar calendar=Calendar.getInstance();
	    int second=calendar.get(Calendar.SECOND);
	    System.out.println(second);
	    String str=Integer.toString(second);  //현재 시간을  문자열로 만들어준다
	    //google : "스프링 텍스트 보내기"
	    return str;
	    //http://localhost:8090/controller/ 실행 
	    //http://localhost:8090/controller/GetServer 
	}
}
