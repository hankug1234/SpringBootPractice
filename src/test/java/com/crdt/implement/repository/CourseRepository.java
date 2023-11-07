package com.crdt.implement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crdt.implement.entityTable.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long>{

}
