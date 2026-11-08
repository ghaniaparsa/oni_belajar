import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;

public static List<String> processRegistrations(String[] entries) {
    Stack<String> stack = new Stack<>();
    Set<String> activeSet = new HashSet<>();
    
    for (String entry : entries) {
        if (entry.equals("UNDO")) {
            // Cancel the most recent successful registration if any exist
            if (!stack.isEmpty()) {
    String removed = stack.pop();
                activeSet.remove(removed);
            }
        } else {
            // Register only if the participant is not currently active
            if (!activeSet.contains(entry)) {
                activeSet.add(entry);
                stack.push(entry);
            }
        }
    }
    
    // Java's Stack preserves insertion order from bottom (earliest) to top (latest)
    return new ArrayList<>(stack);
}