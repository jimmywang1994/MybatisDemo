package ww.school.mapper;

import org.apache.ibatis.annotations.Param;
import ww.school.model.Student;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public interface IStudentMapper {
    void insertStudent(Student student);

    List<Student> getStudents();

    Student getStudent(String sno,String sname);

    Student getStudentByNo(String sno);

    List<Student> getStudentByLike(@Param("sno") String sno);

    Student getStudentByMap(Map<String,String> paramMap);

    List<Student> getStudentPage(Map<String,Object> pageMap);

    void updateStudent(Map<String,String> paramMap);

    List<Student> getStudentByIn(List<String> snos);

    List<Student> selectAll();

    List<Student> selectAll2();
}
