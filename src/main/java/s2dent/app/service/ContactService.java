package s2dent.app.service;

import s2dent.app.form.Contact;

import java.util.List;

public interface ContactService {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}