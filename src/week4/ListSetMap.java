package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Eugene Krabs");
		employeeNames.add("Squidward Tortellini");
		employeeNames.add("Spongebob Squarepants");
		employeeNames.add("Patrick Star");
		employeeNames.add("Pearl Krabs");
				
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	
		
		
		int i = 0;
		for(int id : ids) {
//			System.out.println(id + " " + employeeNames.get(i));
			employeeMap.put(id, employeeNames.get(i++));	
		}
		
		for(Integer key : employeeMap.keySet()) {
			System.out.println(key + " " + employeeMap.get(key));
			
		}
		//employeeMap.get(key) brings back value, not key
		
		StringBuilder idsBuilder = new StringBuilder();
		for(Integer id : ids) {
			idsBuilder.append(id + "-");
		}
//		System.out.println(idsBuilder);
		System.out.println(idsBuilder.toString());
		//Lines 49 and 50 print exactly the same content
		
		StringBuilder namesBuilder = new StringBuilder();
		for(String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		System.out.println(namesBuilder);
		System.out.println(namesBuilder.toString());
	}

}
