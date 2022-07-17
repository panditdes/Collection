package collection;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("I");
		
		list.add("Am");
		
		list.add("From");
		
		list.add("Latur");
		
		list.add("Which");
		
		list.add("Is");
		
		list.add("In");
		
		list.add("India");
		
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(1));
		
		System.out.println(list.get(2));
		
		System.out.println(list.get(3));
		
		System.out.println(list.get(4));
		
		System.out.println(list.get(5));
		
		System.out.println(list.get(6));
		
		System.out.println(list.get(7));
		
		//yaha iterator kaam mai atta hai.yaha iterator ka object banyege
		
		java.util.Iterator<String> it = list.iterator();
		
		//iterator ek ek element ke pass jayega aur hum jo operation bolege wo karega
		
		
		//we get all value in single while loop
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	

		//we can use for loop also
		
		for (String s: list)
		{
			
			System.out.println(s);
		}
		
		
		//list humne string ke liye banya hai.integer nahi le sakte.
		//object is supermost class hai is mai sab data sub method hai.to hum string ke jagah object lege. 
		
		
		List<Object> list1 = new ArrayList<>();
		
		
        list1.add("$");
		
		list1.add("Am");
		
		list1.add("$");
		
		list1.add("@");
		
		list1.add("%");
		
		list1.add("*");
		
		list1.add("15");
		
		
		java.util.Iterator<Object> it1 = list1.iterator();
		
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		
		
		
		
		
	}

}
