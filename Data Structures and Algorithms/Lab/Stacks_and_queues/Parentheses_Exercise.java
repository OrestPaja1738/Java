import java.util.Scanner;

public class Parentheses_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();

        boolean status = checkCondition(expression);
        System.out.println(status);
    }
    public static boolean checkCondition(String expression){
        String opening = "([{";
        String closing = ")]}";
        LinkedListStack<Character> buffer = new LinkedListStack<>();
        for(char c : expression.toCharArray()){
            if (opening.indexOf(c) != -1) {//opening parentheses met
                buffer.push(c);
            }
            if (closing.indexOf(c) != -1) {//closing parentheses met
                if (buffer.isEmpty()) {
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;
                    /*
                     * Essentially you check if the closing parentheses you found matches with
                     * the top value of the stack out of the opening string
                     * The comparison is made via integers.
                     */
                }
            }
        }
        return buffer.isEmpty();
    }
}
