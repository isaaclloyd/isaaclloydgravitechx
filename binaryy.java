import java.util.Scanner;

public class binaryy {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		String binary_num = scr.nextLine();
		int legit_num = 0;
		int length = binary_num.length() - 1;
		for(int i = length; i >= 0; i--){
			int num = binary_num.charAt(i);
			int power = length-i;
			legit_num += Math.pow(num, power);
			
		}
		System.out.println(legit_num);
		
	}
}