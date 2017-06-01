package Java_Input_Output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamMain {
	public static void main(String[] args) {
//		 long time = System.currentTimeMillis();
//		 String text = "My name is Professor Zoom and am the fastest speedstar in the universe 78";
//		 fileOuputStream.BufferedOutputStream("Fout.txt");
//		 System.out.printf("BufferedOutputStream Took %d milliseconds to finish write action", (System.currentTimeMillis() - time));
//		 
//		 time = System.currentTimeMillis();
//		 fileOuputStream.FileOutputStream("FOout.txt");
//		 System.out.printf("\nFileOutputStream Took %d milliseconds to finish write action", (System.currentTimeMillis() - time));
//		 
//		 
//		 time = System.currentTimeMillis();
//		 fileOuputStream.BufferedWriter("8888.txt");
//		 System.out.printf("\nBufferedWriter Took %d milliseconds to finish write action", (System.currentTimeMillis() - time));
//		 
//		 
//		 
		 try {
			 PrintStream consoleStream = new PrintStream(new FileOutputStream("test.txt"));
			 consoleStream.println("Out in console");
			 consoleStream.close();
		} catch (IOException e) {
			
		}
	}
}
