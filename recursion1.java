public class recursion1 {
    // print the sum of n natural numbers"
    public static void printSum(int i, int n, int sum) {
        if (i ==n) {   // base case
            sum+=i;
            System.out.println("Total Sum = " + sum);
            return;
        }

        sum += i;  // current number add karo
        printSum(i + 1, n, sum); 
    
        
         // recursive call
    }

    public static void main(String[] args) {
        printSum(1, 5, 0); // 1 se 5 tak sum
    }
}
