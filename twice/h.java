package twice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class h {
    public static Set<Integer> twice(List<Integer> list) {
    Map<Integer, Integer> counts = new HashMap<>();
         
    for (int num : list) {
        counts.put(num, counts.getOrDefault(num, 0) + 1);
    }
    
    Set<Integer> result = new HashSet<>();
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
        if (entry.getValue() == 2) {
            result.add(entry.getKey());
        }
    }
    
    return result;
}
}
