package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Wood extends Entity {

	public OBJ_Shield_Wood(GamePanel gp) {
		super(gp);

		name = "Wood Shield";
		type = type_shield;
		down1 = setup("/objects/shield_wood", gp.tileSize, gp.tileSize);
		defenseValue = 1;
		description = "[" + name + "]\nMade of wood.";

	}
}