package com.shamy1st;

import com.shamy1st.flyweight.PointIconFactory;
import com.shamy1st.flyweight.PointService;

public class Main {

	public static void main(String[] args) {
		
		PointService service = new PointService(new PointIconFactory());
		service.getPoints().forEach(point -> point.draw());
	}
}
