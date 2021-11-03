package Test.Ques2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileImport {

	public static void main(String[] args) {
		
		FileHandler objfh = new FileHandler();
		objfh.readBytesFromFile();

	}

}

class FileHandler
{
   
	public void readBytesFromFile()
	{
		File objfile = new File("C:\\Users\\Mobile Programming\\javaMPL-main\\Test\\Ques2\\Input.txt");
		File objfile2 = new File("C:\\Users\\Mobile Programming\\javaMPL-main\\Test\\Ques2\\Output.txt");
		
		try {
			FileInputStream fis = new FileInputStream(objfile);
			byte arrBytes[] = new byte[(int)objfile.length()];
			
			fis.read(arrBytes);
			
			String str = new String(arrBytes);
			System.out.println(str);
			fis.close();
			
			
			
			
			FileOutputStream fos = new FileOutputStream(objfile2);
			
			
			fos.write(str.getBytes());
			
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}