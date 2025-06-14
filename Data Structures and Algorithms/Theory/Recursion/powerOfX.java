public class powerOfX {
    public static void main(String[] args) {
        int x = 2,n = -1;
        double fnOutput = power(x,n);
        System.out.println(fnOutput);
    }

    public static double power(int x,int n){
        if (n < 0) {
            return 1 / power(x, -n);
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        else{
            return x * power(x, n - 1); 
        }
    }
}
