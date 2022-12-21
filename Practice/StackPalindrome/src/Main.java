import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        for(int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        for(int i = 0; i < input.length(); i++) {
            char ci = input.charAt(i);
            char cs = stack.pop();

            if(ci != cs) {
                isPalindrome = false;
                break;
            }
        }

        System.out.print("The word " + input);

        if(isPalindrome){
            System.out.print(" is palindrome");
        } else {
            System.out.print(" is not palindrome");
        }
        System.out.println();
    }
}