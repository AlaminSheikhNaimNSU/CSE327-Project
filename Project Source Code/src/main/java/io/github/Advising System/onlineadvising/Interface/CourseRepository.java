/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.OrderBy;
import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

    List<Course> findAllByOrderByCodeAsc();

    Course findCourseByName(String name);

    Course findCourseByCode(String code);

    Course findCourseById(String id);

    List<Course> findCoursesByCodeOrCodeOrCode(String code, String s2, String s3);

    List<Course> findCoursesByCodeOrCode(String code, String s2);
}
