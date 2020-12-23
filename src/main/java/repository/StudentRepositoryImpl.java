package repository;

import model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public List<Student> getAll() {
        List<Student> listUser = new ArrayList<>();
        Student student = new Student();
        student.setId(1);
        student.setName("Coder zero");
        listUser.add(student);
        return listUser;
    }
}
