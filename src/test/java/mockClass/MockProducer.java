package mockClass;

import main.Item;
import main.Producer;

public class MockProducer implements Producer {
	
	MockHelperBuffer buffer;

	public MockProducer(MockHelperBuffer buffer) {
    	this.buffer = buffer;
    }
	
	public void addItem(Item item) {
		buffer.add(item);
	}

    @Override
    public void run() {
    }

    @Override
    public void stopRunning() {
    }
}
