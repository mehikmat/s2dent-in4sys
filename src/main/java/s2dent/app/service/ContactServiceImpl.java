package s2dent.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import s2dent.app.dao.ContactDao;
import s2dent.app.domain.Contact;

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