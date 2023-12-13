package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import mockClass.MockHelperItem;

class ItemTest {
	
	@Test
	@DisplayName("Create item ID with lowercase")
	void createNewItemLowerCase() {
		MockHelperItem mockHelperItem = new MockHelperItem("C#");
		assertEquals("c#", mockHelperItem.getID());
	}
	
	/*
	
	@Test
	@DisplayName("Create item ID as null")
	void createNewItemAsNull() throws InterruptedException {
		MockHelperItem mockHelperItem = new MockHelperItem(null);
	    assertNull(mockHelperItem.getID());
	    }
	    
	    */
	
	@Test
	@DisplayName("Create item ID as blank")
	void createNewItem() {
		MockHelperItem mockHelperItem = new MockHelperItem("");
		assertEquals("", mockHelperItem.getID());
	}
	
	@Test
	@DisplayName("Create item ID as number")
	void createNewItemAsNumber() {
		MockHelperItem mockHelperItem = new MockHelperItem("123");
		assertEquals("123", mockHelperItem.getID());
	}
	

	@Test
	@DisplayName("Create a item and set new ID as lower case")
	void createNewItemAndSetNewId() {
		MockHelperItem mockHelperItem = new MockHelperItem("Java");
		mockHelperItem.setId("but then Microsoft bought Oracle");
		mockHelperItem.setId("C#");
		assertEquals("c#", mockHelperItem.getID());
	}
	
	/*
	@Test
	@DisplayName("Create a item and set new ID as null")
	void createNewItemAndSetNewIdAsNull() {
		MockHelperItem mockHelperItem = new MockHelperItem("Java");
		mockHelperItem.setId(null);
		assertEquals("java", mockHelperItem.getID());
	}
	*/
	
	@Test
	@DisplayName("Create a item and set new ID as blank")
	void createNewItemAndSetNewIdAsBlank() {
		MockHelperItem mockHelperItem = new MockHelperItem("Java");
		mockHelperItem.setId("");
		assertTrue(mockHelperItem.getID().isBlank());
	}
	
	@Test
	@DisplayName("Set new ID to Item as numbers")
	void createNewItemAndSetNewIdAsNumbers() {
		MockHelperItem mockHelperItem = new MockHelperItem("Java");
		mockHelperItem.setId("1982");
		assertEquals("1982", mockHelperItem.getID());
	}
	
	@Test
	@DisplayName("Print the Item's ID")
	void printItemId() {
		MockHelperItem mockHelperItem = new MockHelperItem("C#");
		assertEquals("c#", mockHelperItem.toString());
	}
	
	/*
	@Test
	@DisplayName("Print the Item's ID")
	void printItemIdAsNull() {
		MockHelperItem mockHelperItem = new MockHelperItem(null);
		assertEquals("c#", mockHelperItem.toString());
	}
	*/
	
	@Test
	@DisplayName("Print the Item's ID as blank")
	void printItemIdAsBlank() {
		MockHelperItem mockHelperItem = new MockHelperItem("");
		assertTrue(mockHelperItem.toString().isBlank());
	}
	
	@Test
	@DisplayName("Print the Item's ID as numbers")
	void printItemIdAsNumbers() {
		MockHelperItem mockHelperItem = new MockHelperItem("1982");
		assertEquals("1982", mockHelperItem.toString());
	}
}
