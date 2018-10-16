package ww.school.mapper;

import ww.school.model.Classroom;

import java.util.List;

public interface IClassroomMapper {
    void insertClassroom(Classroom classroom);

    List<Classroom> selectClassroomAll();
}
