package com.cg.iter.lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		try {
			fr = new FileReader("source.txt");
			fw = new FileWriter("target.txt");
			CopyData copyDataThread=new CopyData(fr,fw);
			copyDataThread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
