package com.anutosh.tree;

public class QueuePack {
	
	private Node node;
	private int level;
	
	public QueuePack(Node node, int level) {
		this.node = node;
		this.level = level;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
