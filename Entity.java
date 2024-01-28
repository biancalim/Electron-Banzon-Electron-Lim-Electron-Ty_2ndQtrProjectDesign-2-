
package aloverorafighter;

public abstract class Entity {
    
    private String name;

    private int maxHealth;
    private int currentHealth;
    private int baseAttack;
    private int baseDefense;
    
    private Role role;
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setMaxHealth(int newMaxHealth) {
        this.maxHealth = newMaxHealth;
    }
    
    public void setCurrentHealth(int newCurrentHealth) {
        this.currentHealth = newCurrentHealth;
    }
    
    public void setBaseAttack(int newBaseAttack) {
        this.baseAttack = newBaseAttack;
    }
    
    public void setBaseDefense(int newBaseDefense) {
        this.baseDefense = newBaseDefense;
    }
    
    public void setRole(Role newRole) {
        this.role = newRole;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getMaxHealth() {
        return this.maxHealth;
    }
    
    public int getCurrentHealth() {
        return this.currentHealth;
    }
    
    public int getBaseAttack() {
        return this.baseAttack;
    }
    
    public int getBaseDefense() {
        return this.baseDefense;
    }
    
    public Role getRole() {
        return this.role;
    }
    
    public void useMove(Move move) {
        this.setBaseAttack(this.getBaseAttack() + move.getAttackBonus());
        this.setBaseDefense(this.getBaseDefense() + move.getDefenseBonus());
        
        if(this.getCurrentHealth() + move.getHealthRegenerated() > this.getMaxHealth()) {
            this.setCurrentHealth(this.getMaxHealth());
        }
        else {
            this.setCurrentHealth(this.getCurrentHealth() + move.getHealthRegenerated());
        }
        
        move.setTimeElapsedSinceLastUse(0);
        move.setUsability(false);
        
        System.out.println(move.getName() + " was used!");
        System.out.println(this.getName() + " new attack power is " + this.getBaseAttack());
        System.out.println(this.getName() + " new defense power is " + this.getBaseDefense());
        System.out.println(this.getName() + " new current health is " + this.getCurrentHealth());
        
    }    
    
}
