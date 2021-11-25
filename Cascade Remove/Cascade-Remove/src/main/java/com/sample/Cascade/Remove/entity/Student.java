package com.sample.Cascade.Remove.entity;

import com.sample.Cascade.Remove.Subject;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private int s_id;
    private String s_name;
    private int s_age;
    @OneToOne(cascade={CascadeType.REMOVE})
    private Subject sub;

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public Student(int s_id, String s_name, int s_age , Subject sub) {
        super();
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
        this.sub=sub;
    }

    public Student() {
        super();
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

}
