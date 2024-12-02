package io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Course;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.CourseDescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDescriptionRepository extends MongoRepository<CourseDescription, String> {

    //public CourseDescription findCourseDescriptionByName(String name);
    public List<CourseDescription> findCourseDescriptionsByCode(String code);

    public List<CourseDescription> findCourseDescriptionsByCodeOrderBySecAsc(String code);

    public CourseDescription findCourseDescriptionById(String id);

    public List<CourseDescription> findAllByOrderByCodeAsc();

    public List<CourseDescription> findCourseDescriptionsByCodeAndSec(String code, String sec);

}
