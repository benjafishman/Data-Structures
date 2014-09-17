import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args){
		//int ids = 1;
		/*
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = in.readLine();
			
			System.out.println("You just entered:  " + line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(args[0]);
		*/
		MinHeap testHeap = new MinHeap(2);
		testHeap.insert(new Node(1,30,"one"));
		testHeap.insert(new Node(2,30,"two"));
		testHeap.insert(new Node(3,15,"three"));
		testHeap.insert(new Node(4,25,"four"));
		/*
		 
		testHeap.insert(new Node(1,197812,"re-hash"));
		testHeap.insert(new Node(2,78906,"5-4"));
		
		testHeap.insert(new Node(3,189518,"tomorrow_comes_today"));
		testHeap.insert(new Node(4,39453,"new_genious"));
		
		testHeap.insert(new Node(5,210492,"clint_eastwood"));
		testHeap.insert(new Node(6,26302,"man_research"));
		testHeap.insert(new Node(7,22544,"punk"));
		testHeap.insert(new Node(8,19727,"sound_check"));
		testHeap.insert(new Node(9,17535,"double_bass"));
		testHeap.insert(new Node(10,18782,"rock_the_house"));
		testHeap.insert(new Node(11,198189,"19_2000"));
		
		testHeap.insert(new Node(12,13151,"latin_simone"));
		testHeap.insert(new Node(13,12139,"starshine"));
		testHeap.insert(new Node(14,11272,"slow_country"));
		testHeap.insert(new Node(15,10521,"m1_a1"));
		*/
		
		
		testHeap.print();
		
		System.out.println("DONE");
	}
}
