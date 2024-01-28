
package aloverorafighter;


public class ALoverOrAFighter {


    public static void main(String[] args) {
        
        DialogueRound sectionOneStageOneRoundOne = new DialogueRound();
        DialogueRound sectionOneStageOneRoundTwo = new DialogueRound();
        DialogueRound sectionOneStageOneRoundThree = new DialogueRound();
        DialogueRound sectionTwoStageOneRoundOne = new DialogueRound();
        DialogueRound sectionTwoStageOneRoundTwo = new DialogueRound();
        DialogueRound sectionTwoStageOneRoundThree = new DialogueRound();
        DialogueRound sectionThreeStageOneRoundOne = new DialogueRound();
        DialogueRound sectionThreeStageOneRoundTwo = new DialogueRound();
        DialogueRound sectionThreeStageOneRoundThree = new DialogueRound();
        
        Dialogue flirt = new Dialogue(2, "Flirt");
        Dialogue complimentEyes = new Dialogue(1, "Compliment Eyes");
        Dialogue brag = new Dialogue(-2, "Brag");
        Dialogue cornyJoke = new Dialogue(1, "Corny Joke");
        Dialogue complimentHair = new Dialogue(1, "Compliment Hair");
        Dialogue intimidate = new Dialogue(-3, "Intimidate");
        Dialogue sarcasticJoke = new Dialogue(-2, "Sarcastic Joke");
        
        sectionOneStageOneRoundOne.getDialogueChoices().add(flirt);
        sectionOneStageOneRoundOne.getDialogueChoices().add(complimentEyes);
        sectionOneStageOneRoundOne.getDialogueChoices().add(brag);
        
        sectionOneStageOneRoundTwo.getDialogueChoices().add(flirt);
        sectionOneStageOneRoundTwo.getDialogueChoices().add(intimidate);
        sectionOneStageOneRoundTwo.getDialogueChoices().add(cornyJoke);
        
        sectionOneStageOneRoundThree.getDialogueChoices().add(cornyJoke);
        sectionOneStageOneRoundThree.getDialogueChoices().add(complimentEyes);
        sectionOneStageOneRoundThree.getDialogueChoices().add(sarcasticJoke);
        
        sectionTwoStageOneRoundOne.getDialogueChoices().add(intimidate);
        sectionTwoStageOneRoundOne.getDialogueChoices().add(complimentHair);
        sectionTwoStageOneRoundOne.getDialogueChoices().add(cornyJoke);
        
        sectionTwoStageOneRoundTwo.getDialogueChoices().add(flirt);
        sectionTwoStageOneRoundTwo.getDialogueChoices().add(complimentHair);
        sectionTwoStageOneRoundTwo.getDialogueChoices().add(sarcasticJoke);

        sectionTwoStageOneRoundThree.getDialogueChoices().add(brag);
        sectionTwoStageOneRoundThree.getDialogueChoices().add(flirt);
        sectionTwoStageOneRoundThree.getDialogueChoices().add(cornyJoke);

        sectionThreeStageOneRoundOne.getDialogueChoices().add(flirt);
        sectionThreeStageOneRoundOne.getDialogueChoices().add(complimentEyes);
        sectionThreeStageOneRoundOne.getDialogueChoices().add(sarcasticJoke);
        
        sectionThreeStageOneRoundTwo.getDialogueChoices().add(intimidate);
        sectionThreeStageOneRoundTwo.getDialogueChoices().add(brag);
        sectionThreeStageOneRoundTwo.getDialogueChoices().add(sarcasticJoke);
        
        sectionThreeStageOneRoundThree.getDialogueChoices().add(complimentHair);
        sectionThreeStageOneRoundThree.getDialogueChoices().add(complimentEyes);
        sectionThreeStageOneRoundThree.getDialogueChoices().add(sarcasticJoke);

        
        
        Role commoner = new Role("Commoner", 30, 20, 100, 0);
        Role fighter = new Role("Fighter", 35, 15, 125, -2);
        Role seducer = new Role("Seducer", 25, 25, 80, 2);
        
        Move outOfTuneNotes = new Move("Out Of Tune Notes", "PlayerToEnemy", 0, 0, 0, 10, 10, 0, 3, 0, 3, true);
        Move protectiveStance = new Move("Protective Stance", "PlayerToPlayer", 0, 20, 0, 0, 0, 0, 4, 0, 3, true);
        Move swanSong = new Move("Swan Song", "EnemyToPlayer", 0, 0, 0, -25, 0, 0, 4, 0, 2, true);
        Move choralRampage = new Move("Choral Rampage", "PlayerToEnemy", 0, 0, 0, 0, 0, 50, 6, 0, 7, true);
        
        commoner.getMoveSet().add(outOfTuneNotes);
        seducer.getMoveSet().add(protectiveStance);
        seducer.getMoveSet().add(swanSong);
        fighter.getMoveSet().add(choralRampage);
        
        Weapon normalLute = new Weapon("Normal Lute", 0, 0, 0);
        Weapon guitarOfDissonance = new Weapon("Guitar of Dissonance", 25, -25, 10);
        Weapon theBassOfTheDeep = new Weapon("The Bass of The Deep", 0, 50, 25);
        
        Potion empty = new Potion("Empty", "None", 0, 0, 0, 0, 0, 0);
        Potion defenseDebuffPotion = new Potion("Defense Debuff Potion", "PlayerToEnemy", 0, 0, 5, 0, 0, 10);
        Potion increaseAttackPotion = new Potion("Increase Attack Potion", "PlayerToPlayer", 20, 0, 10, 0, 0, 0);
        
        Enemy theBeast = new Enemy("The Beast", 100, 35, 15, commoner, 5, 15, 2, 2, 10, 0);
        Enemy krabs = new Enemy("Krabs", 150, 55, 50, fighter, 10, 20, 8, 10, 10, -3);
        Enemy theMask = new Enemy("The Mask", 200, 85, 45, seducer, 25, 35, 13, 15, 10, 1);
        
        Stage cellBlockTango = new Stage(true, theBeast, "Cell Block Tango");
        Stage toFryOrNotToFry = new Stage(false, krabs, "To Fry or Not To Fry");
        Stage theMidnightDreamBlues = new Stage(false, theMask, "The Midnight Dream Blues");
        
        Shop dungeonShop = new Shop(true, "Dungeon Shop");
        Shop loungeShop = new Shop(false, "Lounge Shop");
        Shop barracksShop = new Shop(false, "Barracks Shop");
        
        Section dungeon = new Section(dungeonShop, true, "Dungeon");  
        Section lounge = new Section(loungeShop, false, "Lounge");  
        Section barracks = new Section(barracksShop, true, "The Barracks");  
        
        dungeon.getStagesOfTheSection().add(cellBlockTango);
        lounge.getStagesOfTheSection().add(toFryOrNotToFry);
        barracks.getStagesOfTheSection().add(theMidnightDreamBlues);
        
        cellBlockTango.getDialogueRounds().add(sectionOneStageOneRoundOne);
        cellBlockTango.getDialogueRounds().add(sectionOneStageOneRoundTwo);
        cellBlockTango.getDialogueRounds().add(sectionOneStageOneRoundThree);
        
        toFryOrNotToFry.getDialogueRounds().add(sectionTwoStageOneRoundOne);
        toFryOrNotToFry.getDialogueRounds().add(sectionTwoStageOneRoundTwo);
        toFryOrNotToFry.getDialogueRounds().add(sectionTwoStageOneRoundThree);
        
        theMidnightDreamBlues.getDialogueRounds().add(sectionThreeStageOneRoundOne);
        theMidnightDreamBlues.getDialogueRounds().add(sectionThreeStageOneRoundTwo);
        theMidnightDreamBlues.getDialogueRounds().add(sectionThreeStageOneRoundThree);
        
        dungeonShop.getPotionsForSale().add(defenseDebuffPotion);
        dungeonShop.getWeaponsForSale().add(guitarOfDissonance);
        loungeShop.getWeaponsForSale().add(theBassOfTheDeep);
        
        PlayerCharacter peetah = new PlayerCharacter("Peetah", commoner, "Blue", "Brown", 0, 1, 25, 0, normalLute, empty, empty, null, null, null);
        PlayerCharacter jimmy = new PlayerCharacter("Jimmy", seducer, "Green", "Hazel", 5, 2, 35, 20, normalLute, empty, empty, lounge, null, loungeShop);
        PlayerCharacter lois = new PlayerCharacter("Lois", fighter, "Brown", "Ginger", 8, 3, 50, 25, normalLute, empty, empty, dungeon, null, dungeonShop);
        
        
        // Start of Scenario 1
        
        System.out.println("Scenario 1 Start: ");
        System.out.println("");
        
        peetah.enterSection(dungeon);
        peetah.enterStage(cellBlockTango);
        
        System.out.println("Dialogue Round 1 Choices: ");
        
        for(Dialogue i : cellBlockTango.getDialogueRounds().get(0).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        peetah.chooseDialogue(flirt);
        
        cellBlockTango.checkDisposition(cellBlockTango.getEnemy());
        
        System.out.println("Dialogue Round 2 Choices: ");
        
        for(Dialogue i : cellBlockTango.getDialogueRounds().get(1).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        peetah.chooseDialogue(intimidate);
        
        cellBlockTango.checkDisposition(cellBlockTango.getEnemy());
        
        System.out.println("Dialogue Round 3 Choices: ");
        
        for(Dialogue i : cellBlockTango.getDialogueRounds().get(2).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        peetah.chooseDialogue(cornyJoke);
        
        cellBlockTango.checkDisposition(cellBlockTango.getEnemy());
        
        if (cellBlockTango.getEnemy().getCurrentDisposition() >= (cellBlockTango.getEnemy().getMaxDisposition() / 2)) {
            cellBlockTango.getEnemy().endOfBattle(peetah);
        }
        
        else {
            System.out.println("Start of Battle Round: ");
        }
        
        
        peetah.useMove(outOfTuneNotes, cellBlockTango.getEnemy());
        cellBlockTango.getEnemy().attack(peetah);
        
        while ((peetah.getCurrentHealth() >= 0) && (cellBlockTango.getEnemy().getCurrentHealth() >= 0)) {
            outOfTuneNotes.turnElapsed(peetah, cellBlockTango.getEnemy());
            
            peetah.attack(cellBlockTango.getEnemy());
            
            if (cellBlockTango.getEnemy().getCurrentHealth() <= 0) {
                cellBlockTango.getEnemy().endOfBattle(peetah);
                
                if ((outOfTuneNotes.getTimeElapsedSinceLastUse() < outOfTuneNotes.getLengthOfEffect())) {
                    outOfTuneNotes.resetMove(cellBlockTango.getEnemy(), peetah);
                }
                
                peetah.battleWinnings(cellBlockTango.getEnemy(), lounge);
                break;
            }
            
            cellBlockTango.getEnemy().attack(peetah);
            
            if (peetah.getCurrentHealth() <= 0) {
                outOfTuneNotes.resetMove(cellBlockTango.getEnemy(), peetah);
                cellBlockTango.getEnemy().endOfBattle(peetah);
                
                if ((outOfTuneNotes.getTimeElapsedSinceLastUse() < outOfTuneNotes.getLengthOfEffect())) {
                    outOfTuneNotes.resetMove(cellBlockTango.getEnemy(), peetah);
                }
                
                peetah.battleLosings(cellBlockTango.getEnemy());
                break;
            }
            
        }

        peetah.enterShop(dungeon.getSectionShop());
        dungeon.getSectionShop().buyWeapon(guitarOfDissonance, peetah);
        dungeon.getSectionShop().buyPotion(defenseDebuffPotion, peetah);
        peetah.equipWeapon(guitarOfDissonance, peetah.getCurrentShop());
        peetah.equipPotion(defenseDebuffPotion, peetah.getCurrentShop());
        
        
        // End of Scenario 1
        System.out.println("Scenario 1 End");
        System.out.println("");
        
        // Start of Scenario 2
        System.out.println("Scenario 2 Start: ");
        System.out.println("");
        
        lounge.available();
        toFryOrNotToFry.available();
        jimmy.getCurrentShop().buyWeapon(theBassOfTheDeep, jimmy);
        jimmy.getCurrentShop().buyPotion(increaseAttackPotion, jimmy);
        jimmy.equipWeapon(theBassOfTheDeep, jimmy.getCurrentShop());
        jimmy.equipPotion(increaseAttackPotion, jimmy.getCurrentShop());
        
        jimmy.enterSection(lounge);
        jimmy.enterStage(toFryOrNotToFry);
        
        System.out.println("Dialogue Round 1 Choices: ");
        
        for(Dialogue i : toFryOrNotToFry.getDialogueRounds().get(0).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        jimmy.chooseDialogue(complimentHair);
        toFryOrNotToFry.checkDisposition(toFryOrNotToFry.getEnemy());
        
        System.out.println("Dialogue Round 2 Choices: ");
        
        for(Dialogue i : toFryOrNotToFry.getDialogueRounds().get(1).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        jimmy.chooseDialogue(flirt);
        toFryOrNotToFry.checkDisposition(toFryOrNotToFry.getEnemy());
        
        System.out.println("Dialogue Round 3 Choices: ");
        
        for(Dialogue i : toFryOrNotToFry.getDialogueRounds().get(2).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        jimmy.chooseDialogue(cornyJoke);
        
        toFryOrNotToFry.checkDisposition(toFryOrNotToFry.getEnemy());
        
        if (toFryOrNotToFry.getEnemy().getCurrentDisposition() >= (toFryOrNotToFry.getEnemy().getMaxDisposition() / 2)) {
            toFryOrNotToFry.getEnemy().endOfBattle(jimmy);
        }
        
        else {
            System.out.println("Start of Battle Round: ");
        }
        
        jimmy.useMove(protectiveStance);
        jimmy.usePotion(increaseAttackPotion, toFryOrNotToFry.getEnemy());
        toFryOrNotToFry.getEnemy().attack(jimmy);
        
        while ((jimmy.getCurrentHealth() >= 0) && (toFryOrNotToFry.getEnemy().getCurrentHealth() >= 0)) {
            protectiveStance.turnElapsed(jimmy, toFryOrNotToFry.getEnemy());
            
            jimmy.attack(toFryOrNotToFry.getEnemy());
            
            if (toFryOrNotToFry.getEnemy().getCurrentHealth() <= 0) {

                toFryOrNotToFry.getEnemy().endOfBattle(jimmy);
                
                if ((protectiveStance.getTimeElapsedSinceLastUse() < protectiveStance.getLengthOfEffect())) {
                    protectiveStance.resetMove(toFryOrNotToFry.getEnemy(), jimmy);
                }
                
                jimmy.battleWinnings(toFryOrNotToFry.getEnemy(), barracks);
                break;
            }
            
            toFryOrNotToFry.getEnemy().attack(jimmy);
            
            if (jimmy.getCurrentHealth() <= 0) {
                protectiveStance.resetMove(toFryOrNotToFry.getEnemy(), jimmy);
                toFryOrNotToFry.getEnemy().endOfBattle(jimmy);
                jimmy.battleLosings(toFryOrNotToFry.getEnemy());
                break;
            }
        
            
        }
        
        // End of Scenario 2
        
        System.out.println("Scenario 2 End");
        System.out.println("");
        
        // Start of Scenario 3
        System.out.println("Scenario 3 Start: ");
        System.out.println("");
        
        lois.getCurrentShop().buyWeapon(guitarOfDissonance, lois);
        lois.equipWeapon(guitarOfDissonance, lois.getCurrentShop());
        
        lois.enterSection(barracks);
        lois.enterStage(theMidnightDreamBlues);
        
        
        System.out.println("Dialogue Round 1 Choices: ");
        
        for(Dialogue i : theMidnightDreamBlues.getDialogueRounds().get(0).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        lois.chooseDialogue(sarcasticJoke);
        theMidnightDreamBlues.checkDisposition(theMidnightDreamBlues.getEnemy());
        
        System.out.println("Dialogue Round 2 Choices: ");
        
        for(Dialogue i : theMidnightDreamBlues.getDialogueRounds().get(1).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        lois.chooseDialogue(brag);
        theMidnightDreamBlues.checkDisposition(theMidnightDreamBlues.getEnemy());
        
        System.out.println("Dialogue Round 3 Choices: ");
        
        for(Dialogue i : theMidnightDreamBlues.getDialogueRounds().get(2).getDialogueChoices()) {
            System.out.println(i.getText());
        }
        
        lois.chooseDialogue(complimentEyes);
        
        theMidnightDreamBlues.checkDisposition(theMidnightDreamBlues.getEnemy());
        
        if (theMidnightDreamBlues.getEnemy().getCurrentDisposition() >= (theMidnightDreamBlues.getEnemy().getMaxDisposition() / 2)) {
            theMidnightDreamBlues.getEnemy().endOfBattle(lois);
        }
        
        else {
            System.out.println("Start of Battle Round: ");
        }
        
        lois.attack(theMidnightDreamBlues.getEnemy());
        theMidnightDreamBlues.getEnemy().attack(lois);
        
        lois.useMove(choralRampage, theMidnightDreamBlues.getEnemy());
        theMidnightDreamBlues.getEnemy().useMove(swanSong, lois);
        
        while ((lois.getCurrentHealth() >= 0) && (theMidnightDreamBlues.getEnemy().getCurrentHealth() >= 0)) {
            choralRampage.turnElapsed(peetah, theMidnightDreamBlues.getEnemy());
            swanSong.turnElapsed(peetah, theMidnightDreamBlues.getEnemy());
            
            lois.attack(theMidnightDreamBlues.getEnemy());
            
            if (theMidnightDreamBlues.getEnemy().getCurrentHealth() <= 0) {
                theMidnightDreamBlues.getEnemy().endOfBattle(lois);
                
                if ((swanSong.getTimeElapsedSinceLastUse() < swanSong.getLengthOfEffect())) {
                    swanSong.resetMove(theMidnightDreamBlues.getEnemy(), lois);
                }
                
                if ((choralRampage.getTimeElapsedSinceLastUse() < choralRampage.getLengthOfEffect())) {
                    choralRampage.resetMove(theMidnightDreamBlues.getEnemy(), lois);
                }

                lois.battleWinnings(theMidnightDreamBlues.getEnemy(), lounge);
                break;
            }
            
            theMidnightDreamBlues.getEnemy().attack(lois);
            
            if (lois.getCurrentHealth() <= 0) {
                theMidnightDreamBlues.getEnemy().endOfBattle(lois);
                
                if ((swanSong.getTimeElapsedSinceLastUse() < swanSong.getLengthOfEffect())) {
                    swanSong.resetMove(theMidnightDreamBlues.getEnemy(), lois);
                }
                
                if ((choralRampage.getTimeElapsedSinceLastUse() < choralRampage.getLengthOfEffect())) {
                    choralRampage.resetMove(theMidnightDreamBlues.getEnemy(), lois);
                }

                lois.battleLosings(theMidnightDreamBlues.getEnemy());
                break;
            }
            
        }

    }
    
}
