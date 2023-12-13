package mockClass;

import main.Item;

public class MockHelperItem extends Item {
	
	public MockHelperItem(String id) {
		super(id);
	}

	public String getID() {
		return super.id;
	}
}
