package ua.testov.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

	public FileOperation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void fileCopyDocx(File in, File out) throws IOException {
		MyFileFilter mFF = new MyFileFilter();

		byte[] buffer = new byte[1024 * 1024];
		int readByte = 0;

		if (mFF.accept(in) & mFF.accept(out)) {
			try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {
				for (; (readByte = fis.read(buffer)) > 0;) {
					fos.write(buffer, 0, readByte);
				}

			} catch (IOException e) {
				throw e;
			}
		} else {
			System.out.println("Файл повинен бути формату .doc, .docx"); 
		}
	}
}
