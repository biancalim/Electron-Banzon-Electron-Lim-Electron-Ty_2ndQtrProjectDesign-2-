
package aloverorafighter;

public class Move {
    
    private String name;
    private String target;
    
    private int attackBonus;
    private int defenseBonus;
    private int healthRegenerated;
    private int attackDebuff;
    private int defenseDebuff;
    private int damageToOpponent;
    private int cooldownTime;
    private int timeElapsedSinceLastUse;
    private int lengthOfEffect;
    private boolean usability;
    
    public Move(String n, String t, int ab, int db, int hr, int ad, int dd, int dto, int ct, int teslu, int loe, boolean u) {
        this.name = n;
        this.target = t;
        this.attackBonus = ab;
        this.defenseBonus = db;
        this.healthRegenerated = hr;
        this.attackDebuff = ad;
        this.defenseDebuff = dd;
        this.damageToOpponent = dto;
        this.cooldownTime = ct;
        this.timeElapsedSinceLastUse = teslu;
        this.lengthOfEffect = loe;
        this.usability = u;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAttackBonus(int newAttackBonus) {
        this.attackBonus = newAttackBonus;
    }
    
    public void setDefenseBonus(int newDefenseBonus) {
        this.defenseBonus = newDefenseBonus;
    }
    
    public void setHealthRegenerated(int newHealthRegenerated) {
        this.healthRegenerated = newHealthRegenerated;
    }
    
    public void setAttackDebuff(int newAttackDebuff) {
        this.attackDebuff = newAttackDebuff;
    }
    
    public void setDefenseDebuff(int newDefenseDebuff) {
        this.defenseDebuff = newDefenseDebuff;
    }
    
    public void setDamageToOpponent(int newDamageToOpponent) {
        this.damageToOpponent = newDamageToOpponent;
    }
    
    public void setCooldownTime(int newCooldownTime) {
        this.cooldownTime = newCooldownTime;
    }
    
    public void setTimeElapsedSinceLastUse(int newTimeElapsedSinceLastUse) {
        this.timeElapsedSinceLastUse = newTimeElapsedSinceLastUse;
    }
    
    public void setLengthOfEffect(int newLengthOfEffect) {
        this.lengthOfEffect = newLengthOfEffect;
    }
    
    public void setUsability(boolean newUsability) {
        this.usability = newUsability;
    }
    
    public void setTarget(String newTarget) {
        this.target = newTarget;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAttackBonus() {
        return this.attackBonus;
    }
    
    public int getDefenseBonus() {
        return this.defenseBonus;
    }
    
    public int getHealthRegenerated() {
        return this.healthRegenerated;
    }
    
    public int getAttackDebuff() {
        return this.attackDebuff;
    }
    
    public int getDefenseDebuff() {
        return this.defenseDebuff;
    }
    
    public int getDamageToOpponent() {
        return this.damageToOpponent;
    }
    
    public int getCooldownTime() {
        return this.cooldownTime;
    }
    
    public int getTimeElapsedSinceLastUse() {
        return this.timeElapsedSinceLastUse;
    }
    
    public int getLengthOfEffect() {
        return this.lengthOfEffect;
    }
    
    public boolean getUsability() {
        return this.usability;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    public void turnElapsed(PlayerCharacter player, Enemy enemy) {
        
        this.timeElapsedSinceLastUse = this.timeElapsedSinceLastUse + 1;
        
        if (this.timeElapsedSinceLastUse == this.lengthOfEffect) {
            resetMove(enemy, player);
        }
        
        if (this.timeElapsedSinceLastUse == this.cooldownTime) {
            this.usability = true;
        }

    }   

    
    public void resetMove(Enemy enemy, PlayerCharacter player) {
        int newAttack;
        int newDefense;
        int newHealth;
        String currentTarget = this.target;
        
        switch (currentTarget) {
            
            case "PlayerToPlayer" -> {
                newAttack = player.getBaseAttack() - this.attackBonus;
                newDefense = player.getBaseDefense() - this.defenseBonus;
                newHealth = player.getCurrentHealth() - this.healthRegenerated;

                player.setBaseAttack(newAttack);
                player.setBaseDefense(newDefense);
                player.setCurrentHealth(newHealth);
                break;
            }

            
            case "PlayerToEnemy" -> {
                newAttack = enemy.getBaseAttack() + this.attackDebuff;
                newDefense = enemy.getBaseDefense() + this.defenseDebuff;
                newHealth = enemy.getCurrentHealth() + this.damageToOpponent;
        
                enemy.setBaseAttack(newAttack);
                enemy.setBaseDefense(newDefense);
                enemy.setCurrentHealth(newHealth);
                break;
            }
            
            case "EnemyToEnemy" -> {
                newAttack = enemy.getBaseAttack() - this.attackBonus;
                newDefense = enemy.getBaseDefense() - this.defenseBonus;
                newHealth = enemy.getCurrentHealth() - this.healthRegenerated;
        
                enemy.setBaseAttack(newAttack);
                enemy.setBaseDefense(newDefense);
                enemy.setCurrentHealth(newHealth);
                break;
            }
            
            case "EnemyToPlayer" -> {
                newAttack = player.getBaseAttack() + this.attackDebuff;
                newDefense = player.getBaseDefense() + this.defenseDebuff;
                newHealth = player.getCurrentHealth() + this.damageToOpponent;
        
                player.setBaseAttack(newAttack);
                player.setBaseDefense(newDefense);
                player.setCurrentHealth(newHealth);
                break;
            }

        }
        
        System.out.println("Effects of " + this.getName() + " have been reversed");
        this.usability = true;
        
    }
    
}
