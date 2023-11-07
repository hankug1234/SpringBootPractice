package com.crdt.implement.repository;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.crdt.implement.entityTable.Course;

@SpringBootTest
class CourseRepository3Test {

	@Autowired
	CourseRepository3 repository3;
	
	@Test
	void test() {
		Pageable pageable = PageRequest.of(0,5);
	}
	
	private List<Course> getCourses(){
		Course rapid1 = new Course("rapid1","spring",4,"complexity");
		Course rapid2 = new Course("rapid2","spring",5,"complexity");
		Course rapid3 = new Course("rapid3","spring",3,"complexity");
		Course rapid4 = new Course("rapid4","spring",5,"complexity");
		Course rapid5 = new Course("rapid5","spring",3,"complexity");
		Course rapid6 = new Course("rapid6","spring",5,"complexity");
		Course rapid7 = new Course("rapid7","spring",5,"complexity");
		Course rapid8 = new Course("rapid8","spring",3,"complexity");
		Course rapid9 = new Course("rapid9","spring",5,"complexity");
		
		return Arrays.asList(rapid1,rapid2,rapid3,rapid4,rapid5,rapid6,rapid7,rapid8,rapid9);
	}

}
