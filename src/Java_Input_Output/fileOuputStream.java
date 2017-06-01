/**
 * 
 */
/**
 * @author Star Blazh
 *
 */
package Java_Input_Output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Random;

public class fileOuputStream{
	public static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
	public static boolean FileOutputStream(String fullPath){
		try {
			FileOutputStream fis = new FileOutputStream(fullPath);
			for (int i = 0; i < 1000000; i++) {
				String data = "";
				for (int j=0;j < 30; j++) {
					data += CHARACTERS.toCharArray()[new Random().nextInt(CHARACTERS.length())];
				}
				fis.write(data.getBytes());
			}
			fis.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean BufferedOutputStream(String fname){
		OutputStream os;
		try {
			os = new FileOutputStream(fname);
			BufferedOutputStream bous = new BufferedOutputStream(os);
			for (int i = 0; i < 1000000; i++) {
				String data = "";
				for (int j=0;j < 30; j++) {
					data += CHARACTERS.toCharArray()[new Random().nextInt(CHARACTERS.length())];
				}
				bous.write(data.getBytes());
			}
			bous.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	@SuppressWarnings("resource")
	public static boolean BufferedWriter(String fname){
		//;
		try {
			Writer writer = new FileWriter(fname);
			java.io.BufferedWriter bw = new java.io.BufferedWriter(writer);
			for (int i = 0; i < 1000000; i++) {
				String data = "";
				for (int j=0;j < 30; j++) {
					data += CHARACTERS.toCharArray()[new Random().nextInt(CHARACTERS.length())];
				}
				bw.write(data);
				
			}
			bw.close();
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false ;
		}

		
	}
	
	
}