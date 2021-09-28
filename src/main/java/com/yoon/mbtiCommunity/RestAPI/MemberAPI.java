package com.yoon.mbtiCommunity.RestAPI;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yoon.mbtiCommunity.Service.MemberService;

@RestController
@RequestMapping("/api")
public class MemberAPI {
	@Autowired
    MemberService memberService;

	@PostMapping("/register")
	@ResponseBody
	public Map<String, String> register(@RequestBody Map<String, String> param) {
		Map<String, String> response = new HashMap();
		if(param.get("id").isEmpty() || param.get("password").isEmpty() || param.get("password2").isEmpty()) {
			response.put("message", "빈칸을 채워 주세요.");
			response.put("code", "400");
		}
		else if(!param.get("password").equals(param.get("password2"))) {
			response.put("message", "비밀 번호가 달라요.");
			response.put("code", "400");
		}
		else if (param.get("id").trim().length()>32) {
			response.put("message", "id는 32자 이하로 작성해 주세요.");
			response.put("code", "400");
		}
		else if (param.get("password").trim().length()>40) {
			response.put("message", "비밀번호 40자 이하로 작성해 주세요.");
			response.put("code", "400");
		}
		else {
			memberService.register(param.get("id").trim(), param.get("password").trim(), param.get("mbtiOption"));
			response.put("message", "성공적으로 회원가입 했습니다.");
			response.put("code", "200");
		}
		return response;
	}
}
