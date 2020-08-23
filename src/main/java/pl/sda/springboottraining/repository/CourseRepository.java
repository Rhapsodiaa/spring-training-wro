package pl.sda.springboottraining.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.springboottraining.repository.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    List<Course> findAll();

    Course findFirstByName(String name);

}
