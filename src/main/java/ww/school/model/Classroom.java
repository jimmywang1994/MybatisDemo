package ww.school.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("Classroom")
public class Classroom {
    private String id;
    private String cno;
    private String cname;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id='" + id + '\'' +
                ", cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
