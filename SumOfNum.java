import java.util.Scanner; // Scanner class
/**
 * Program asks user for an integer (n)
 * Then adds the values of all ints between 1 and n
 */
public class SumOfNum {
    public static void main(String[] args) {
        int userNum; 
        int total = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        userNum = keyboard.nextInt();

        int i = 0;
        while (i <= userNum) {
            total += i;
            i++;
        }
        System.out.println(total);

        keyboard.close();

    }
}
