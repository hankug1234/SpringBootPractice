package com.crdt.implement.repository;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crdt.implement.entityTable.Course;

@Repository
public interface CourseRepository2 extends CrudRepository<Course,Long>{

	Iterable<Course> findAllByCategory(String category);
	Iterable<Course> findAllByCategoryOrderByName(String category);
	boolean existsByName(String name);
	long countByCategory(String category);
	Iterable<Course> findByNameOrCategory(String name, String category);
	Iterable<Course> findByNameStartsWith(String name);
	Stream<Course> streamAllByCategory(String category);
}
