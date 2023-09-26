package cv01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		List<String> words = new ArrayList<>();
		System.out.println("Hello world");
		System.out.println(new File(".").getAbsolutePath());
		try {
			File f = new File("test.txt");
			Scanner in = new Scanner(f).useDelimiter("\s");
			while(in.hasNext())
			{
				count++;
				words.add(in.next());
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
		for (String word : words)
		{
			System.out.println(word);
		}
	}
	
	private static void PrintHelloWorld() {
		System.out.println("Hello World?");
	}

}
