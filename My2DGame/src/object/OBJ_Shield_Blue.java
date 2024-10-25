package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Blue extends Entity {

	public OBJ_Shield_Blue(GamePanel gp) {
		super(gp);
		
		name = "Blue Shield";
		type = type_shield;
		down1 = setup("/objects/shield_blue", gp.tileSize, gp.tileSize);
		defenseValue = 2;
		description = "[" + name + "]\nMade of blue.";

	}
}