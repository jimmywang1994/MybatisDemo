package ww.school.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ww.school.model.Student;
import ww.school.service.IStudentService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    private Logger logger=Logger.getLogger(StudentController.class);
    @RequestMapping("/showStudents")
    public Map<String, Object> showStudents() {
        Map<String, Object> students = new HashMap<>();
        List<Student> stus = studentService.getStudents();
        students.put("students", stus);
        for(Student stu:stus){
            logger.info(stu.toString());
        }
        return students;
    }
}
