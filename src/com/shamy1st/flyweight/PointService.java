package com.shamy1st.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
	
	private PointIconFactory iconFactory = new PointIconFactory();
	
	public PointService(PointIconFactory iconFactory) {
		this.iconFactory = iconFactory;
	}

	public List<Point> getPoints() {
		List<Point> points = new ArrayList<>();
		Point p1 = new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE));
		points.add(p1);
		return points;
	}
}
