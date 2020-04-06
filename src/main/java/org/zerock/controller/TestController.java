package org.zerock.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.Criteria;
import org.zerock.domain.Number3;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;

//import lombok.AllArgsConstructor;
@RequestMapping("/test/*")//test에서 들어오는 매핑에 반응함
//@AllArgsConstructor// 모든 필드변수가 들어가는 생성자를 만들겠다는뜻(여긴필요없음)
@Controller

@AllArgsConstructor
public class TestController {
	// /test/test2?num1=10&num2=20&num3=30

	private BoardService service;
	@GetMapping("/test35")
	public void list35() {
	}

	@PostMapping("/test36")
	public String list36(String writter, Model model, Criteria cri) {
	
		//model.addAttribute("search_counter", service.search_list(int num1, int num2));
		model.addAttribute("list", service.getList( cri ));
		return "test/test36";
	}
	
	
	
//---------------------------------------------------------------
	
	@GetMapping("/test33")
	public String list33(Model model) {
		model.addAttribute("counter", service.scount());
		model.addAttribute("admin_scounter", service.admin_scount());
		return "test/test33";
	}

	@PostMapping("/test34")
	public String list34(String writter, Model model) {
		System.out.println( "TestController : " + writter );
		model.addAttribute("counter", service.scount());
		model.addAttribute("admin_scounter", service.admin_scount());
		model.addAttribute("inputWritter", writter);
		model.addAttribute("search_counter", service.search_count(writter));
		
		//model.addAttribute("list", service.getList());
		return "test/test34";
	}
	
	
	
//---------------------------------------------------------------
	
	@GetMapping("/test30")
	public String list31(Criteria cri,  Model model) {
		
		model.addAttribute("list", service.getList( cri ));
		model.addAttribute("counter", service.scount());
		model.addAttribute("admin_scounter", service.admin_scount());
		return "test/test30";
	}

//---------------------------------------------------------------
	@GetMapping("/test2")
	public String test2(@RequestParam("num1")String num1,@RequestParam("num2")String num2,@RequestParam("num3")String num3, Model model) {
		//RequestParam이름이랑 준 값이 같으면 RequestParam을 안써도 됨 String아니여도 int도 가능
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("num3",num3);
		return "/test/test2";
	}
//---------------------------------------------------------------	
	//test3을 입력하면 test4로 리다이렉트로 가고
	@GetMapping("/test3")
	public String test3(Number3 number3,RedirectAttributes rttr){		
		rttr.addFlashAttribute("number3",number3);
		return "redirect:test4/";
		}
	// 거기서 test4를 받아서 test2를 모델로 연다.
	@GetMapping("/test4")
	public String test4(Number3 number3, Model model) {
		model.addAttribute("number3",number3);
		return "/test/test2";
	}
	
//---------------------------------------------------------------	
	
	
	//test10을 연다 (jsp아님)
	@GetMapping("/test10")
	public void test10() {
		
	}
	//test11로 post방식으로 보내는법(test10)
	@PostMapping("/test11")
	public void test11(String id,String pw, Model model) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		}
	
	
//---------------------------------------------------------------	
	
	@GetMapping("/test5")
	public void test5() {
		
	}
	@PostMapping("/test6")
	public String test7(int add1, int add2,int result, Model model) {
		result=add1+add2;
		model.addAttribute("add1",add1);
		model.addAttribute("add2",add2);
		model.addAttribute("result",result);
		return "test7";
	}	
	
//---------------------------------------------------------------	
	@GetMapping("/test8")
	public void test8() {
		
	}
	@PostMapping("/test9")
	public String test6(int num1, Model model ) {
		String result = "큽니다.";
		if(num1 > 100 ) {
			model.addAttribute("num1",num1);
			model.addAttribute("resultString",result);
		}else {
			result = "작습니다.";
			model.addAttribute("num1",num1);
			model.addAttribute("resultString",result);			
		}
		return "test/test9";
	}
	
//---------------------------------------------------------------	
	@GetMapping("/test20")
	public void test20() {
		
	}
	@PostMapping("/test20")
	public String test6(int num1, int num2, Model model ) {
		int sum = 0;
		for (int i = num1 ; i <= num2; i++) {
			sum += i;
		}
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("resultString",sum);
		return "test/test21";
	}
	
//---------------------------------------------------------------	
	@GetMapping("/test22")
	public void test22( Model model ) {
		String[] radioArray= { "한식","중식","일식","양식"  };
		String addAttrString[] = null;
		for (int j = 0; j < radioArray.length; j++) {
			addAttrString[j] =  "radioArrayName";    
			model.addAttribute(addAttrString[j] ,radioArray[j]);
		}
			
	}
	
	@PostMapping("/test22")
	public String test22( String num1, Model model ) {
		String strSum ="";
		strSum = num1;
		
		
		model.addAttribute("resultString",strSum);
		return "test/test23";
	}

//---------------------------------------------------------------	

	@PostMapping("/test24")
	public String test24( String[] num1, Model model ) {
		String strSum ="";
		int counter = 0;
		for (int i = 0 ; i < num1.length; i++) {
			System.out.println( num1[i] );
			if(  num1[i] != "" ) {
				strSum = strSum + num1[i] + ",";
				counter += 1 ;
			}
		}
		model.addAttribute("counter",counter);
		model.addAttribute("resultString",strSum);
		return "test/test25";
	}
	
	
}
