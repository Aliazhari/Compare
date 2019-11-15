package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ali
 * @File CompareDemo
 *
 */
public class CompareDemo {

	public static void main(String[] args) {
		

		List<Computer> computers = new ArrayList<>();
		
		computers.add(new Computer("HP", 16, 500, 699.99));
		computers.add(new Computer("Samsung", 8, 250, 400.00));
		computers.add(new Computer("Dell", 4, 1000, 500.99));
		computers.add(new Computer("HP", 16,1000, 850.99));
		
		
		Collections.sort(computers);
		
		System.out.println("Printing the list in order by price");
		
		for (Computer c : computers) {
			System.out.println(c);
		}
		
		

	}

}
