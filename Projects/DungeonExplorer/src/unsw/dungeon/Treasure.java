package unsw.dungeon;
/**
 * Treasure can be picked up by a player and once it's picked up,
 * it will be added to the player's item list.
 */
public class Treasure extends Entity {
	public Treasure(int x, int y) {
        super(x, y);
    }
	/**
	 * As an obtainable, treasure can be picked up by a player.
	 * Once a treasure is picked up by a player, it will be removed from a dungeon/dungeonImage.
	 */
	@Override
	public void pickedUpByPlayer(Dungeon dungeon,Player player) {
		player.getItemList().add(this);
		this.visible().set(false);
    	dungeon.getEntities().remove(this);
    	dungeon.addTreasureScore();
	}
}
