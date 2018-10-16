package ww.school.service;

import org.springframework.stereotype.Service;
import ww.school.model.Classroom;

import java.util.List;

@Service
public interface IClassService {
    void insertClassroom(Classroom classroom);

    List<Classroom> selectClassroomAll();
}
