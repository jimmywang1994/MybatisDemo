package ww.school.service.impl;

import ww.school.mapper.IClassroomMapper;
import ww.school.model.Classroom;
import ww.school.service.IClassService;

import javax.annotation.Resource;
import java.util.List;

public class ClassServiceImpl implements IClassService {
    @Resource
    private IClassroomMapper classroomMapper;

    @Override
    public void insertClassroom(Classroom classroom) {
        classroomMapper.insertClassroom(classroom);
    }

    @Override
    public List<Classroom> selectClassroomAll() {
        return classroomMapper.selectClassroomAll();
    }

    @Override
    public List<Classroom> selectAll1() {
        return classroomMapper.selectAll1();
    }
}
