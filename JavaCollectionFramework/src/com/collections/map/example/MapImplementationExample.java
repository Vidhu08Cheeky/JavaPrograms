package com.collections.map.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Program illustrating the methods present in the Map Interface*/
public class MapImplementationExample {

	public static void main(String[] args) {
        //create a map
   Map<String, String> country_map = new HashMap<>();
  
   //assigning values to the map
   country_map.put("IND", "India"); 
   country_map.put("SL", "Srilanka");
   country_map.put("CHN", "China");
   country_map.put("KOR", "Korea"); 
   country_map.put(null, "Z"); // null key
   country_map.put("XX", null); // null value

   String value = country_map.get("CHN");    // example for get method 
   
   System.out.println("Key = CHN, Value : " + value);

   value = country_map.getOrDefault("XX", "Default Value"); //getOrDefault
   System.out.println("\nKey = XX, Value : " + value);

   boolean keyExists = country_map.containsKey(null);     //containsKey
   boolean valueExists = country_map.containsValue("Z");  //containsValue

   System.out.println("\nnull keyExists : " + keyExists + ", null valueExists= " + valueExists);

   Set<Entry<String, String>> entrySet = country_map.entrySet();  //entrySet
   System.out.println("\nentry set for the country_map: " + entrySet);

   System.out.println("\nSize of country_map : " + country_map.size());  //size

   Map<String, String> data_map = new HashMap<>();
   data_map.putAll(country_map);       //putAll
   System.out.println("\ndata_map mapped to country_map : " + data_map);

   String nullKeyValue = data_map.remove(null);  //remove
   System.out.println("\nnull key value for data_map : " + nullKeyValue);
   System.out.println("\ndata_map after removing null key = " + data_map);

   Set<String> keySet = country_map.keySet();      //keySet - Returns the set view of the keys in the Map Interface 
    System.out.println("\ndata map keys : " + keySet);

       Collection<String> values = country_map.values();   //values
       System.out.println("\ndata map values : " + values);

       country_map.clear();        //clear - it will empty the map interface
       System.out.println("\ndata map after clear operation, is empty :" + country_map.isEmpty());
   }
}
