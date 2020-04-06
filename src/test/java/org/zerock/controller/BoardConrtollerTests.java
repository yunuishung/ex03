package org.zerock.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"}) 
@Log4j
public class BoardConrtollerTests {
	
	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
//	java.lang.Exception: No tests found matching [{ExactMatcher:fDisplayName=setup], 
//	{ExactMatcher:fDisplayName=setup(org.zerock.controller.BoardConrtollerTests)], 
//	{LeadingIdentifierMatcher:fClassName=org.zerock.controller.BoardConrtollerTests,fLeadingIdentifier=setup]] 
//			from org.junit.internal.requests.ClassRequest@3e9b1010
//	at org.junit.internal.requests.FilterRequest.getRunner(FilterRequest.java:40)
//	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestLoader.createFilteredTest(JUnit4TestLoader.java:83)
//	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestLoader.createTest(JUnit4TestLoader.java:74)
//	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestLoader.loadTests(JUnit4TestLoader.java:49)
//	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:525)
//	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
//	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
//	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)

		
	
	@Test
	public void testRegister() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "AAA테스트 글제목").param("content","테스트 글내용")
				.param("writer","user00")).andReturn().getModelAndView().getViewName());
		
	}
	
	@Test
	public void testList_amount() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list").param("pageNum", "2")
				.param("amount","50"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	}
	
	@Test
	public void testList() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testGet() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get").param("bno","2"))
				.andReturn().getModelAndView().getModelMap());
	}
	
	@Test
	public void testModify() throws Exception {
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("bno", "1")
				.param("title", "수정된 테스트 새글 제목")
				.param("content","수정된 테스트 새글 내용")
				.param("writer","user00")).andReturn().getModelAndView().getViewName();
		log.info(resultPage );
		
	}
	
	@Test
	public void testRemove() throws Exception {
		String resultPage = mockMvc.perform( MockMvcRequestBuilders.post("/board/remove").
				param("bno","100") ).
				andReturn().getModelAndView().getViewName();
				
	}
}














