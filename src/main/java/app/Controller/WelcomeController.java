package app.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {


    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "welcome";
    }


    @RequestMapping("/addNewPerson")
    public String addNewPerson() {
        return "addPerson";
    }

}