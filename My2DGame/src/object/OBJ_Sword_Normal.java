package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Sword_Normal extends Entity {

	public OBJ_Sword_Normal(GamePanel gp) {
		super(gp);
		
		name = "Normal Sword";
		type = type_sword;
		down1 = setup("/objects/sword_normal", gp.tileSize, gp.tileSize);
		attackValue = 1;
		attackArea.width = 36;
		attackArea.height = 36;
		description = "[" + name + "]\nAn old sword.";

	}

}
