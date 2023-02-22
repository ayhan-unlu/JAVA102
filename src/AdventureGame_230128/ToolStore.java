package AdventureGame_230128;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        return menu();
    }

    public void printWeapon() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Weapons:");

        for (Weapon w : Weapon.weapons()) {
            System.out.println(" Id: " + w.getId() +
                    " < Name: " + w.getName() +
                    " Damage: " + w.getDamage() +
                    " Price: " + w.getPrice() + " >");
        }

    }

    public void printArmor() {
        System.out.println("Armor:");
    }

    public boolean menu() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Welcome to the Tool Store!");
        System.out.println("Feel free to buy anything as long as You can afford it!");
        System.out.println("1. Buy a Weapon");
        System.out.println("2. Buy an Armor");
        System.out.println("3. Exit");
        System.out.print("Please choose your action(1-3):");

        int selectCase = input.nextInt();

        while (selectCase < 1 || selectCase > 3) {
            System.out.println("You have chosen an invalid action.");
            System.out.print("Please choose again.");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Hope to see You soon. ");
                return true;
            // default:
            // System.out.println("You have chosen an invalid action.\nPlease choose
            // again");
            // break;
        }
        return true;

    }

    public void buyWeapon() {
        System.out.print("Please choose the Id number of the weapon You want to buy(1-3): ");

        int selectedWeaponId = input.nextInt();

        while (selectedWeaponId < 1 || selectedWeaponId > Weapon.weapons().length) {
            System.out.println("You have enter an invalid Id. Please try again.");
            selectedWeaponId = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectedWeaponId);
        if (selectedWeapon != null) {
            if (sufficientMoney(selectedWeapon)) {
                // buying a weapon is done in this section
                System.out.println("You have bought a " + selectedWeapon.getName());
                int balance = calculateBalance(selectedWeapon);
                // int newDamage=calculateDamage(selectedWeapon);
                System.out.println("Your balance is: " + balance);
                this.getPlayer().setMoney(balance);
                // System.out.println("Your previous weapon was " +
                // this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                // System.out.println("Your new weapon is " +
                // this.getPlayer().getInventory().getWeapon().getName());
                // this.getPlayer().getInventory().getWeapon().setDamage(newDamage);

            } else
                System.out.println("You do not have enough money to buy " + selectedWeapon.getName());

        }

    }

    public boolean sufficientMoney(Weapon selectedWeapon) {
        if (selectedWeapon.getPrice() <= this.getPlayer().getMoney()) {
            return true;
        }
        return false;
    }

    public int calculateBalance(Weapon selectedWeapon) {
        int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
        return balance;
    }

    public int calculateDamage(Weapon selectedWeapon) {
        int damage = this.getPlayer().getDamage() + getPlayer().getInventory().getWeapon().getDamage();
        return damage;
    }
}
