package io.github.AlaminSheikhNaimNSU.CSE327_Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdvisingControl {

    @RequestMapping(method = RequestMethod.GET, value = "/advising")
    public String showAdvising(Model model) {
        return "/";
    }

}
