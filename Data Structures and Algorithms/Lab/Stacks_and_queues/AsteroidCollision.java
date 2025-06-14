public class AsteroidCollision {
    public static void main(String[] args) {
        /*
         * Problem does not explicitly mention that double or tripple popping is required
         * It handles only for adjacent asteroids
         */
        int[] arr = {5,10,-5};
        LinkedListStack<Integer> stack  = new LinkedListStack<>();
        for(int i = 0; i < arr.length;i++){
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            else{
                if ((stack.top() > 0 && arr[i] > 0) || (stack.top() < 0 && arr[i] < 0)) {
                    stack.push(arr[i]);
                }
                else{
                    if (arr[i] < 0) {//asteroid moving leftwards
                        if (stack.top() == arr[i] * -1) {//asteroid moving leftwards has the same size
                            stack.pop();
                        }
                        else if (stack.top() < arr[i] * -1) {
                            stack.pop();
                            stack.push(arr[i]);
                        }
                    }
                    if (arr[i] > 0) {//asteroid moving rightwards
                        if (stack.top() * -1 == arr[i]) {
                            stack.pop();
                        }
                        else if (stack.top() * -1 < arr[i]) {
                            stack.pop();
                            stack.push(arr[i]);
                        }
                    }
                }
            }
        }
        stack.printStack();
    }
}
