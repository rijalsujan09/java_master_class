package java3.fileclas;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
	public static void main(String args[]) {

		try {
			FileWriter write = new FileWriter("poem.txt");
			write.write("Roses are red\nViolet are blue");
			write.append("\n-by sujan rijal");
			write.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
