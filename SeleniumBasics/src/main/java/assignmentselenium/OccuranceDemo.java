package assignmentselenium;

import java.util.ArrayList;
import java.util.Iterator;

public class OccuranceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Lenovo");
		list.add("Dell");
		list.add("Samsung");
		list.add("Lenovo");
		list.add("Hp");
		list.add("Lenovo");
		int count=0;
		for(String name:list) {
			if(name.equals("Lenovo")) {
				count++;
				
			}
		
		}
		System.out.println("Occurrence of Lenovo is "+count);
	}

}

	