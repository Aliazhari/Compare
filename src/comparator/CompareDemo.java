package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.Computer;

/**
 * @author Ali
 * @File CompareDemo.java
 *
 */
public class CompareDemo {

	public static void main(String[] args) {

		List<Computer> computers = new ArrayList<>();

		computers.add(new Computer("HP", 16, 500, 699.99));
		computers.add(new Computer("Samsung", 8, 250, 400.00));
		computers.add(new Computer("Dell", 4, 1000, 500.99));
		computers.add(new Computer("HP", 16, 1000, 850.99));

		Comparator<Computer> com = new Comparator<Computer>() {

			@Override
			public int compare(Computer computer1, Computer computer2) {
				if (computer1.getDisk() > computer2.getDisk())
					return 1;
				else
					return -1;
			}

		};

		Collections.sort(computers, com);

		System.out.println("Printing the list in order by Disk");

		for (Computer c : computers) {
			System.out.println(c);
		}

	}

}
