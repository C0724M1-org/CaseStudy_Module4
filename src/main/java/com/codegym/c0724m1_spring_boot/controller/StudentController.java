package com.codegym.c0724m1.controller;

import com.codegym.c0724m1.entity.Student;
import com.codegym.c0724m1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("student", new Student());
        return "student/create";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute("student")Student student,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes,
                                Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "student/create";
        }
        studentService.save(student);
        redirectAttributes.addFlashAttribute("message", "Thêm mới thành công");
        return "redirect:/student/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteStudent(@PathVariable("id")Long id,
                                RedirectAttributes redirectAttributes) {
        studentService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Xóa thành công");
        return "redirect:/student/list";
    }
}
//PathVariable hoặc RequestParam