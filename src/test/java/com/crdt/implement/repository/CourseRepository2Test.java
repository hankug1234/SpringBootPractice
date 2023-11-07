package com.crdt.implement.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crdt.implement.entityTable.Course;

@SpringBootTest
class CourseRepository2Test {

	@Autowired 
	private CourseRepository2 repository2;
	
	@Test
	void test() {
		repository2.saveAll(getCourses());
		
		assertThat(repository2.findAllByCategory("spring")).hasSize(6);
		assertThat(repository2.existsByName("rapid1")).isTrue();
		assertThat(repository2.existsByName("rapid7")).isFalse();
		assertThat(repository2.countByCategory("spring")).isEqualTo(6);
		assertThat(repository2.findByNameStartsWith("rapid")).hasSize(6);
	}
	
	private List<Course> getCourses(){
		Course rapid1 = new Course("rapid1","spring",4,"complexity");
		Course rapid2 = new Course("rapid2","spring",5,"complexity");
		Course rapid3 = new Course("rapid3","spring",3,"complexity");
		Course rapid4 = new Course("rapid4","spring",5,"complexity");
		Course rapid5 = new Course("rapid5","spring",3,"complexity");
		Course rapid6 = new Course("rapid6","spring",5,"complexity");
		
		return Arrays.asList(rapid1,rapid2,rapid3,rapid4,rapid5,rapid6);
	}

}
