package day24varargsaccessmodifiersstringbuilderdt;

import java.util.ArrayList;
import java.util.List;

public class VarargsQs02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	List<String>list = new ArrayList<String>();
	
	list.add("one");
	list.add("two");
	list.add("7"); //hata veriyor
	for(String s : list){
		System.out.println(s);
	}
	
	
	
	}
}
