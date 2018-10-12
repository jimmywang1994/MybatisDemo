package ww.school.mapper;

import ww.school.model.Student;

import javax.annotation.Resource;
import java.util.List;

public interface IStudentMapper {
    void insertStudent(Student student);

    List<Student> getStudents();

    Student getStudentByNo(String sno);
}
