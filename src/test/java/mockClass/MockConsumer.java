package mockClass;

import main.Consumer;
import main.Item;

public class MockConsumer implements Consumer {

	MockHelperBuffer buffer;
	
	public MockConsumer(MockHelperBuffer buffer) {
    	this.buffer = buffer;
    }
	
    public Item removeItem() {
    	return buffer.remove();
    }
		
    @Override
    public void run() {
    }

    @Override
    public void stopRunning() {
    }
}
