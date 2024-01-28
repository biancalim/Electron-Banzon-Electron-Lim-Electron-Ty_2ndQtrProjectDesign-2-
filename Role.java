
package aloverorafighter;

import java.util.ArrayList;


public class Role {
    
    private String name;
    
    private int startingAttack;
    private int startingDefense;
    private int maxHealth;
    private int dispositionBonusEffect;
    
    private ArrayList<Move> moveSet;
    
    public Role(String n, int sa, int sd, int mh, int dbe) {
        this.name = n;
        this.startingAttack = sa;
        this.startingDefense = sd;
        this.maxHealth = mh;
        this.dispositionBonusEffect = dbe;
        moveSet = new ArrayList<Move>();
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setStartingAttack(int newStartingAttack) {
        this.startingAttack = newStartingAttack;
    }
    
    public void setStartingDefense(int newStartingDefense) {
        this.startingDefense = newStartingDefense;
    }
    
    public void setMaxHealth(int newMaxHealth) {
        this.maxHealth = newMaxHealth;
    }
    
    public void setDispositionBonusEffect(int newDispositionBonusEffect) {
        this.dispositionBonusEffect = newDispositionBonusEffect;
    }
    
    public void setMoveSet(ArrayList<Move> newMoveSet) {
        this.moveSet = newMoveSet;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getStartingAttack() {
        return this.startingAttack;
    }
    
    public int getStartingDefense() {
        return this.startingDefense;
    }
    
    public int getMaxHealth() {
        return this.maxHealth;
    }
    
    public int getDispositionBonusEffect() {
        return this.dispositionBonusEffect;
    }
    
    public ArrayList<Move> getMoveSet() {
        return this.moveSet;
    }
    
}
