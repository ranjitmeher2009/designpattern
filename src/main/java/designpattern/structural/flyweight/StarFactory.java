package designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StarFactory {

	Map<String, Star> starCache = new HashMap<String, Star>();

	Star getStar(String name) {
		return (starCache.get(name) == null ? getNewStar(name) : starCache.get(name));

	}

	Star getNewStar(String name) {
		Star star = null;
		if(name.equalsIgnoreCase("SuperNoveStar")){
		 star = new SuperNoveStar(name);
		}else if(name.equalsIgnoreCase("PoleStar")){
			 star = new PoleStar(name);
		}else if(name.equalsIgnoreCase("DraughStar")){
			 star = new DraughStar(name);
		}
			
		starCache.put(name, star);
		return star;
	}

}