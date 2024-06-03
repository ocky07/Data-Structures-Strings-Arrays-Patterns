package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashT{
public static void main(String[] args) {
	
    Set<Integer> s=new LinkedHashSet<>();
    s.add(10);
    s.add(70);
    s.add(40);
    s.add(50);
    s.add(50);
    s.add(70);
    s.add(80);
    
  //  Collections.sort(h.keySet());
	
     for(int key:s) {
	System.out.println(key);
}
}
}
