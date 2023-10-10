package cv04_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		List<String> words = new LinkedList<>();
		TreeMap<String, Integer> words1 = new TreeMap<>();
		System.out.println("Hello world");
		System.out.println(new File(".").getAbsolutePath());
		try {
			File f = new File("test.txt");
			Scanner in = new Scanner(f).useDelimiter("\s");
			while(in.hasNext())
			{
				String word = in.next();
				if(words1.containsKey(word))
				{
					int count1 = words1.get(word).intValue() + 1;
					words1.put(word, count1);
				}
				else{
					count++;
					words1.put(word, count);
				}
				count = 0;
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(count);
//		for (String word : words1)
//		{
//			System.out.println(word);
//		}
		System.out.println(words1);
	}

}
