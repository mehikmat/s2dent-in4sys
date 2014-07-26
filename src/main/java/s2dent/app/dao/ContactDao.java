package s2dent.app.dao;

import s2dent.app.form.Contact;

import java.util.List;

public interface ContactDao {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
