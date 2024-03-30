package br.com.store.controllers;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.store.repositories.CaregiverRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableJpaRepositories("br.com.store.repositories")
@RequestMapping("/caregiver")

public class CaregiverController {
    // @Autowired  // this notation say to when we send the class send one object already exists.
    private CaregiverRepository repository;

    @GetMapping("/") // the moment we get our requestmapping caregiver this route will be executed by default.
    public ModelAndView searchAll() {
        var modelAndView = new ModelAndView("listCaregiver");
        modelAndView.addObject("caregiver", repository.findAll());
        return modelAndView;
    }
}
 