package com.anutosh.crack;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if(o2.score > o1.score){
			return 1;
		}else if(o2.score < o1.score){
			return -1;
		}
		return o1.name.compareTo(o2.name);
	}

}
