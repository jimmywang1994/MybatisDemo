import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ww.school.mapper.IClassroomMapper;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Classroom;
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
    @Autowired
    private IClassroomMapper classroomMapper;

    /**
     * 插入一条记录
     */
    @Test
    public void insertStudent() {
        Student stu = new Student();
        stu.setClassName("15计算机2班");
        stu.setSno("150403115");
        stu.setMajor("网络工程");
        stu.setSname("顾宇杰");
        stu.setCid("dfbadacdd07f11e8a0a22a9287894421");
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
        for (Student student : students) {
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
        Map<String, String> map = new HashMap<>();
        map.put("sno", "150402130");
        map.put("sname", "张军");
        mapper.updateStudent(map);
    }

    @Test
    public void getStudentPage() {
        int pageNum = 1;
        int pageSize = 3;
        Map<String, Object> pageMap = new HashMap<>();
        pageMap.put("pageSize", pageSize);
        pageMap.put("pageStart", pageSize * (pageNum - 1));
        List<Student> students = mapper.getStudentPage(pageMap);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void getStudentByIn() {
        List<String> snos = new ArrayList<>();
        snos.add("150403105");
        snos.add("150402130");
        snos.add("150403106");
        List<Student> stus = mapper.getStudentByIn(snos);
        for (Student student : stus) {
            System.out.println(student.toString());
        }
    }

    @Test
    public void insertClassroom() {
        Classroom classroom = new Classroom();
        classroom.setCno("15003");
        classroom.setCname("15计算机3班");
        classroomMapper.insertClassroom(classroom);
    }

    @Test
    /**
     * 查询所有学生，带上班级
     */
    public void getStudentAll() {
        List<Student> students = mapper.selectAll();
        System.out.println(students);
    }


    @Test
    /**
     * 查询所有班级以及班级中的学生
     */
    public void getClassroomAll() {
        List<Classroom> classrooms = classroomMapper.selectClassroomAll();
        System.out.println(classrooms);
    }

    @Test
    /**
     * 查询所有班级以及班级中的学生 autoMapping模式
     */
    public void getClassroomAll1() {
        List<Classroom> classrooms = classroomMapper.selectAll1();
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }


}
