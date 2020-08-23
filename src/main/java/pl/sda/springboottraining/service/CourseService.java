package pl.sda.springboottraining.service;

import pl.sda.springboottraining.repository.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> findAll();

    void create(Course course);

    void update(Course course);

    void deleteById(Integer id);
}
