package springxmple.mvc;

import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;
import springxmple.mvc.controller.StudentController;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public class StudentControllerUnitTest extends TestCase {

    public void testViewResult(){
        StudentController studentController=new StudentController();
        ModelAndView modelAndView=studentController.student();
        assert modelAndView.getViewName().equalsIgnoreCase("student.definition");
    }
}
