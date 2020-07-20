package day35interfacedt;
/*
 1) from interface to interface ==> use "extends"
 2) from class (abstract or concrete) to interface ==> use "implements"
 3) from class to class ==> use extends
 4  from interface to class: It is not valid. Because parent of an 
 interface must be interface
 */

public interface Gas extends Engine{
	
	int price = 1;
	
	void eco();

}
