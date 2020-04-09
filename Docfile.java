package java_input_output_console;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Docfile {
	public static void main(String[] args) throws IOException {
		Scanner scanner=
				new Scanner(Paths.get(
						"D:\\EXAMPLE.php.txt"), 
						"UTF-8");
		//int inputInteger;
		
		while (scanner.hasNextLine()){
			//inputInteger = scanner.nextInt();
			//System.out.println("value: "+ inputInteger);
			String lineData= scanner.nextLine();
			System.out.println("Second line Data: "+lineData) ;
		}
		    scanner.nextLine();
			String lineData = scanner.nextLine();
			System.out.println("Second line Data: "+lineData) ;
		    scanner.close();
	}




	}

