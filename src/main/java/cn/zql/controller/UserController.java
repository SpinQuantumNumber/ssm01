package cn.zql.controller;

import cn.zql.pojo.User;
import cn.zql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService =userService;
        System.out.println("--------------------------UserAction构造函数");
    }




    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public String selectUser(ModelMap modelMap) {
        System.out.println("UserAction -------------------------- selectUser");

        try {
            List<User> list = userService.selectUser();
            System.out.println("list=         "+list);
            System.out.println("-----AAAAAAAAAA-------");
        } catch (Exception e) {
            System.out.println("---------------------------------------------------sql出错");
            e.printStackTrace();
        }

//        userService.updateUser(user);
        modelMap.addAttribute("list_user", "en~~~");
        return "success";
    }
}

