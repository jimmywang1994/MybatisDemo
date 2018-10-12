package ww.school.service;

import org.springframework.stereotype.Service;
import ww.school.model.Student;

import java.util.List;

@Service
public interface IStudentService {
    void insertStudent(Student student);

    List<Student> getStudents();

    Student getStudentByNo(String sno);
}
