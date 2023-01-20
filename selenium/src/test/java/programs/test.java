package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.poi.util.SystemOutLogger;

public class test {

	public static void main(String[] args) {
		//a[]={1,2,3}
		//b[]={2,3,4}
	//	c[]={1,4}
		int [] a= {1,2,3};
		int b []= {2,3,4};
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		ArrayList< Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(hs.get(a[i])!=null) {
				hs.put(a[i], hs.get(a[i])+1);
			}
			else {
				hs.put(a[i], 1);
			}
			
		}
		for(int i=0;i<b.length;i++) {
			if(hs.get(b[i])!=null) {
				hs.put(b[i], hs.get(b[i])+1);
			}
			else {
				hs.put(b[i], 1);
			}
			
		}
		
		for(Map.Entry<Integer, Integer> s:hs.entrySet()) {
			if(s.getValue()<=1) 
			{al.add(s.getKey());}
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
