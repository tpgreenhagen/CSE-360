/**
 * Tanner Greenhagen
 * CSE 360 Wednesday
 * Assignment 1
 * Class ID: 426
 * This is a class that tests the SimpleList class
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testthing {
	
	@Test 
	void test_append(){
		SimpleList list = new SimpleList();
		
		list.append(10);
		int first = list.first();
		assertEquals(first,10);
		String test = list.toString();
		assertEquals("10", test);
		list.append(9);
		test = list.toString();
		assertEquals("10 9", test);
		list.append(8);
		test = list.toString();
		assertEquals("10 9 8", test);
		first = list.first();
		assertEquals(first,10);
		list.append(7);
		list.append(6);
		list.append(5);
		list.append(4);
		list.append(3);
		list.append(2);
		list.append(1);
		test = list.toString();
		assertEquals("10 9 8 7 6 5 4 3 2 1", test);
		first = list.first();
		assertEquals(first,10);
		
		list.add(10);
		list.add(9);
		first = list.first();
		assertEquals(first,9);
		list.add(8);
		first = list.first();
		assertEquals(first,8);
		list.add(7);
		test = list.toString();
		assertEquals("7 8 9 10 10 9 8 7 6 5 4 3 2 1", test);
		
		list.append(6);
		test = list.toString();
		assertEquals("7 8 9 10 10 9 8 7 6 5 4 3 2 1 6", test);
		
		
		list.remove(7);
		first = list.first();
		assertEquals(first,8);
	}
	
	@Test
	void test_add() {
		SimpleList list = new SimpleList();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		String test = list.toString();
		assertEquals("1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10", test);
		
		list.add(20);
		test = list.toString();
		assertEquals("20 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10", test);
	}
	
	@Test
	void test_size() {
		SimpleList list = new SimpleList();
		
		int size = list.size();
		assertEquals(size,10);
		
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		
		size = list.size();
		assertEquals(size,10);
		
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(10);
		size = list.size();
		assertEquals(size,15);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		size = list.size();
		assertEquals(size,15);
		list.add(5);
		size = list.size();
		assertEquals(size,22);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		size = list.size();
		assertEquals(size,22);
		
		
	}
	
	@Test
	void test_size2() {
		SimpleList list = new SimpleList();

		list.add(10);
		list.add(9);
		list.remove(9);
		int size = list.size();
		assertEquals(size,7);
		
		list.remove(10);
		size = list.size();
		assertEquals(size,5);
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		size = list.size();
		assertEquals(size,7);
		
		list.add(4);
		list.add(3);
		size = list.size();
		assertEquals(size,10);
		list.remove(10);
		size = list.size();
		assertEquals(size,7);
		list.remove(9);
		size = list.size();
		assertEquals(size,7);
		list.remove(8);
		size = list.size();
		assertEquals(size,5);
	}
	
	
	@Test
	void test_add_ten_numbers() {
		SimpleList list = new SimpleList();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		String test = list.toString();
		assertEquals("1 2 3 4 5 6 7 8 9 10", test);
	}
	
	@Test
	void test_add_eleven_numbers() {
		SimpleList list = new SimpleList();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(0);
		
		String test = list.toString();
		assertEquals("0 1 2 3 4 5 6 7 8 9 10", test);
	}

	
	
	@Test
	void test_remove_number() {
		SimpleList list = new SimpleList();
		list.add(10);
		list.remove(10);
		String test = list.toString();
		assertNotEquals("10", test);
	}
	
	@Test
	void test_remove_multiple_numbers() {
		SimpleList list = new SimpleList();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		list.remove(10);
		list.remove(12);
		list.remove(14);

		String test = list.toString();
		assertEquals("13 11", test);
	}
	
	
	
	@Test
	void test_number_of_elements() {
		SimpleList list = new SimpleList();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		assertEquals(5,list.count());

	}
	
	@Test
	void test_number_of_elements_when_over_ten_added() {
		SimpleList list = new SimpleList();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		assertEquals(15,list.count());

	}
	
	
	
	@Test
	void test_search_with_no_elements() {
		SimpleList list = new SimpleList();
		assertNotEquals(0,list.search(10));
	}
	
	@Test
	void test_search_with_multiple_elements() {
		SimpleList list = new SimpleList();

		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		assertEquals(2,list.search(3));
	}
	
	@Test
	void test_toString() {
		SimpleList list = new SimpleList();
		String test = list.toString();
		assertEquals("", test);
	}
	
	@Test
	void test_toString_spacing() {
		SimpleList list = new SimpleList();
		String test = list.toString();
		list.add(10);
		assertNotEquals("10 ", test);
	}
}
