package com.dl.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Eg11 {
	
	static FileInputStream f1 = null;
	static File f = null;

	public static void main(String[] args) throws IOException {
		
		try {
			System.out.println("Try block");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Try block");
		} finally {
			System.out.println("Finally block");
		}
		try {
			f = new File("one.txt");
			f1 = new FileInputStream(f);
			byte[] readAllBytes = f1.readAllBytes();
			for (byte b :readAllBytes)
			System.out.print((char)b);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			f1.close();
		}
	}

}
