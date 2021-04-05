package DataStructure;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Java_Stack {
    public static void main(String[] args) {
        HashMap<Character, Character > map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String input=scan.next(); 
            
            System.out.println(isBalanced(input, map) ? "true":"false");
        }
        scan.close();
    }

    private static boolean isBalanced(String input, HashMap<Character, Character >map) {
        if ((input.length()%2)!=0) {
            return false; 
        }
        ArrayDeque<Character> deque = new ArrayDeque<>(); //use deque as a stack
        for (int i = 0; i < input.length(); i++){
            Character ch = input.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            }
            else if(deque.isEmpty() || ch != map.get(deque.pop())){
                return false;
            }
        }
        return deque.isEmpty();
    }
}
