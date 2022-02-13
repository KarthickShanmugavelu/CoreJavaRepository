package tryWithResources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String args[]) {
		
		File filename = new File("Test.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}