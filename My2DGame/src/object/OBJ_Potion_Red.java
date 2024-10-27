package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Potion_Red extends Entity {
	
	GamePanel gp;

	public OBJ_Potion_Red(GamePanel gp) {
		super(gp);
		
		this.gp = gp;

		name = "Health Potion";
		type = type_consumable;
		value = 5;
		down1 = setup("/objects/potion_red", gp.tileSize, gp.tileSize);
		description = "[" + name + "]\nA health potion.\nHeals by " + value;
		
	}
	
	public void use(Entity entity) {
		
		gp.gameState = gp.dialogueState;
		gp.ui.currentDialogue = "You drink the " + name + "!\n" +
								"Your have recovered " + value + " health.";
		entity.life += value;
		if (gp.player.life > gp.player.maxLife) {
			gp.player.life = gp.player.maxLife;
		}
		gp.playSFX(2);
	}
}
