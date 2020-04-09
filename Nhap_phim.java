package java_input_output_console;
import java.util.Scanner;
public class Nhap_phim {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	   System.out.println("nhap vao mot so nguyen: ");
	  int a = scanner.nextInt();// doc vao mot so nguyen vd 123
		System.out.println("nhap vao mot so float: ");
		float floatValue = scanner.nextFloat();
		System.out.println("nhap vao mot so thuc: ");
		double doubleValue= scanner.nextDouble();
		
		//System.out.println(a+"-"+floatValue+"-"+doubleValue);
		System.out.println("nhap vao mot kki tu:");
		 char c= scanner.next().charAt(0);
		System.out.println("dung vua nhap:"+c); 
		System.out.println("nhap vao mot dong:"); 
		String none= scanner.nextLine();
		System.out.println("dung vua nhap: "+ none);
		scanner.nextLine();
		System.out.println("moi ban chon true/false:");
		boolean pill= scanner.nextBoolean();
		System.out.println("dung vua nhap:"+pill);
		System.out.println(a+"-"+floatValue+"-"+doubleValue+"-"+c+"-"+none+"-"+pill);
		
	}		

}