
package aloverorafighter;

public class Enemy extends Entity {
    
    private int xpToGain;
    private int moneyToGain;
    private int xpToLose;
    private int moneyToLose;
    private int currentDisposition;
    private int maxDisposition;
    private int dispositionModifier;
    
    public Enemy(String n, int mh, int ba, int bd, Role r, int xpg, int mtg, int xpl, int mtl, int md, int dm) {
        this.setName(n);
        this.setMaxHealth(mh);
        this.setCurrentHealth(mh);
        this.setBaseAttack(ba);
        this.setBaseDefense(bd);
        this.setRole(r);
        this.xpToGain = xpg;
        this.moneyToGain = mtg;
        this.xpToLose = xpl;
        this.moneyToLose = mtl;
        this.currentDisposition = 0;
        this.maxDisposition = md;
        this.dispositionModifier = dm;
    }
    
    public void setXPToGain(int newXPToGain) {
        this.xpToGain = newXPToGain;
    }
    
    public void setMoneyToGain(int newMoneyToGain) {
        this.moneyToGain = newMoneyToGain;
    }
    
    public void setXPToLose(int newXPToLose) {
        this.xpToLose = newXPToLose;
    }
    
    public void setMoneyToLose(int newMoneyToLose) {
        this.moneyToLose = newMoneyToLose;
    }
    
    public void setCurrentDisposition(int newCurrentDisposition) {
        this.currentDisposition = newCurrentDisposition;
    }
    
    public void setMaxDisposition(int newMaxDisposition) {
        this.maxDisposition = newMaxDisposition;
    }
    
    public void setDispositionModifier(int newDispositionModifier) {
        this.dispositionModifier = newDispositionModifier;
    }
    
    public int getXPToGain() {
        return this.xpToGain;
    }
    
    public int getMoneyToGain() {
        return this.moneyToGain;
    }
    
    public int getXPToLose() {
        return this.xpToLose;
    }
    
    public int getMoneyToLose() {
        return this.moneyToLose;
    }
    
    public int getCurrentDisposition() {
        return this.currentDisposition;
    }
    
    public int getMaxDisposition() {
        return this.maxDisposition;
    }
    
    public int getDispositionModifier() {
        return this.dispositionModifier;
    }
    
    public void attack(PlayerCharacter player){
        
        int damageDone = this.getBaseAttack() - player.getBaseDefense();
        if (damageDone <= 0) {
            damageDone = 0;
        }
        int newPlayerHealth = player.getCurrentHealth() - damageDone;
      
        player.setCurrentHealth(newPlayerHealth);
        
        System.out.println("You took " + damageDone + " damage!");
        System.out.println("Your current health: " + player.getCurrentHealth());
        
    }
    
    public void useMove(Move move, PlayerCharacter player) {
        player.setBaseAttack(player.getBaseAttack() - move.getAttackDebuff());
        player.setBaseAttack(player.getBaseDefense() - move.getDefenseDebuff());
        player.setCurrentHealth(player.getCurrentHealth() - move.getDamageToOpponent());
        
        System.out.println(move.getName() + " was used against you!");
        System.out.println("Your new attack power is " + player.getBaseAttack());
        System.out.println("Your new defense power is " + player.getBaseDefense());
        System.out.println("Your new current health is " + player.getCurrentHealth());
        
        move.setTimeElapsedSinceLastUse(0);
        move.setUsability(false); 
    }   
    
    public void endOfBattle(PlayerCharacter player) {
        
        if (player.getOldPotion() != null) {
            player.getOldPotion().resetPotion(player, this);
        }
        
        this.setCurrentHealth(this.getMaxHealth());
        this.setCurrentDisposition(0);
        
    }
    
}
