import java.util.Scanner;

public class Fizbuz {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        int muchNumber = myScanner.nextInt();
        myScanner.close();
        for(int i = 1; i <= muchNumber; i++){
            if(i%3==0 && i%5==0){
                System.out.print(" FizzBuzz ");
            }
            else if(i%3==0){
                System.out.print(" Fizz ");
            }
            else if(i%5==0){
                System.out.print(" Buzz ");
            }
            else{
                System.out.print(" "+ i+" ");
            }
        }
    }
}
