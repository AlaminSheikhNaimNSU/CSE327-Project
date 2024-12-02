/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.AlaminSheikhNaimNSU.CSE327_Project.Controller;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseDescriptionRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.StudentRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Course;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.CourseDescription;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("show")
public class ShowControl {

    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    private final CourseDescriptionRepository courseDescriptionRepository;

    public ShowControl(CourseRepository courseRepository, StudentRepository studentRepository, CourseDescriptionRepository courseDescriptionRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.courseDescriptionRepository = courseDescriptionRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/course")
    public String showCourse(Model model) {
        List<Course> myCourses = courseRepository.findAllByOrderByCodeAsc();
        model.addAttribute("course", myCourses);
        return "show/ShowCourse";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student")
    public String showStudents(Model model) {
        List<Student> myStudents = studentRepository.findAllByOrderByFirstNameAsc();
        model.addAttribute("student", myStudents);
        return "show/ShowStudent";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list")
    public String showCourseDescription(Model model) {
        List<CourseDescription> myCourses = courseDescriptionRepository.findAllByOrderByCodeAsc();
        model.addAttribute("courseList", myCourses);
        return "show/ShowCourseList";
    }
}
