package week4day2assignment;

import java.util.Set;
import java.util.HashSet;


public class UniqueCharacters {
public static void main(String[] args) {
	String name="babub";
	char[] charArray=name.toCharArray();
	System.out.println(charArray);
	Set<String> val=new HashSet<String>();
	val.add("b");
	val.add("a");
	val.add("b");
	val.add("u");
	val.add("b");
	val.remove("b");
	System.out.println(val);
//	for (String string : val) {
//		System.out.println(val);
//		
	//}

	
}
}
