
package aloverorafighter;


public abstract class Item {
    
    private String name;
    
    private int attackBonus;
    private int defenseBonus;
    private int price;
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAttackBonus(int newAttackBonus) {
        this.attackBonus = newAttackBonus;
    }
    
    public void setDefenseBonus(int newDefenseBonus) {
        this.defenseBonus = newDefenseBonus;
    }
    
    public void setPrice(int newPrice) {
        this.price = newPrice;
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
    
    public int getPrice() {
        return this.price;
    }
    
}
