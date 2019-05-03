package jpu2016.dogfight.model;

import jpu2016.dogfight.controller.IUserOrder;
import jpu2016.dogfight.controller.Order;

public class UserOrder implements IUserOrder {
		private Order order;
	
		public UserOrder(int Player , Order order) {
		
	}
	
	@Override
	public Order getOrder() {
	
		return null;
	}

	@Override
	public int getPlayer() {
		
		return 0;
	}

}
