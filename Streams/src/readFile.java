import java.io.FileReader;

public class readFile {

	public static void main(String[] args) {

		try {

			// We can read class by using Scanner, FileInputStream and FileReader
			FileReader reader = new FileReader("D:\\Streams\\create.txt");
			try {
				int i;
				// here read() returns value in form of integer but reads the value charachter
				// by charachet
				while ((i = reader.read()) != -1) {
					System.out.print((char) i);// we casted int i to char so that it can print actual value instead of
												// ASCII value.
				}
			} finally {
				reader.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
