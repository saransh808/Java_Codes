package lab11;


import java.util.*;


public class CollectionArrayList {

	
	
	public static void main(String[] args) {
		
		
		//ArrayList
		List<String> a1 = new ArrayList<String>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Saransh");
		a1.add("Ayan");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);
		a1.remove(1);
		System.out.println("\n After Deleting objrct 1");
		System.out.println("\t"+a1);
		
		
		//LinkedList
		List<String> l1 = new LinkedList<String>();
		l1.add("Saransh");
		l1.add("Rajat");
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);
		l1.remove("Zara");
		System.out.println("\n LinkedList Elements");
		System.out.print("\t" + l1);
		
	
		}
		
}
