import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffering {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader =new InputStreamReader(System.in);
		BufferedReader input= new BufferedReader(reader);
		FileWriter writer= new FileWriter("C:\\Users\\Hussam Selim\\Desktop\\Revision on selenium\\test.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		String s="";
		System.out.println("Hello");
		while (!s.equals("stop")) {
			try {
				System.out.println("Enter your name ");
				s=input.readLine();
				buffer.write(s);
				buffer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		 buffer.close();
	}

}
