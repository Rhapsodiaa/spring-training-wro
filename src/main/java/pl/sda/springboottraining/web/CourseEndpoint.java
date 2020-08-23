package pl.sda.springboottraining.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.springboottraining.repository.model.Course;
import pl.sda.springboottraining.service.CourseService;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseEndpoint {

    private final CourseService courseService;

    @Autowired
    public CourseEndpoint(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> findAll(){
        return courseService.findAll();
    }

    @PostMapping
    public void addCourse(@RequestBody Course course){
        courseService.create(course);
    }

    @PutMapping
    public void updateCourse(@RequestBody Course course){
        courseService.update(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseService.deleteById(id);
    }

}
