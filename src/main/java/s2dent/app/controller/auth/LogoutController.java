package s2dent.app.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Controller
public class LogoutController {
    @RequestMapping( value = "/logout", method = RequestMethod.GET )
    public String logout()
    {
        return "login.definition";
    }
}
