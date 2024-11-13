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
    private UserService userService;  // UserServiceImpl�� �ڵ����� ���Ե˴ϴ�.

    @GetMapping("/list")
	public String join() {
		return "mypage/list";
	}
    
    // �� ���� ������ (����� ���� ��ȸ)
    @GetMapping
    public String showMypage(@RequestParam("username") String username, Model model) {
        User user = userService.getUserByUsername(username);
        model.addAttribute("user", user);
        return "mypage/list"; // mypage.jsp�� �̵�
    }

    // �� ���� ���� ������
    @GetMapping("/edit")
    public String editMypage(@RequestParam("username") String username, Model model) {
        User user = userService.getUserByUsername(username);
        model.addAttribute("user", user);
        return "editMypage"; // editMypage.jsp�� �̵�
    }

    // �� ���� ���� ó��
    @PostMapping("/edit")
    public String updateMypage(User user) {
        int result = userService.updateUser(user);
        if (result > 0) {
            return "redirect:/mypage?username=" + user.getUsername(); // ���� �� ������������ �����̷�Ʈ
        } else {
            return "editMypage"; // ���� ���� �� �ٽ� ���� �������� �̵�
        }
    }
}
