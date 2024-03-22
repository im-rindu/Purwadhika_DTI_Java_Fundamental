public class App {
	public static void main(String[] args) throws Exception {
		double salaries[] = {5000000, 7000000, 4000000};
		boolean isMarried[] = {true, false, true};
		byte ages[] = {25, 24, 26};
		for(byte i = 0; i < ages.length; i++){
			System.out.print("Age : " + ages[i] + " ");
			System.out.print("Salary : " + salaries[i]+ " ");
			System.out.print("Married? : " + isMarried[i]+ " \n");
		}
		int num = 5;
		System.out.println("Unary Plus: "+ +num);
		System.out.println("Unary Min: "+ -num);
		System.out.println("Unary dec: "+ num--);
		System.out.println("Unary Inc: "+ num++);
		System.out.println("Unary dec: "+ num);
	}
}