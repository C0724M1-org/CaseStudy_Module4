package com.codegym.c0724m1.service.impl;

import com.codegym.c0724m1.entity.Classroom;
import com.codegym.c0724m1.service.IClassroomService;

import java.util.List;

public class ClassroomService implements IClassroomService {
//    private static ClassroomRepository classroomRepository = new ClassroomRepository();
    @Override
    public List<Classroom> getAll() {
        return null;
    }

    @Override
    public void save(Classroom s) {

    }

    @Override
    public void update(int id, Classroom s) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Classroom findById(int id) {
        return null;
    }

    @Override
    public List<Classroom> findByName(String name) {
        return List.of();
    }
}
