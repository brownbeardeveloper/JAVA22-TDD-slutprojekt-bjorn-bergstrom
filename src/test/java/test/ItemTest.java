package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import mockClass.MockHelperItem;

class ItemTest {
	
	@Test
	@DisplayName("Create item ID with lowercase")
	void createNewItemLowerCase() {
		MockHelperItem item = new MockHelperItem("C#");
		assertEquals("c#", item.getID());
	}
	
	@Test
	@DisplayName("Throws NullPointerException when trying create a new Item as null")
	void createNewItemAsNull() throws NullPointerException {
	    assertThrows(NullPointerException.class, () -> {
	        MockHelperItem item = new MockHelperItem(null);
	    });
	}
	
	@Test
	@DisplayName("Create item ID as blank")
	void createNewItem() {
		MockHelperItem item = new MockHelperItem("");
		assertEquals("", item.getID());
	}
	
	@Test
	@DisplayName("Create item ID as number")
	void createNewItemAsNumber() {
		MockHelperItem item = new MockHelperItem("123");
		assertEquals("123", item.getID());
	}
	

	@Test
	@DisplayName("Create a item and set new ID as lower case")
	void createNewItemAndSetNewId() {
		MockHelperItem item = new MockHelperItem("Java");
		item.setId("but then Microsoft bought Oracle");
		item.setId("C#");
		assertEquals("c#", item.getID());
	}
	
	@Test
	@DisplayName("Throws NullPointerException when trying set new Item ID as null")
	void createNewItemAndSetNewIdAsNull() {
		MockHelperItem item = new MockHelperItem("Java");
		
	    assertThrows(NullPointerException.class, () -> {
	    	item.setId(null);
	    });
	}
	
	@Test
	@DisplayName("Create a item and set new ID as blank")
	void createNewItemAndSetNewIdAsBlank() {
		MockHelperItem item = new MockHelperItem("Java");
		item.setId("");
		assertTrue(item.getID().isBlank());
	}
	
	@Test
	@DisplayName("Set new ID to Item as numbers")
	void createNewItemAndSetNewIdAsNumbers() {
		MockHelperItem item = new MockHelperItem("Java");
		item.setId("1982");
		assertEquals("1982", item.getID());
	}
	
	@Test
	@DisplayName("Print the Item's ID")
	void printItemId() {
		MockHelperItem item = new MockHelperItem("C#");
		assertEquals("c#", item.toString());
	}
	
	@Test
	@DisplayName("Print the Item's ID as blank")
	void printItemIdAsBlank() {
		MockHelperItem item = new MockHelperItem("");
		assertTrue(item.toString().isBlank());
	}
	
	@Test
	@DisplayName("Print the Item's ID as numbers")
	void printItemIdAsNumbers() {
		MockHelperItem item = new MockHelperItem("1982");
		assertEquals("1982", item.toString());
	}
}
