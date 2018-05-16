/**
 * 
 */
package werewolf.roles;

/**abstract class simulates the base role of the Game Werewolf
 * Every other role extends Villager
 * 
 * 
 * 
 * @author gmerc
 *
 */
public abstract class Villager {
  
  private int faction;
  
  /**public Villager() initializes the default Villager by 
   * setting the faction to 0 (village)
   */
  public Villager() {
    faction = 0;
  }
  
  /**public Villager(int newF) initializes a Villager with
   * a special faction
   * @param newF the faction value to set
   */
  public Villager(int newF) {
    this.faction = newF;
  }
  
	/**voidchangeFaction changes the faction of the Villager
	 * @param newF the faction value to change
	 */
	public void changeFaction(int newF) {
	  this.faction = newF;
	}S
	
}
