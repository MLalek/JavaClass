package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW {
	/* create a list of arraylist
     * add the courses:
     * java, selenium, testing, junit, cucumber,api,sql,database,sdlc
     * print the elements from index 2 to index 7 using sublist: list.sublist(2,7);
     * using iterators, remote if the string value has e and t
     */

	public static void main(String[] args) {
		
		List<String> course=new ArrayList<>();
		course.add("java");
		course.add("selenium");
		course.add("testing");
		course.add("unit");
		course.add("cucumber");
		course.add("api");
		course.add("sql");
		course.add("database");
		course.add("sdls");
		System.out.println(course);
		
		
		System.out.println(course.subList(2, 7));
		
		Iterator<String>list2 = course.iterator();
		while(list2.hasNext()) {
			String str=list2.next();
			if(str.contains("e") && str.contains("t")) {
				list2.remove();
			}
		}
		System.out.println(course);
		
	}

}
