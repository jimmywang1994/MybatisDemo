import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    private IStudentMapper mapper;

    /**
     * 插入一条记录j
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

    /**
     * 根据学号查询学生
     */
    @Test
    public void getStudentByNo() {
        Student student = mapper.getStudentByNo("150400120");
        System.out.println(student.toString());
    }

    @Test
    public void getStudentByLike() {
        List<Student> students = mapper.getStudentByLike("1504");
        for (Student student:students){
            System.out.println(student.toString());
        }
    }

    /**
     * 根据学号和姓名查询学生
     */
    @Test
    public void getStudentByMap() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("sno", "150400120");
        paramMap.put("sname", "刘健");
        Student stu = mapper.getStudentByMap(paramMap);
        System.out.println(stu.toString());
    }

    @Test
    public void updateStudent() {
        Map<String,String> map=new HashMap<>();
        map.put("sno","150402130");
        map.put("sname","孟广至");
        mapper.updateStudent(map);
    }

    @Test
    public void getStudentPage() {
        int pageNum = 1;
        int pageSize = 3;
        Map<String, Object> pageMap = new HashMap<>();
        pageMap.put("pageSize", pageSize);
        pageMap.put("pageStart", pageSize * (pageNum - 1));
        List<Student> students=mapper.getStudentPage(pageMap);
        for(Student student:students){
            System.out.println(student.toString());
        }
    }

    @Test
    public void getStudentByIn(){
        List<String> snos=new ArrayList<>();
        snos.add("150403105");
        snos.add("150402130");
        snos.add("150403106");
        List<Student> stus=mapper.getStudentByIn(snos);
        for(Student student:stus){
            System.out.println(student.toString());
        }
    }


}
