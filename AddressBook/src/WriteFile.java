import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	
	public static void main(String[] args) {
		FileWriter fw =null;
		PrintWriter pw = null;
		try {
			
			fw = new FileWriter("out.txt");
			pw = new PrintWriter(fw);
			pw.println();
			pw.flush();
			pw.close();
			fw.close();
		} catch ( IOException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
