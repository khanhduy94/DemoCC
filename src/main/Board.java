package main;

public class Board {
	private  int height;
	private  int weight;
	private  int board[][];
	private  Point BOX;
	private  Point End;
	private  Point Start;
	public Board() {
		height = 5;
		weight = 5;
		board = new int[height][weight];
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
}
