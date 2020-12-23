package service;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;
import repository.StudentRepositoryImpl;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository ;

    public StudentServiceImpl() {
        super();
        System.out.println("Constructor student service without param");
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        System.out.println("Constructor student service a param");
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }
    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter student service");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }
}
