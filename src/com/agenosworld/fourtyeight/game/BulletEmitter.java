package com.agenosworld.fourtyeight.game;

import com.badlogic.gdx.physics.box2d.Fixture;

public interface BulletEmitter {
	
	public Fixture getFixture();
	
	public GameWorld getGameWorld();

}
