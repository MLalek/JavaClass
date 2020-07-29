package day43lambdadt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		//Crfeate 4 objects by using Course class
		//new Course den sonra ctrl space yazinca name of the objects geliyor
		Course courseTurkishDay = new Course ("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		//Add them into a list
		List<Course> list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		
		System.out.println(list);
		//[Summer - Turkish Day - 97 - 128, Winter - Turkish Night - 98 - 154, Spring - English Day - 95 - 132, Winter - English Night - 93 - 144]
		// Bu bilgiyi Course class da en sonda yazdigimiz toString sayesinde yapabiliyoruz
	
		//Check if all average scores are greater than 98
		boolean result1 = list.stream()
			.allMatch(t->t.getAverageScore()>98);
		System.out.println(result1);//false
		
		System.out.println("=======");
		//Check if all course names contain "Day" word
		boolean result2 = list.stream()
								.allMatch(t->t.getCourseName().contains("Day"));
								System.out.println(result2);
								
		System.out.println("=======");					
	   //Check if any number of student
		boolean result3 = list.stream()
			.anyMatch(t->t.getNumberOfStudents()==154);
		System.out.println(result3);//true
		
		//Check if any season id Winter
		boolean result4 = list.stream()
							  .anyMatch(t->t.getSeason().equals("Winter"));
		System.out.println(result4);
		
		//Check if no number of students is 100
		boolean result5 = list.stream()
			.noneMatch(t->t.getNumberOfStudents()==100);
		System.out.println(result5);
		
		//Sort the elements in natural order according to the average score
		list.stream()
		.sorted(Comparator.comparing(t->t.getAverageScore()))
		.forEach(t->System.out.println(t+" "));
		
		System.out.println("=========");
		//Sort elements in reverse order according to the number of students
		list.stream()
			.sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
			.forEach(t->System.out.println(t+" "));
		
		System.out.println("=============");
		//Sort the elements in reverse order according to the course name
		list.stream()
		.sorted(Comparator.comparing(Course::getCourseName).reversed())
		.forEach(System.out::println);
	}

}
