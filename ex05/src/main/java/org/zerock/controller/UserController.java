package org.zerock.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.dto.LoginDto;
import org.zerock.dto.UserDto;
import org.zerock.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Inject
	private UserService service;
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public void loginGET(@ModelAttribute("lDto") LoginDto lDto){
//		사실 @ModelAttribute는 지금 필요 없다. 그냥 빈 화면에서 주소창으로 입력이 된다. 
//      나중 remember id, 에서 사용을 하게 된다. 로그인 하고 재로그인하려고 하면 여기서 커버를 할꺼다.
//      혹은 아이디/패스워드 입력을 잘못했을 때, 잘못됐다는 걸 보여줘야지
	}
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(LoginDto lDto, HttpSession session, Model model) throws Exception{
		UserDto uDto = service.login(lDto);
		
		if(uDto == null){
			return;
		}
		
		model.addAttribute("uDto",  uDto);
	}
	
}
