
package aloverorafighter;


public class Potion extends Item {
    
    private String target;
    
    private int healthRegenerated;
    private int attackDebuff;
    private int defenseDebuff;
    
    public Potion(String n, String t, int ab, int db, int p, int hr, int ad, int dd) {
        this.setName(n);
        this.setAttackBonus(ab);
        this.setDefenseBonus(db);
        this.setPrice(p);
        this.target = t;
        this.healthRegenerated = hr;
        this.attackDebuff = ad;
        this.defenseDebuff = dd;
    }
    
    
    public void setAttackDebuff(int newAttackDebuff) {
        this.attackDebuff = newAttackDebuff;
    }
    
    public void setDefenseDebuff(int newDefenseDebuff) {
        this.defenseDebuff = newDefenseDebuff;
    }
    
    public void setHealthRegenerated(int newHealthRegenerated) {
        this.healthRegenerated = newHealthRegenerated;
    }
    
    public void setTarget(String newTarget) {
        this.target = newTarget;
    }
    

    public int getAttackDebuff() {
        return this.attackDebuff;
    }
    
    public int getDefenseDebuff() {
        return this.defenseDebuff;
    }
    
    public int getHealthRegenerated() {
        return this.healthRegenerated;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    public void resetPotion(PlayerCharacter player, Enemy enemy) {
        int newAttack;
        int newDefense;
        int newHealth;
        String currentTarget = this.target;
        
        if (currentTarget.equals("PlayerToPlayer")) {
            newAttack = player.getBaseAttack() - this.getAttackBonus();
            newDefense = player.getBaseDefense() - this.getDefenseBonus();
            newHealth = player.getCurrentHealth() - this.healthRegenerated;

            player.setBaseAttack(newAttack);
            player.setBaseDefense(newDefense);
            player.setCurrentHealth(newHealth);
        }
        
        else if (currentTarget.equals("PlayerToEnemy")) {
            newAttack = enemy.getBaseAttack() + this.attackDebuff;
            newDefense = enemy.getBaseDefense() + this.defenseDebuff;
        
            enemy.setBaseAttack(newAttack);
            enemy.setBaseDefense(newDefense);
        }
        
    }
    
}
