package ww.school.model;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 使用别名
 */
@Alias("Student")
public class Student implements Serializable {
    private String id;
    private String sname;
    private String sno;
    private String className;
    private String cid;
    private Classroom classroom;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    private String major;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sname='" + sname + '\'' +
                ", sno='" + sno + '\'' +
                ", className='" + className + '\'' +
                ", cid='" + cid + '\'' +
                ", classroom=" + classroom +
                ", major='" + major + '\'' +
                '}';
    }
}
