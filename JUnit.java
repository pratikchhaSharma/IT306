package IT306Project;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class JUnit {

	@Test
	public void test() {
		LinkedList <item>tester= new LinkedList<item>(); //creates a linked list
		
		//creates objects and adds them to the linked list 'tester'
		tester.add(new journal("IT 306 Test", "Guilcon", "horror", "QuangQuach","1/1/19",10.0));
		tester.add(new book("Best Professor Ever: Setareh Rafatirad", "Barack Obama", "Non-Fiction", "Tree-House","5/31/2019",1000));
		tester.add(new cd("It 306 Mixtape", "G-Money and Lil Q", "Rap/Hip-Hop", "BMI","2/14/19",4.77));
		
		//The next three blocks of code check if all getters for the DDC's work
		assertEquals(10.0,tester.get(0).getPrice(), 0.0000);
		assertEquals("IT 306 Test",tester.get(0).getName());
		assertEquals("Guilcon",tester.get(0).getAuthor());
		assertEquals("horror",tester.get(0).getGenre());
		assertEquals("QuangQuach",tester.get(0).getPublisher());
		assertEquals("1/1/19",tester.get(0).getPublicationDate());
		
		assertEquals(1000,tester.get(1).getPrice(), 0.0000);
		assertEquals("Best Professor Ever: Setareh Rafatirad",tester.get(1).getName());
		assertEquals("Barack Obama",tester.get(1).getAuthor());
		assertEquals("Non-Fiction",tester.get(1).getGenre());
		assertEquals("Tree-House",tester.get(1).getPublisher());
		assertEquals("5/31/2019",tester.get(1).getPublicationDate());
		
		assertEquals(4.77,tester.get(2).getPrice(), 0.0000);
		assertEquals("It 306 Mixtape",tester.get(2).getName());
		assertEquals("G-Money and Lil Q",tester.get(2).getAuthor());
		assertEquals("Rap/Hip-Hop",tester.get(2).getGenre());
		assertEquals("BMI",tester.get(2).getPublisher());
		assertEquals("2/14/19",tester.get(2).getPublicationDate());
		
		//Checks size of linked list
		assertEquals(3,tester.size());
		tester.remove(0); //removes an object from the list
		assertEquals(2,tester.size()); //Checks the size of updated linked list
		
		tester.get(0).setAuthor("Michael Jordan"); //Tests the setters for book class, all setters function the same in every class
		assertEquals("Michael Jordan", tester.get(0).getAuthor()); //Checks expected author with given author
		}

}
