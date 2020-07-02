package day21listsdt;

import java.util.ArrayList;
import java.util.List;

public class QuizConstructor {

		List<String> list1 = new ArrayList<String>();

		public static void main(String[] args) {

			QuizConstructor obj1 = new QuizConstructor();

			obj1.myMethod(obj1.list1);

			obj1.list1.add("z");

			obj1.list1.add("t");

			System.out.println(obj1.list1);

		}

		public List<String> myMethod(List<String> list1) {

			list1.add("x");

			list1.add("y");

			return list1;

		}

	}
