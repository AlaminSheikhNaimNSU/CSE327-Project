package io.github.AlaminSheikhNaimNSU.CSE327_Project.Controller;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseDescriptionRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Course;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.CourseDescription;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.CourseExtended;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/coursedescription")
public class CourseDescriptionController {

    private final CourseDescriptionRepository courseDescriptionRepository;

    public CourseDescriptionController(CourseDescriptionRepository courseDescriptionRepository) {
        this.courseDescriptionRepository = courseDescriptionRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String showCourseDescriptions(Model model) {
        return "redirect:show/list";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/remove")
    public String courseDelete(@RequestParam("id") String id, RedirectAttributes redirectAttributes) {
        CourseDescription courseDescription = courseDescriptionRepository.findCourseDescriptionById(id);
        String msg = courseDescription.getCode() + "(" + courseDescription.getSec() + ")";
        courseDescriptionRepository.delete(courseDescription);
        redirectAttributes.addFlashAttribute("msg_success", "Successfully deleted: " + msg);
        return "redirect:/show/list";
    }

    @RequestMapping(method = RequestMethod.POST, value = "edit")
    public String courseEdit(@RequestParam("id") String id, Model model) {
        CourseDescription courseDescription = this.courseDescriptionRepository.findCourseDescriptionById(id);
        model.addAttribute("course", courseDescription);
        return "edit/EditCourseDescription";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update")
    public String courseUpdate(@RequestParam MultiValueMap<String, String> myMap, RedirectAttributes redirectAttributes) {
        String id = myMap.getFirst("id");
        String code = myMap.getFirst("code");
        String sec = myMap.getFirst("sec");
        String time = myMap.getFirst("time");
        String day = myMap.getFirst("day");
        String room = myMap.getFirst("room");
        String seats = myMap.getFirst("seats");
        String instructor = myMap.getFirst("instructor");
        this.courseDescriptionRepository.delete(this.courseDescriptionRepository.findCourseDescriptionById(id));
        this.courseDescriptionRepository.save(new CourseDescription(code, sec, time, day, room, seats, instructor));
        redirectAttributes.addFlashAttribute("msg_success", "Successfully updated: " + code + "(" + sec + ")");
        return "redirect:/show/list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "add")
    public String showAddCourse(Model model) {
        return "add/AddCourseDescription";
    }

    @RequestMapping(method = RequestMethod.POST, value = "add")
    public String addCourse(@RequestParam MultiValueMap<String, String> myMap, RedirectAttributes redirectAttributes) {
        String code = myMap.getFirst("code");
        String sec = myMap.getFirst("sec");
        String time = myMap.getFirst("time");
        String day = myMap.getFirst("day");
        String room = myMap.getFirst("room");
        String instructor = myMap.getFirst("instructor");
        String seats = myMap.getFirst("seats");
        if ((code == null) || (sec == null) || (time == null) || (day == null) || (room == null) || (instructor == null) || (seats == null)) {
            redirectAttributes.addFlashAttribute("msg_error", "Error, Check inputs clearly");
            return "redirect:/show/list";
        }
        this.courseDescriptionRepository.save(new CourseDescription(code, sec, time, day, room, seats, instructor));

        redirectAttributes.addFlashAttribute("msg_success", "Successfully added: " + code + "(" + sec + ")");
        return "redirect:/show/list";
    }
    //TODO: add select in course description add
}
