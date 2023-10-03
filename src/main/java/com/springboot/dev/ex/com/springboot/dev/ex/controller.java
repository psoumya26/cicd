package com.springboot.dev.ex.com.springboot.dev.ex;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RestController
public class controller {

	@RequestMapping("/greet")
	public String greetservice() {
		
		return "Good day to you";
	}

	//@RestController
	//public class CourseController {
		
		@RequestMapping("/courses")
		public List<Course> retrieveAllCourses() {
			return Arrays.asList(
					new Course(1, "Learn AWS", "class"),
					new Course(2, "Learn DevOps", "class"),
					new Course(3, "Learn Azure", "class"),
					new Course(4, "Learn GCP", "class"),
					new Course(5, "Learn Azure", "class")
					//add spring boot dev tools to maven
					);
		}
		
		
		
	
	}
