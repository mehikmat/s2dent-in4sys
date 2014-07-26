package springxmple.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springxmple.mvc.dao.ContactDao;
import springxmple.mvc.form.Contact;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    @Transactional
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {

        return contactDao.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDao.removeContact(id);
    }
}