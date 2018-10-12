import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Student;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    private IStudentMapper mapper;

    /**
     * 插入一条记录
     */
    @Test
    public void insertStudent() {
        Student stu = new Student();
        stu.setClassName("15网络2班");
        stu.setSno("150403105");
        stu.setMajor("网络工程");
        stu.setSname("张田");
        mapper.insertStudent(stu);
    }

    /**
     * 查询多条记录list
     */
    @Test
    public void getStudents() {
        List<Student> students = mapper.getStudents();
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }

    @Test
    public void getStudentByNo(){
        Student student=mapper.getStudentByNo("150400120");
        System.out.println(student.toString());
    }


}
