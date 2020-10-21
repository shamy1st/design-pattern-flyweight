package com.shamy1st.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
	
	private Map<PointType, PointIcon> icons = new HashMap<>();
	
	public PointIcon getPointIcon(PointType type) {
		if(!icons.containsKey(type))
			icons.put(type, new PointIcon(type, null)); //real-app have icon file e.g. cafe.jpg
		return icons.get(type);
	}
}
