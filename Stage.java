
package aloverorafighter;

import java.util.ArrayList;

public class Stage implements Available {
    
    private boolean availability;
    private Enemy enemy;
    private ArrayList<DialogueRound> dialogueRounds;
    private String name;
    
    public Stage(boolean a, Enemy e, String n) {
        this.availability = a;
        this.enemy = e;
        this.name = n;
        dialogueRounds = new ArrayList<DialogueRound>();
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setSectionShop(Enemy newEnemy) {
        this.enemy = newEnemy;
    }
    
    public void setDialogueRounds(ArrayList<DialogueRound> newDialogueRounds) {
        this.dialogueRounds = newDialogueRounds;
    }
    
    public void setAvailability(boolean newAvailability) {
        this.availability = newAvailability;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Enemy getEnemy() { 
        return this.enemy;
    }
    
    public boolean getAvailability() {
        return this.availability;
    }
    
    public ArrayList<DialogueRound> getDialogueRounds() {
        return this.dialogueRounds;
    }
    
    @Override
    public void available() {
        this.availability = true;
        System.out.println("Stage '" + this.getName() + "' has been unlocked!");
    }
    
    public void checkDisposition(Enemy enemy) {
        System.out.println("Current Disposition of " + enemy.getName() + ": " + enemy.getCurrentDisposition());
    }
    
    public void chosenDialogue(Dialogue dialogueChoice, Enemy enemy, PlayerCharacter player) {
        int effectOnDisposition = dialogueChoice.getDispositionEffect() + enemy.getDispositionModifier() + player.getRole().getDispositionBonusEffect();
        int newEnemyDisposition = enemy.getCurrentDisposition() + effectOnDisposition;
        enemy.setCurrentDisposition(newEnemyDisposition);
    }
    
}
