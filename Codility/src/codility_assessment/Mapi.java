package codility_assessment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> maps = new HashMap<Integer,String>();
maps.put(101,"stgg");
maps.put(102,"dfdfd");

	for(Map.Entry m : maps.entrySet()) {
		System.out.println(m.getValue());
	}

}
}
