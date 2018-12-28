package ua.testov.test;

import java.io.File;

import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
	private String[] str = new String[] { "docx", "doc" };

	public MyFileFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	private boolean check(String ext) {
		for (String stringExt : str) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}
}
