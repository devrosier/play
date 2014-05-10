package org.irosier.myswing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGameGrid {

	@Test
	public void testGridInti() {
		GameGrid grid = new GameGrid(10,10);
		
		assertTrue(true);
	}

	@Test
	public void testGridLoc() {
		GameGrid grid = new GameGrid(10,10);
		GridLocation gridLoc = grid.getGridLocation(0, 0);
		assertFalse(gridLoc == null);
	}

}
