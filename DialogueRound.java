
package aloverorafighter;

import java.util.*;

public class DialogueRound {
    
    private ArrayList<Dialogue> dialogueChoices;
    
    public DialogueRound() {
        this.dialogueChoices = new ArrayList<Dialogue>();
    }
    
    public void setDialogueChoices(ArrayList<Dialogue> newDialogueChoices) {
        this.dialogueChoices = newDialogueChoices;
    }
    
    public ArrayList<Dialogue> getDialogueChoices() {
        return this.dialogueChoices;
    }
    
}
