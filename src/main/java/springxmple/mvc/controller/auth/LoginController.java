package springxmple.mvc.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Controller
public class LoginController
{
    @RequestMapping( value = "/login", method = RequestMethod.GET )
    public String login()
    {
        return "login.definition";
    }
}