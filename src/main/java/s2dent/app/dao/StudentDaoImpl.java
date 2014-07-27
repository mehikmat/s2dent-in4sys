package s2dent.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import s2dent.app.domain.Student;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> listStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @Override
    public void removeStudent(Integer id) {
        Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, id);
        if (null != student) {
            sessionFactory.getCurrentSession().delete(student);
        }
    }
}
