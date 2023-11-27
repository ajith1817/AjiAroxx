package org.sam;

import java.io.File;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Aroxx\\document\\java.txt");
		f.mkdirs();

		boolean createNewFile = f.createNewFile();
        System.out.println(createNewFile);

		boolean file = f.isFile();
        System.out.println(file);

		boolean directory = f.isDirectory();
		System.out.println(directory);

		boolean canRead = f.canRead();
		System.out.println(canRead);

		boolean canWrite = f.canWrite();
		System.out.println(canWrite);

		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
	}
}
