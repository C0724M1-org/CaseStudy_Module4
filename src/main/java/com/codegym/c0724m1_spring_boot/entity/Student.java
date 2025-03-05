package com.codegym.c0724m1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "students")
public class Student extends Person implements Comparable<Student>{
    private Float point;

    @Column(name = "id_class")
    private Integer idClass;


    public Student() {
    }


    public Student(int id, String name, String address, Float point, Integer className) {
        super(id, name, address);
        this.point = point;
        this.idClass = className;
    }

    public Student(String name, String address, Float point, Integer className) {
        super(name, address);
        this.point = point;
        this.idClass = className;
    }


    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "point=" + point +
                ", className='" + idClass + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.getCode() > o.getCode()) {
            return 1;
        } else if(this.getCode() == o.getCode()) {
            return this.getName().compareTo(o.getName());
        }
        return -1;
    }
}
