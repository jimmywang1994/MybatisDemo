import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    private IStudentMapper mapper;

    @Test
    public void insertStudent(){
        Student stu=new Student();
        stu.setClassName("15计算机1班");
        stu.setSno("150400120");
        stu.setMajor("计算机科学与技术");
        stu.setSname("刘健");
        mapper.insertStudent(stu);
    }
}
