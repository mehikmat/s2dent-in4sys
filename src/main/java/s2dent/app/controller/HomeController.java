package s2dent.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Controller
public class HomeController {
    @RequestMapping( value = "/home", method = RequestMethod.GET )
    public String home()
    {
        return "home.definition";
    }
}
