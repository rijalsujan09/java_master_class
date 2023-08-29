package java3.fileclas;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {

		File file = new File("test.txt");

		if (file.exists()) {
			System.out.println("that file exixt: " + file.isFile());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			file.delete();
		} else {
			System.out.println("file doesnot exixt");
		}
	}

}
