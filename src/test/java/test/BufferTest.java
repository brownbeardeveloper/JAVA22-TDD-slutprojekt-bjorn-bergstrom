package test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.Item;
import mockClass.MockConsumer;
import mockClass.MockHelperBuffer;
import mockClass.MockHelperItem;
import mockClass.MockProducer;

class BufferTest {
	
	@Test
	@DisplayName("Returns true when Producer is adding Item to B	uffer")
	void addItemToBufferAsProducerReturnsTrue() {
		MockHelperItem item = new MockHelperItem("C#");
		MockHelperBuffer buffer = new MockHelperBuffer();
		MockProducer producer = new MockProducer(buffer);
		assertTrue(producer.addItem(item));
	}
	
	@Test
	@DisplayName("Add an item to Buffer as a Producer and check if the Buffer isn't empty")
	void addItemToBufferAsProducer() {
		MockHelperItem item = new MockHelperItem("C#");
		MockHelperBuffer buffer = new MockHelperBuffer();
		MockHelperBuffer anotherBuffer = new MockHelperBuffer();
		MockProducer producer = new MockProducer(buffer);
		producer.addItem(item);
		anotherBuffer.add(item);
		assertEquals(anotherBuffer.getBuffer(), buffer.getBuffer());
		assertFalse(buffer.getBuffer().isEmpty());
	}
	
	@Test
	@DisplayName("Check if Buffer is an instance of a Linked List")
	void isBufferLinkedList() {
		MockHelperItem item = new MockHelperItem("C#");
		MockHelperBuffer buffer = new MockHelperBuffer();
		MockProducer producer = new MockProducer(buffer);
		producer.addItem(item);
	    assertTrue(buffer.getBuffer() instanceof LinkedList);
	    }
	
	@Test
	@DisplayName("Remove a item from Buffer as a Consumer and check if the Buffer is empty")
	void removeItemFromBufferAsConsumer() {
		Item item = new Item("C#");
		MockHelperBuffer buffer = new MockHelperBuffer();
		buffer.add(item);
		MockConsumer consumer = new MockConsumer(buffer);
		assertEquals(item, consumer.removeItem());
		assertTrue(buffer.getBuffer().isEmpty());
	}
	
	
	
    @Test
    @DisplayName("Interrupt Thread while waiting for a new Item in Buffer")
    void interruptThreadWhileWaitingInBuffer() throws InterruptedException  {
        MockHelperBuffer buffer = new MockHelperBuffer();
        MockConsumer consumer = new MockConsumer(buffer);
        
        Thread thread = new Thread(() -> assertThrows(InterruptedException.class, () -> consumer.removeItem()));

        thread.start();
        thread.interrupt();
        assertTrue(thread.isInterrupted());
    }
    
    @Test
	@DisplayName("Producers adding items to the same Buffer.")
	void producersAddingItemsToSameBuffer() {    	
		MockHelperBuffer buffer = new MockHelperBuffer();
		MockHelperBuffer anotherBuffer = new MockHelperBuffer();

		MockHelperItem itemA = new MockHelperItem("3..2..1..");
		MockHelperItem itemB = new MockHelperItem("");
		MockHelperItem itemC = new MockHelperItem("MERRY CHRISTMAS!");
		
		MockProducer producerA = new MockProducer(buffer);
		MockProducer producerB = new MockProducer(buffer);
		MockProducer producerC = new MockProducer(buffer);
		
		producerA.addItem(itemA);
		producerB.addItem(itemB);
		producerC.addItem(itemC);
		
		anotherBuffer.add(itemA);
		anotherBuffer.add(itemB);
		anotherBuffer.add(itemC);

		assertEquals(anotherBuffer.getBuffer(), buffer.getBuffer());
	}
}