package assignmentselenium;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Phone");
		list.add("Watch");
		list.add("book");
		list.add("bag");
		for(String name:list)
		System.out.println(name);
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list);
//		}
		
	}

}
