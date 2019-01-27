package incubator.course.dead.valley.application.spring.controller;

import incubator.course.dead.valley.application.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;

@Controller
@RequestMapping("/ShowStartPage")
public class UserController {
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping("")
    public String showStartPage(ModelMap model) {
        return "ShowUser";
    }
    @RequestMapping(value = "/TheMostRichest",method = RequestMethod.GET)
    public String theMostRichest(ModelMap model) {
        model.addAttribute("theMostRichest", Collections.max(service.getAllUser(),
                (o1,o2) -> o1.getAccount() - o2.getAccount()));
        return "ShowUser";
    }

    @RequestMapping(value = "/AccountsSum",method = RequestMethod.GET)
    public String accountsSum(ModelMap model) {
        model.addAttribute("accountsSum", service.getAllUser().size());
        return "ShowUser";
    }

}
