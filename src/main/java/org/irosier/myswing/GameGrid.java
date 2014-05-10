package org.irosier.myswing;

public class GameGrid {

	private Integer width;
	private Integer height;
	private GridLocation[][] grid;

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public GameGrid(Integer width, Integer height) {
		this.width = width;
		this.height = height;

		init();
	}

	public GridLocation getGridLocation(Integer x, Integer y) {
		return grid[x][y];
	}

	protected void init() {
		grid = new GridLocation[width][height];
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < width; y++) {
				grid[x][y] = new GridLocation();
			}
		}
	}
}
