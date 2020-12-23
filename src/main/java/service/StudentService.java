package service;

import model.Student;
import repository.StudentRepository;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
}
