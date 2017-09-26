package hibernatetest.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
@Scope("prototype") //多例模式
public class UserController {

    @RequestMapping(value = "/save")
    public ModelAndView saveUser() {
        ModelAndView view = new ModelAndView("/hibernate/test");
        System.out.println("-- 访问成功 --");
        return view;
    }

}