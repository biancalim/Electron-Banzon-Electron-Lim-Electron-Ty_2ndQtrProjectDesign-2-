
package aloverorafighter;

import java.util.ArrayList;

public class Shop implements Available {
    
    private boolean availability;
    private String name;
    private ArrayList<Weapon> weaponsForSale;
    private ArrayList<Weapon> purchasedWeapons;
    private ArrayList<Potion> potionsForSale;
    private ArrayList<Potion> purchasedPotions;
    
    public Shop(boolean a, String n) {
        this.availability = a;
        this.name = n;
        weaponsForSale = new ArrayList<Weapon>();
        purchasedWeapons = new ArrayList<Weapon>();
        potionsForSale = new ArrayList<Potion>();
        purchasedPotions = new ArrayList<Potion>();
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setWeaponsForSale(ArrayList<Weapon> newWeaponsForSale) {
        this.weaponsForSale = newWeaponsForSale;
    }
    
    public void setPurchasedWeapons(ArrayList<Weapon> newPurchasedWeapons) {
        this.purchasedWeapons = newPurchasedWeapons;
    }
    
    public void setPotionsForSale(ArrayList<Potion> newPotionsForSale) {
        this.potionsForSale = newPotionsForSale;
    }
    
    public void setPurchasedPotions(ArrayList<Potion> newPurchasedPotions) {
        this.purchasedPotions = newPurchasedPotions;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<Weapon> getWeaponsForSale() {
        return this.weaponsForSale;
    }
    
    public ArrayList<Weapon> getPurchasedWeapons() {
        return this.purchasedWeapons;
    }
    
    public ArrayList<Potion> getPotionsForSale() {
        return this.potionsForSale;
    }
    
    public ArrayList<Potion> getPurchasedPotions() {
        return this.purchasedPotions;
    }
    
    public void buyWeapon(Weapon weapon, PlayerCharacter player) {
        int currentMoneyStockpile = player.getCurrentMoneyAmount();
        player.setCurrentMoneyAmount(currentMoneyStockpile - weapon.getPrice());
        this.weaponsForSale.remove(weapon);
        this.purchasedWeapons.add(weapon);
        weapon.setPrice(0);
        
        System.out.println(weapon.getName() + " has been purchased!");
    }
    
    public void buyPotion(Potion potion, PlayerCharacter player) {
        int currentMoneyStockpile = player.getCurrentMoneyAmount();
        player.setCurrentMoneyAmount(currentMoneyStockpile - potion.getPrice());
        this.potionsForSale.remove(potion);
        this.purchasedPotions.add(potion);
        potion.setPrice(0);
        
        System.out.println(potion.getName() + " has been purchased!");
    }
    
    @Override
    public void available() {
        this.availability = true;
        System.out.println("Shop '" + this.getName() + "' has been unlocked!");
    }
}
