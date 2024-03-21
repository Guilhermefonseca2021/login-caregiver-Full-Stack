package br.com.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.store.dto.CaregiverForm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/") // the notation have to receive the parameter of the router where comes the data.
public class HomeController {
    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String Home() {
        return "home";
    }

    @GetMapping("/modelmap")
    public String Home2(ModelMap modelMap) {
        // first way to pass values from the controller to view we have addAtribute(addname, addvalue)
        modelMap.addAttribute("nome", "treinaweb");
        return "home";
    }

    @GetMapping("/modelandview")
    public ModelAndView Home3() {
        // i instance a model in a view and put to screen.
        var modelAndView = new ModelAndView("home");
        modelAndView.addObject("nome", "Cleyson");
        return modelAndView;
    }
    // action not response to receive that, just to send the data view.
    @GetMapping("/form") 
    public ModelAndView form() {
        // every view that we want to render we declare inside new ModelAndView
        var modelAndView = new ModelAndView("form");
        modelAndView.addObject("form", new CaregiverForm());
        return modelAndView;
    }

    @PostMapping("/form")
    public String form2(CaregiverForm form) {
        System.out.println(form);
        return "redirect:/form";
    }
    
}