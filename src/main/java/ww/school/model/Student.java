package ww.school.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String sname;
    private String sno;
    private String className;
    private String major;

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
        return "姓名：" + this.getSname() + "学号：" + this.getSno() + "班级：" + this.getClassName() + "专业：" + this.getMajor();
    }
}
