package egovframework.example.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	 //<intercept-url pattern="/member/**" access="hasAnyRole('ROLE_USER','ROLE_GUEST')"/>
	  //<intercept-url pattern="/admin/**" access="hasRole('ROLE_ADMIN')"/>
	
	
	@RequestMapping(value = "loginPage.do")
	public String initMain() throws Exception {

		return "main/login.tiles";
	}
		
	@RequestMapping(value = "/guest/guest.do")
	public String guest() {
		return "main/guest";
	}
	
	@RequestMapping(value = "/member/member.do")
	public String member() {
		return "main/member";
	}
	
	@RequestMapping(value = "/admin/admin.do")
	public String admin() {
		return "main/admin";
	}
	
	
//	@RequestMapping(value="admin/ad.do")
//	public String admin() throws Exception {
//		System.out.println(" admin만허용 ");
//		return "main/login.tiles";
//	}
	
	
}
