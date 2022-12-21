import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("Choose an option to perform a task:");
            System.out.println("1 - To add elements into stack");
            System.out.println("2 - To remove the last element of the stack");
            System.out.println("3 - To peek the top element of the stack");
            System.out.println("4 - To verify if the stack is empty");
            System.out.println("5 - To show all elements in the stack");
            System.out.println("6 - To quit the program.");
            System.out.println();
            System.out.print("Choose an option: ");
            int command = Integer.parseInt(sc.nextLine());

            if(command == 1) {
                int number = Integer.parseInt(sc.nextLine());
                stack.push(number);
                System.out.println("Number added to the stack");
            } else if (command == 2) {
                int popped = stack.pop();
                System.out.println(popped + " removed from the stack");
            } else if (command == 3) {
                int peek = stack.peek();
                System.out.println(peek + " on the top of the stack");
            } else if (command == 4) {
                if (stack.empty()) {
                    System.out.println("The stack is empty");
                } else {
                    System.out.println("The stack is not empty");
                }
            } else if (command == 5) {
                System.out.println("Elements on the stack: ");
                for (int elem : stack) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            } else if (command == 6) {
                System.out.println("Quit!");
                break;
            }
        }

        System.out.println("End of the stack!");
    }
}