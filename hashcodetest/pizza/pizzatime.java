package pizza;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class pizzatime {


	

		public static void main(String[] args) throws IOException {

			Scanner scan = new Scanner(new File("a_example (2).in"));
			int n = scan.nextInt();
			int pizzas = scan.nextInt();
			int counter = 0;
			int[] a = new int[pizzas];
			for (int i = 0; i < pizzas; i++) {
				a[i] = scan.nextInt();
			}

			// scan.close();

			File file = new File("small");

			if (!file.exists()) {
				file.createNewFile();
			}

			PrintWriter pw = new PrintWriter(file);
			pw.print("1"+"\n");
			//while (n - counter > a[0]) {
				counter += a[0];
				pw.print("0" + " ");
			
			pw.close();
			System.out.println("Done!");

		
	}
}


