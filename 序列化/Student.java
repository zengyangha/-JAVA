package com.序列化;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -123213132L;

    private String name;

    private String sex;

    private String email;

    private Teacher teacher;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Student(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
