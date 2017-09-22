import java.io.*;

public class Pe4 {

	public static void main(String args[]) throws IOException {
		FileInputStream in = null;

		try {
			in = new FileInputStream("/home/devendra/Desktop/spring/stackroute/myFirstProject/bin/input.txt");
			int c;
			System.out.println("Size of file :" + in.available());
			System.out.println("Contents of file conerted to uppercase :");
			while ((c = in.read()) != -1) {
				char ch = (char) c;
				System.out.print(Character.toUpperCase(ch));
			}
		} finally {
			if (in != null) {
				in.close();
			}

		}
	}
}
