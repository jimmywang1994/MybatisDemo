package ww.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ww.school.mapper.IStudentMapper;
import ww.school.model.Student;
import ww.school.service.IStudentService;

import javax.annotation.Resource;
import java.util.List;


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
}
