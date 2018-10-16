package ww.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Student;
import ww.school.service.IStudentService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentMapper mapper;

    @Override
    public void insertStudent(Student student) {
        mapper.insertStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return mapper.getStudents();
    }

    @Override
    public Student getStudentByNo(String sno) {
        return mapper.getStudentByNo(sno);
    }

    @Override
    public Student getStudentByMap(Map<String, String> paramMap) {
        return mapper.getStudentByMap(paramMap);
    }

    @Override
    public List<Student> getStudentByLike(String sno) {
        return mapper.getStudentByLike(sno);
    }

    @Override
    public Student getStudent(String sno, String sname) {
        return null;
    }

    @Override
    public List<Student> getStudentPage(Map<String,Object> pageMap) {
        return mapper.getStudentPage(pageMap);
    }

    @Override
    public void updateStudent(Map<String,String> paramMap) {
        mapper.updateStudent(paramMap);
    }

    @Override
    public List<Student> getStudentByIn(List<String> snos) {
        return mapper.getStudentByIn(snos);
    }

    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }
}
