package StacksAndQueues;

import java.util.HashMap;
import java.util.HashSet;

public class MatchingParathisisEx {

    private static final HashMap<Character, Character> matchingParamMap = new HashMap<>();
    private static final HashSet<Character> openingParamSet = new HashSet<>();

    static {
        matchingParamMap.put(')','(');
        matchingParamMap.put('}','{');
        matchingParamMap.put(']','[');
        openingParamSet.addAll(matchingParamMap.values());
    }

    public static boolean hasMatchingPattern(String input) throws Exception {
        Stack<Character> matchStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (openingParamSet.contains(ch)){
                matchStack.push(ch);
            }
            if (matchingParamMap.containsKey(ch)){
                char lastparam = matchStack.pop();
                if (lastparam != matchingParamMap.get(ch)){
                    return false;
                }
            }
        }
        return matchStack.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(hasMatchingPattern("(ABC) {DEF} [XYZ (LMN)]{"));
    }

}