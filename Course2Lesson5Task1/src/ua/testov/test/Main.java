package ua.testov.test;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File("test.docx");
		File out = new File("copy.doc");
		try {
			FileOperation.fileCopyDocx(in, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
