package week4day2assignment;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MissingNumbers {
	public static void main(String[] args) {
		List<Integer> val=new ArrayList<Integer>();
		val.add(4);
		val.add(6);
		val.add(7);
		val.add(2);
		val.add(3);
		val.add(1);
		val.add(9);
		val.add(10);
		val.add(8);
		val.add(8);
		val.add(6);
		Collections.sort(val);
		System.out.println(val);
        for (int i=1;i<=val.size();i++) 
        {
         if(val.get(i-1)==i) {
        	 continue;
         }else {
        	 System.out.println(i);
         break;
		}		
        }
	}
	
}







