package ww.school.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import ww.school.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {
    void insertStudent(Student student);

    List<Student> getStudents();

    Student getStudentByNo(String sno);

    Student getStudentByMap(Map<String,String> paramMap);

    List<Student> getStudentByLike(@Param("sno") String sno);

    Student getStudent(String sno,String sname);

    List<Student> getStudentPage(Map<String,Object> pageMap);

    void updateStudent(Map<String,String> paramMap);

    List<Student> getStudentByIn(List<String> snos);

    List<Student> selectAll();
}
