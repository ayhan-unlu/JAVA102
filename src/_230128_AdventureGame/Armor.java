package _230128_AdventureGame;

public class Armor {
    private String name;
    private int id;
    private int blockage;
    private int price;

    public Armor(String name, int id, int blockage, int price) {
        this.name = name;
        this.id = id;
        this.blockage = blockage;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor armorList[] = new Armor[3];
        armorList[0] = new Armor("Light", 1, 1, 15);
        armorList[1] = new Armor("Medium", 2, 3, 25);
        armorList[2] = new Armor("Heavy", 3, 5, 40);
        return armorList;
    }

    public static Armor getArmorObjbyId(int id) {
        for (Armor a : Armor.armors()) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlockage() {
        return blockage;
    }

    public void setBlockage(int blockage) {
        this.blockage = blockage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}