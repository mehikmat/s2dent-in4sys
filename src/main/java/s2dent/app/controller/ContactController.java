package s2dent.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import s2dent.app.domain.Contact;
import s2dent.app.service.ContactService;

import java.util.Map;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String listContacts(Map<String, Object> map) {
        map.put("contact", new Contact());
        map.put("contactList", contactService.listContact());
        return "contact.definition";
    }

    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {
        contactService.addContact(contact);
        return "redirect:/contact";
    }

    @RequestMapping(value = "/deleteContact/{contactId}", method = RequestMethod.GET)
    public String deleteContact(@PathVariable("contactId") Integer contactId) {
        contactService.removeContact(contactId);
        return "redirect:/contact";
    }
}