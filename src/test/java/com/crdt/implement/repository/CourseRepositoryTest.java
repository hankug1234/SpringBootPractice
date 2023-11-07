package com.crdt.implement.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crdt.implement.entityTable.Course;

@SpringBootTest
class CourseRepositoryTest {

	@Autowired
	private CourseRepository repository;
	
	@Test
	void testSave() {
		Course course = new Course("Rapid Spring Boot Application Development","Spring",4,"Spring Boot gives all the power of the Spring");
		Course savedCourse = repository.save(course);
		
		assertThat(repository.findById(savedCourse.getId()).get()).isEqualTo(course);
	}

	@Test
	void testFindById() {
		Course course = new Course("Rapid Spring Boot Application Development","Spring",4,"Spring Boot gives all the power of the Spring");
		Course savedCourse = repository.save(course);
		course.setRating(5);
		
		repository.save(course);
		
		assertThat(repository
				.findById(course.getId()).get().getRating()).isEqualTo(5);
		
	}

	@Test
	void testDelete() {
		Course course = new Course("Rapid Spring Boot Application Development","Spring",4,"Spring Boot gives all the power of the Spring");
		Course savedCourse = repository.save(course);
		
		repository.delete(savedCourse);
		
		assertThat(repository.findById(course.getId()).isPresent()).isFalse();
	}

}
