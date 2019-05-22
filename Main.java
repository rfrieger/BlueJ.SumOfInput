/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer sumOfNumbers = 0;
        
        
        for( int i = 1; i <= n; i++){
            sumOfNumbers += i;
        }
        System.out.println("The sum of the numbers beween 1 and " + n + " is " + sumOfNumbers);

    }
}
