package lab11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hash {
	
	public static void main(String arhs[]){
		//HashSet
				Set<String> s1 = new HashSet<String>();
				s1.add("Saransh");
				s1.add("Agarwal");
				s1.add("Divyansh");
				System.out.println();
				System.out.println(" Set Elements");
				System.out.print("\t" + s1);
				
				
				//HashMap
				Map<String,String> m1 = new HashMap<String, String>();
				m1.put("4", "Saransh");
				m1.put("6", "Agarwal");
				m1.put("1", "Divyansh");
				m1.put("2", "Shinchan");
				System.out.println();
				System.out.println(" Map Elements");
				System.out.print("\t" + m1);
	}

}
