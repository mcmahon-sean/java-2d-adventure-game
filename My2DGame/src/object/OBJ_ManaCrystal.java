package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_ManaCrystal extends Entity{

	GamePanel gp;
	
	public OBJ_ManaCrystal(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		name = "Mana Crystal";
		type = type_pickupOnly;
		value = 1;
		down1 = setup("/objects/manacrystal_full", gp.tileSize, gp.tileSize); // Draw on map
		image = setup("/objects/manacrystal_full", gp.tileSize, gp.tileSize);
		image2 = setup("/objects/manacrystal_blank", gp.tileSize, gp.tileSize);
		
	}

	public void use(Entity entity) {
		gp.playSFX(2);
		gp.ui.addMessage("Mana +" + value);
		entity.mana += value;
	}
}
