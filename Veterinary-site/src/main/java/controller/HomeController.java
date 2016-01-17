package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nimesha Jinarajadasa on 1/17/2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Index(){

        return "index";

    }
}
