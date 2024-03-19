package com.github.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.dto.CaregiverForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/") // the notation have to receive the parameter of the router where comes the data.
public class HomeController {
    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String Home() {
        return "home";
    }

    @GetMapping("/modelmap")
    public String Home2(ModelMap modelMap) {
        // first way to pass values from the controller to view we have addaAtribute(addname, addvalue)
        modelMap.addAttribute("nome", "treinaweb");
        return "home";
    }

    @GetMapping("/modelview")
    public ModelAndView Home3() {
        // second way to pass values from the controller to view we have modelandview(addname, addvalue)
        var modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "Cleyson");
        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form() {
        var modelandview = new ModelAndView("login");
        modelandview.addObject("form", new CaregiverForm());
        return modelandview;
    }

    @PostMapping("/form")
    public String form2(CaregiverForm form) {
        System.out.println(form);

        return "redirect:/form";
    }
}
