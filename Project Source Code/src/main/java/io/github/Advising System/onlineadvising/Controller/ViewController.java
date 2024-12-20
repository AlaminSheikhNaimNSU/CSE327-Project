package io.github.AlaminSheikhNaimNSU.CSE327_Project.Controller;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.DbSeeder;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.StudentRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Course;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Student;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Time;

@Controller
public class ViewController implements ErrorController {

    StudentRepository studentRepository;

    public ViewController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/error2")
    public String showError() {
        return "ERROR_PAGE";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/error")
    public String showError2() {
        return "ERROR_PAGE";
    }

    @RequestMapping(value = "/courses")
    public String showCourses(Model model, CourseRepository courseRepos) {
        CourseRepository courseRepository = courseRepos;
        model.addAttribute("course", courseRepository.findAll());
        return "course";

    }

    @RequestMapping(method = RequestMethod.GET, value = "add/course")
    public String addCourse(Model model, Course course, Pageable pageable) {
        return "/";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dashboard")
    public String gotoDashboard(Model model) {
        String mId = "2016-1-60-";
        int myId = 100;
        Student student = studentRepository.findStudentByStudentCode(mId + myId);
        while ((student == null)) {
            myId++;
            student = studentRepository.findStudentByStudentCode(mId + myId);
        }
        model.addAttribute("dashStudent", student);
        return "show/ShowStudentDashboard";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/resetall/{password}")
    @ResponseBody
    public String adminResetAll(@PathVariable String password) {
        if (password.equals("MINHAZUL_HAYAT_KHAN_EWU")) {
            DbSeeder hi = null;
            hi.deleteAll();
            return hi.loadAll();
        }
        return "ALL FAILURE";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/deleteall/{password}")
    @ResponseBody
    public String adminDeleteAll(@PathVariable String password) {
        if (password.equals("MINHAZUL_HAYAT_KHAN_EWU")) {
            DbSeeder hi = null;
            return hi.deleteAll();
        }
        return "DELETE FAILURE";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/loadall/{password}")
    @ResponseBody
    public String adminLoadAll(@PathVariable String password) {
        if (password.equals("MINHAZUL_HAYAT_KHAN_EWU")) {

            DbSeeder hi = null;
            hi.deleteAll();
            return hi.loadAll();
        }
        return "LOAD FAILURE";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {

        return "test";

    }
}
