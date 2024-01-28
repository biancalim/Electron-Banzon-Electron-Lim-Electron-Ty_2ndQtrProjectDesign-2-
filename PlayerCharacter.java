
package aloverorafighter;


public class PlayerCharacter extends Entity {
    
    private String eyeColor;
    private String hairColor;
    
    private int currentXP;
    private int currentLevel;
    private int xpForNextLevel;
    private int currentMoneyAmount;
    
    private Weapon weapon;
    private Potion potion;
    private Potion oldPotion;
    
    private Section currentSection;
    private Stage currentStage;
    private Shop currentShop;
    
    public PlayerCharacter(String n, Role r, String ec, String hc, int cxp, int cl, int xpfnl, int cma, Weapon w, Potion p, Potion op, Section cse, Stage cst, Shop csh) {
        this.setName(n);
        this.setMaxHealth(r.getMaxHealth() + (cl * 25) - 25);
        this.setCurrentHealth(r.getMaxHealth() + (cl * 25) - 25);
        this.setBaseAttack(r.getStartingAttack() + (cl * 25) - 25);
        this.setBaseDefense(r.getStartingDefense() + (cl * 25) - 25);
        this.setRole(r);
        this.eyeColor = ec;
        this.hairColor = hc;
        this.currentXP = cxp;
        this.currentLevel = cl;
        this.xpForNextLevel = xpfnl;
        this.currentMoneyAmount = cma;
        this.weapon = w;
        this.potion = p;
        this.oldPotion = op;
        this.currentSection = cse;
        this.currentStage = cst;
        this.currentShop = csh;
    }
    
    
    public void setEyeColor(String newEyeColor) {
        this.eyeColor = newEyeColor;
    }
    
    public void setHairColor(String newHairColor) {
        this.hairColor = newHairColor;
    }
    
    public void setCurrentXP(int newCurrentXP) {
        this.currentXP = newCurrentXP;
    }
    
    public void setCurrentLevel(int newCurrentLevel) {
        this.currentLevel = newCurrentLevel;
    }
    
    public void setXPForNextLevel(int newXPForNextLevel) {
        this.xpForNextLevel = newXPForNextLevel;
    }
    
    public void setCurrentMoneyAmount(int newCurrentMoneyAmount) {
        this.currentMoneyAmount = newCurrentMoneyAmount;
    }
    
    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }
    
    public void setPotion(Potion newPotion) {
        this.potion = newPotion;
    }
    
    public void setOldPotion(Potion newOldPotion) {
        this.oldPotion = newOldPotion;
    }
    
    public void setCurrentSection(Section newCurrentSection) {
        this.currentSection = newCurrentSection;
    }
    
    public void setCurrentStage(Stage newCurrentStage) {
        this.currentStage = newCurrentStage;
    }
    
    public void setCurrentShop(Shop newCurrentShop) {
        this.currentShop = newCurrentShop;
    }
    
    public String getEyeColor() {
        return this.eyeColor;
    }
    
    public String getHairColor() {
        return this.hairColor;
    }
    
    public int getCurrentXP() {
        return this.currentXP;
    }
    
    public int getCurrentLevel() {
        return this.currentLevel;
    }
    
    public int getXPForNextLevel() {
        return this.xpForNextLevel;
    }
    
    public int getCurrentMoneyAmount() {
        return this.currentMoneyAmount;
    }
    
    public Weapon getWeapon() {
        return this.weapon;
    }
    
    public Potion getPotion() {
        return this.potion;
    }
    
    public Potion getOldPotion() {
        return this.oldPotion;
    }
    
    public Section getCurrentSection() {
        return this.currentSection;
    }
    
    public Stage getCurrentStage() {
        return this.currentStage;
    }
    
    public Shop getCurrentShop() {
        return this.currentShop;
    }
    
    

    public void attack(Enemy enemy){
        int damageDone = this.getBaseAttack() - enemy.getBaseDefense();
        if (damageDone <= 0) {
            damageDone = 0;
        }
        int newEnemyHealth = enemy.getCurrentHealth() - damageDone;
        enemy.setCurrentHealth(newEnemyHealth);
        System.out.println("Enemy took " + damageDone + " damage!");
        System.out.println("Enemy current health: " + enemy.getCurrentHealth());
    }
    
    public void startingInformation(String name, String eyeColor, String hairColor) {
        this.setName(name);
        this.setEyeColor(eyeColor);
        this.setHairColor(hairColor);
    }
    
    public void chooseRole(Role role) {
        this.setRole(role);
        this.setBaseAttack(role.getStartingAttack());
        this.setBaseDefense(role.getStartingDefense());
        this.setMaxHealth(role.getMaxHealth());
        
        System.out.println("You have chosen the " + role.getName() + " role!");
        System.out.println("Stats: ");
        System.out.println("Base Attack: " + this.getBaseAttack());
        System.out.println("Base Defense: " + this.getBaseDefense());
        System.out.println("Max Health: " + this.getMaxHealth());
    }
    
    public void enterSection(Section section) {
        this.setCurrentSection(section);
        System.out.println("You have entered " + section.getName() + "!");
    }
    
    public void enterStage(Stage stage) {
        this.setCurrentStage(stage);
        System.out.println("You have entered " + stage.getName() + "!");
    }
    
    public void enterShop(Shop shop) {
        this.setCurrentShop(shop);
        System.out.println("You have entered " + shop.getName() + "!");
    }
    
    public void levelUp() {
        int nextLevel = this.getCurrentLevel() + 1;
        this.setXPForNextLevel(this.getXPForNextLevel() + 50);
        this.setCurrentXP(0);
        this.setCurrentLevel(nextLevel);
        System.out.println("Levelled up to " + this.getCurrentLevel() + "!");
        this.setBaseAttack(this.getBaseAttack() + 25);
        this.setBaseDefense(this.getBaseDefense() + 25);
        this.setMaxHealth(this.getMaxHealth() + 25);
    }
    
    public void chooseDialogue(Dialogue chosenDialogue) {
        Stage stage = this.getCurrentStage();
        Enemy currentEnemy = stage.getEnemy();
        stage.chosenDialogue(chosenDialogue, currentEnemy, this);
        
        System.out.println("Dialogue Choice '" + chosenDialogue.getText() + "' has been chosen");
    }
    
    public void equipWeapon(Weapon weapon, Shop shop) {
        shop.getPurchasedWeapons().add(this.getWeapon());
        this.setWeapon(weapon);
        this.setBaseAttack(weapon.getAttackBonus() + this.getBaseAttack());
        this.setBaseDefense(weapon.getDefenseBonus() + this.getBaseDefense());
        
        System.out.println(weapon.getName() + " equipped!");
    }
    
    public void equipPotion(Potion potion, Shop shop) {
        shop.getPurchasedPotions().add(this.getPotion());
        this.setOldPotion(this.getPotion());
        this.setPotion(potion);
        
        System.out.println(potion.getName() + " equipped!");
    }
    
    public void usePotion(Potion potion,Enemy enemy) {
        
        if (potion.getTarget().equals("PlayerToEnemy")) {
            enemy.setBaseAttack(enemy.getBaseAttack() - potion.getAttackDebuff());
            enemy.setBaseAttack(enemy.getBaseDefense() - potion.getDefenseDebuff());
            this.setOldPotion(potion);
        
            System.out.println(potion.getName() + " was used against the enemy!");
            System.out.println("Their new attack power is " + enemy.getBaseAttack());
            System.out.println("Their new defense power is " + enemy.getBaseDefense());
        }
        
        else if (potion.getTarget().equals("PlayerToPlayer")) {
            this.setBaseAttack(this.getBaseAttack() + potion.getAttackBonus());
            this.setBaseDefense(this.getBaseDefense() + potion.getDefenseBonus());
        
            if(this.getCurrentHealth() + potion.getHealthRegenerated() > this.getMaxHealth()) {
                this.setCurrentHealth(this.getMaxHealth());
            }
            else {
                this.setCurrentHealth(this.getCurrentHealth() + potion.getHealthRegenerated());
            }
        
            this.setOldPotion(potion);
            this.setPotion(null);
        
            System.out.println(potion.getName() + " was used!");
            System.out.println("Your new attack power is " + this.getBaseAttack());
            System.out.println("Your new defense power is " + this.getBaseDefense());
            System.out.println("Your new current health is " + this.getCurrentHealth());
        }
   
    }
    
    public void useMove(Move move, Enemy enemy) {
        enemy.setBaseAttack(enemy.getBaseAttack() - move.getAttackDebuff());
        enemy.setBaseDefense(enemy.getBaseDefense() - move.getDefenseDebuff());
        enemy.setCurrentHealth(enemy.getCurrentHealth() - move.getDamageToOpponent());
        
        System.out.println(move.getName() + " was used against the enemy!");
        System.out.println("Their new attack power is " + enemy.getBaseAttack());
        System.out.println("Their new defense power is " + enemy.getBaseDefense());
        System.out.println("Their new current health is " + enemy.getCurrentHealth());
        
        move.setTimeElapsedSinceLastUse(0);
        move.setUsability(false);
        
    } 
    
    
    public void battleWinnings(Enemy enemy, Section nextSection) {
        int moneyGained = enemy.getMoneyToGain();
        int xpGained = enemy.getXPToGain();
        
        this.setCurrentMoneyAmount(this.getCurrentMoneyAmount() + moneyGained);
        this.setCurrentXP(this.getCurrentXP() + xpGained);
        this.setCurrentHealth(this.getMaxHealth());
        
        if (this.getCurrentXP() >= this.getXPForNextLevel()) {
            this.levelUp();
        }
        
        if (this.getOldPotion() != null) {
            this.getOldPotion().resetPotion(this, enemy);
        }
        
        if (this.getCurrentStage() == this.getCurrentSection().getStagesOfTheSection().get(this.getCurrentSection().getStagesOfTheSection().size() - 1)) {
            nextSection.available();
            nextSection.getStagesOfTheSection().get(0).available();
            nextSection.getSectionShop().available();
        }
        
        this.setOldPotion(null);
        this.setCurrentStage(null);
        
        System.out.println("Stage Won!");
        System.out.println("New Current XP: " + this.getCurrentXP());
        System.out.println("New Current Amount of Money: " + this.getCurrentMoneyAmount());
        
    }
    
    
    public void battleLosings(Enemy enemy) {
        int moneyLost = enemy.getMoneyToLose();
        int xpLost = enemy.getXPToLose();
        
        this.setCurrentMoneyAmount(this.getCurrentMoneyAmount() - moneyLost);
        this.setCurrentXP(this.getCurrentXP() - xpLost);
        this.setCurrentHealth(this.getMaxHealth());
        
        if (this.getCurrentXP() < 0) {
            this.setCurrentXP(0);
        }
        
        if (this.getCurrentMoneyAmount() < 0) {
            this.setCurrentMoneyAmount(0);
        }
        
        
        if (this.getOldPotion() != null) {
            this.getOldPotion().resetPotion(this, enemy);
        }
        
        this.setOldPotion(null);
        this.setCurrentStage(null);
        
        System.out.println("Stage Lost!");
        System.out.println("New Current XP: " + this.getCurrentXP());
        System.out.println("New Current Amount of Money: " + this.getCurrentMoneyAmount());
        
    }
    
}
