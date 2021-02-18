package com.mshkolniy.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {

    @GetMapping("/surveys")
    public String getAll(Model model) {
        model.addAttribute("title", "Home page");
        return "surveys";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("title", "Create survey");
        return "create";
    }

    @GetMapping("/delete")
    public String delete(Model model) {
        model.addAttribute("title", "Delete survey");
        return "delete";
    }

    @GetMapping("/edit")
    public String edit(Model model) {
        model.addAttribute("title", "Edit survey");
        return "edit";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contacts");
        return "contact";
    }
}
