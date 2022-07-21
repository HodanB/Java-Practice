package com.example.demo.rest;

//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.Book;

import nl.jqno.equalsverifier.EqualsVerifier;


public class BookIntegrationTest {
	 @Test
	    public void testEquals() {
	        EqualsVerifier.simple().forClass(Book.class).verify();
	    }
}

//	@Test
//	void testHashCodeForEqualObjects() {
//	    Book book1 = new Book( "Cookie", "Jacqueline_Wilson", "Horror", 320, "2008");
//	    Book book2 = new Book( "Cookie", "Jacqueline_Wilson", "Horror", 320, "2008");
//
//	    int hashCode1 = book1.hashCode();
//	    int hashCode2 = book2.hashCode();
//
//	    assertThat(hashCode1).isEqualTo(hashCode2);
//	}
//	
//	@Test
//	void testEqualBook() {
//		Book book1 = new Book( "Cookie", "Jacqueline_Wilson", "Horror", 320, "2008");
//	    Book book2 = new Book( "Cookie", "Jacqueline_Wilson", "Horror", 320, "2008");
//
//	    boolean equal = book1.equals(book2);
//	    assertThat(equal);
//	}
//}

	

