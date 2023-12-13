package mockClass;

import java.util.Queue;

import main.Buffer;
import main.Item;

public class MockHelperBuffer extends Buffer {
			
	public Queue<Item> getBuffer() {
		return super.buffer;
	}
	
	@Override
	public synchronized boolean add(Item item) {
		return super.add(item);
	}

	@Override
	public synchronized Item remove() {
		return super.remove();
	}
}
