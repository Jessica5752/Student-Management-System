package com.Student_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.Student_management_system.service.Studentservice;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Studentservice service;


    // Home Page
    @GetMapping("/home")
    public String home() {
        return "home";
    }

   
    // Admin Page
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

   
    

    // Student Pages
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";  // Points to students.html
    }

    // Miscellaneous Pages
    @GetMapping("/Module")
    public String Module() {
        return "Module";
    }

    @GetMapping("/student-management-system")
    public String studentmanagementsystem() {
        return "student-management-system";
    }
}
