package s2dent.app.dao;

import s2dent.app.domain.Student;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public interface StudentDao {
    public void addStudent(Student student);
    public List<Student> listStudent();
    public void removeStudent(Integer id);
}
