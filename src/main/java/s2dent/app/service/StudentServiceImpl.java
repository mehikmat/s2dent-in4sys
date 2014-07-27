package s2dent.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import s2dent.app.dao.StudentDao;
import s2dent.app.domain.Student;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Transactional
    public List<Student> listStudent() {
        return studentDao.listStudent();
    }

    @Transactional
    public void removeStudent(Integer id) {
        studentDao.removeStudent(id);
    }
}
