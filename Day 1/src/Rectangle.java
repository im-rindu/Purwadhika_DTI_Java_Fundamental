import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Length : ");
        int length = input.nextInt();
        System.out.print("Input Width : ");
        int width = input.nextInt();
        input.close();

        System.out.println("Rectangle Area size is " + length*width);
        
    }
}
