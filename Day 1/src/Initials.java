import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        System.out.print("Input a name : ");
        Scanner input = new Scanner(System.in);
        String nameInput = input.nextLine();
        input.close();
        String[] names = nameInput.split(" ");
        String initial = "";
        for(String name : names){
            initial += name.charAt(0);
        }
        System.out.print("The initials : " + initial.toUpperCase());
    }
}
