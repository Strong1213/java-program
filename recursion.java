public class recursion {
    // print the 5 to 1
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1); // recursion call
    }

    public static void main(String[] args) {
        printNum(5);  // yaha se function call karenge
    }
}


