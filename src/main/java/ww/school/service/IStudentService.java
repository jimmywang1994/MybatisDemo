package ww.school.service;

import org.springframework.stereotype.Service;
import ww.school.model.Student;

@Service
public interface IStudentService {
    void insertStudent(Student student);
}
