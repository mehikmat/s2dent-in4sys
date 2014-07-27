package s2dent.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import s2dent.app.domain.Student;
import s2dent.app.service.StudentService;

import java.util.Map;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String listContacts(Map<String, Object> map) {
        map.put("student", new Student());
        map.put("studentList", studentService.listStudent());
        return "student.definition";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("student") Student student , BindingResult result) {
        studentService.addStudent(student);
        return "redirect:/student";
    }

    @RequestMapping(value = "/deleteStudent/{studentId}", method = RequestMethod.GET)
    public String deleteContact(@PathVariable("studentId") Integer studentId) {
        studentService.removeStudent(studentId);
        return "redirect:/student";
    }
}