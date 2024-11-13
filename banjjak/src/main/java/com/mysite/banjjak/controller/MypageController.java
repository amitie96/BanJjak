package com.mysite.banjjak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.banjjak.model.User;
import com.mysite.banjjak.service.UserService;

@Controller
@RequestMapping("/mypage")
public class MypageController {

    @Autowired
    private UserService userService;  // UserServiceImpl이 자동으로 주입됩니다.

    @GetMapping("/list")
	public String join() {
		return "mypage/list";
	}
    
    // 내 정보 페이지 (사용자 정보 조회)
    @GetMapping
    public String showMypage(@RequestParam("username") String username, Model model) {
        User user = userService.getUserByUsername(username);
        model.addAttribute("user", user);
        return "mypage/list"; // mypage.jsp로 이동
    }

    // 내 정보 수정 페이지
    @GetMapping("/edit")
    public String editMypage(@RequestParam("username") String username, Model model) {
        User user = userService.getUserByUsername(username);
        model.addAttribute("user", user);
        return "editMypage"; // editMypage.jsp로 이동
    }

    // 내 정보 수정 처리
    @PostMapping("/edit")
    public String updateMypage(User user) {
        int result = userService.updateUser(user);
        if (result > 0) {
            return "redirect:/mypage?username=" + user.getUsername(); // 수정 후 마이페이지로 리다이렉트
        } else {
            return "editMypage"; // 수정 실패 시 다시 수정 페이지로 이동
        }
    }
}
