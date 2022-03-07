import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) throws IOException {

		FileWriter writer=new FileWriter("D:\\All Coding stuff\\CoreJava\\Demo.txt");
		writer.write("Hello World!!!!");
		writer.close();
		System.out.println("Sucessfully writed text");
	}

}
