package _230128_AdventureGame;

public class Weapon {
    private String name;
    private int Id;
    private int damage;
    private int price;

    public Weapon(String name, int Id, int damage, int price) {
        this.name = name;
        this.Id = Id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Pistol", 1, 2, 15);
        weaponList[1] = new Weapon("Sword ", 2, 3, 35);
        weaponList[2] = new Weapon("Rifle ", 3, 7, 45);
        return weaponList;
    }

    public static Weapon getWeaponObjById(int id) {
        for (Weapon w : Weapon.weapons()) {
            if (w.getId() == id) {
                return w;
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
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
