package com.perscholas.GLAB._95.__SP5.controllerOne;

import com.perscholas.GLAB._95.__SP5.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewcontroller {
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model) {
        model.addAttribute("message", "Perscholas");
        model.addAttribute("welcomeMessage", "welcome");
        int i = 10;
        model.addAttribute("number", i);

        List<String> list = Arrays.asList("one", "two");
        model.addAttribute("listData", list);
        return "viewPage";
    }

    @GetMapping("/goToViewPage")
    public ModelAndView passParametersWithModel() {
        String st = "Welcome to the Page";
        ModelAndView modelAndView = new ModelAndView("viewPage_2");
        modelAndView.addObject("message", st);
        modelAndView.addObject("info", "Employee information");
        return modelAndView;
    }

    @GetMapping("/goToUserViewPage")
    public ModelAndView UserModelAndViewv(){
        List<User> listUsers = new ArrayList<User>();
        listUsers.add(new User(1,"Haseeb", "haseeb@abc.com,"));
        listUsers.add(new User(1,"Shahparan", "Shahparan@abc.com,"));
        listUsers.add(new User(1,"James", "James@abc.com,"));
        listUsers.add(new User(1,"joseph", "Joseph@abc.com,"));

        ModelAndView modelAndView = new ModelAndView("userdata");
        modelAndView.addObject("userlist", listUsers);
        return modelAndView;
    }
}
