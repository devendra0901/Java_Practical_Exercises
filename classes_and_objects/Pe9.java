package myFirstProject;

import java.io.*;

public class Pe9 {

	public static void main(String a[]) throws IOException {
		File folder = new File("/home/devendra/Desktop/spring/stackroute/myFirstProject/files/");
		File[] files = folder.listFiles(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return (name.toLowerCase().endsWith(".csv"));
			}
		});
		for (File f : files) {
			String fileName = f.getPath();
			InputStream is = null;
			try {
				is = new FileInputStream(fileName);
				byte content[] = new byte[2 * 1024];
				int readCount = 0;
				while ((readCount = is.read(content)) > 0) {
					System.out.println(new String(content, 0, readCount - 1));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (is != null)
						is.close();
				} catch (Exception ex) {

				}
			}
		}
	}
}
