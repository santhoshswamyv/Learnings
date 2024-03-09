package task3;

import java.util.Map;

public class MapAB4 {
	public static void main(String[] args) {
		MapAB4 s=new MapAB4();
		System.out.println(s.mapAB4(null));
	}
	public Map<String, String> mapAB4(Map<String, String> map) {
		  if(map.containsKey("a")&&map.containsKey("b")){
		    if(map.get("a").length()>map.get("b").length()){
		      map.put("c",map.get("a"));
		    }else if(map.get("a").length()==map.get("b").length()){
		      map.put("a","");
		      map.put("b","");
		    }else{
		      map.put("c",map.get("b"));
		    }
		  }
		  
		  return map;
		}

}
