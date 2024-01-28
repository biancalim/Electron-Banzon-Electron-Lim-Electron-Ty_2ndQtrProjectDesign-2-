
package aloverorafighter;


public class Weapon extends Item {
   
    public Weapon(String n, int ab, int db, int p) {
        this.setName(n);
        this.setAttackBonus(ab);
        this.setDefenseBonus(db);
        this.setPrice(p);
    }
    
}
