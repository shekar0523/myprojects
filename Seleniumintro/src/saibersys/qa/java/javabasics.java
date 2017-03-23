package saibersys.qa.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import saibersys.qa.java2.Employee;
import saibersys.qa.java2.Mammal;
import saibersys.qa.java2.Salary;

public class javabasics {
	
	public static void main(String args[]){
		javabasics obj1 = new javabasics();
		obj1.noreturn();
		obj1.noreturnparameter(10);
		System.out.println(obj1.withreturn());
		String str=obj1.withreturnparameter(20);
		System.out.println(str);
		staticmethod();
		try{
			System.out.println(1/0);
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("try block has 1/0 so it will throw exception");
		}
		Mammal m = new Mammal();  //class from different class
		m.eat();
		
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	    System.out.println("Call mailCheck using Salary reference --");
	    s.mailCheck();
	    System.out.println("\n Call mailCheck using Employee reference--");
	    e.mailCheck();
		//arrays
	    double[] myList = {1.9, 2.9, 3.4, 3.5};
	    double max = myList[0];
	    for (int i = 1; i < myList.length; i++) {
	        if (myList[i] > max) max = myList[i];
	    }
	    System.out.println("Max is " + max);
	    
	    //array list
	    ArrayList<String> al = new ArrayList<String>();
	    // add elements to the array list
	    al.add("C");
	    al.add("A");
	    al.add("E");
	    al.add("B");
	    al.add("D");
	    al.add("F");
	    al.add(1, "A2");
	    System.out.println("Size of al after additions: " + al.size());
      // display the array list
      System.out.println("Contents of al: " + al);
      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
      
      //hashmap 
      HashMap<Integer, String> newmap = new HashMap<Integer, String>();
      
      // populate hash map
      newmap.put(1, "tutorials");
      newmap.put(2, "point");
      newmap.put(3, "is best");
         
      // get value of key 3
      String val=(String)newmap.get(3);
      System.out.println("Value for key 3 is: " + val);
      
      newmap.remove(2);
      System.out.println("Values after remove: "+ newmap);
      newmap.replace(3, "is better");
      
      
      //hashset
      HashSet<String> hs = new HashSet<String>();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println("hashsey values" +hs);
      
      //Iterator
      Iterator<String> itr=hs.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
      
	}
	
	public static void staticmethod(){
		System.out.println("this is a static method");
	}
	
	public void noreturn(){
		System.out.println("Void method with no parameters");
	}
	
	public void noreturnparameter(int x){
		System.out.println("voidmethod with parameter x = "+x);
	}
	public String withreturn(){
		return "return method with no parameters";
	}
	
	public  String withreturnparameter(int x){
		return "return method with parameter x = "+x;
	}
}
