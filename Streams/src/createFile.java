import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) throws IOException {
		
		File file= new File("D:\\All Coding stuff\\CoreJava\\Demo.txt");
		
		if(file.createNewFile()) {
			System.out.println("Created Successfully");
		}
		else {
			System.out.println("Already created...!!");
		}
	}

}
