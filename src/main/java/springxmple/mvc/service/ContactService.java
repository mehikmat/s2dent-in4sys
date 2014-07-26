package springxmple.mvc.service;

import springxmple.mvc.form.Contact;

import java.util.List;

public interface ContactService {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}