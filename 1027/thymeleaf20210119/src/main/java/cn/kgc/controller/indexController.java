package cn.kgc.controller;

import cn.kgc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class indexController {
    @RequestMapping("getMessage")
    public String getMessage(Model model){
        model.addAttribute("message","hello thymeleaf");
        User user1=new User(1,"qwe","123456",new Date());
        User user2=new User(2,"asd","123456",new Date());
        User user3=new User(3,"zxc","123456",new Date());
        User user4=new User(4,"qaz","123456",new Date());
        List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        User user5=new User(5,"wsx","123456",new Date());
        model.addAttribute("us",user5);
        model.addAttribute("userList",userList);
        return "main";
    }

    @RequestMapping(value={"/","/index.html"})
    public String getIndex(){
        return "index";
    }
}
