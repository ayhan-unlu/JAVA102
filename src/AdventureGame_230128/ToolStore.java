package AdventureGame_230128;

public class ToolStore extends NormalLocation {
    int balance = 0;

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
        System.out.println("0 - Exit");
    }

    public void printArmor() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Armors:");
        for (Armor a : Armor.armors()) {
            System.out.println(" Id: " + a.getId() +
                    " Name: " + a.getName() +
                    " Armor < Blockage: " + a.getBlockage() +
                    " Price: " + a.getPrice() + " >");
        }
        System.out.println("0 - Exit");
    }

    public boolean menu() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Welcome to the Tool Store!");
        boolean showMenu = true;
        while (showMenu) {
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
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Hope to see You soon. ");
                    showMenu = false;
                    break;
                // default:
                // System.out.println("You have chosen an invalid action.\nPlease choose
                // again");
                // break;
            }
        }
        return true;
    }

    public void buyWeapon() {
        System.out.print("Please choose the Id number of the weapon You want to buy(1-3): ");

        int selectedWeaponId = input.nextInt();

        while (selectedWeaponId < 0 || selectedWeaponId > Weapon.weapons().length) {
            System.out.println("You have enter an invalid Id. Please try again.");
            selectedWeaponId = input.nextInt();
        }
        if (selectedWeaponId != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectedWeaponId);
            if (selectedWeapon != null) {
                if (sufficientMoneyForWeapon(selectedWeapon)) {
                    // buying a weapon is done in this section
                    System.out.println("You have bought a " + selectedWeapon.getName());
                    balance = calculateBalance(selectedWeapon);
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
    }

    public void buyArmor() {
        System.out.println("Please choose the Id number of the Armor You want to buy");
        int selectedArmorId = input.nextInt();

        while (selectedArmorId < 0 || selectedArmorId > Armor.armors().length) {
            System.out.println("You have enter an invalid Id. Please try again.");
            selectedArmorId = input.nextInt();
        }
        if (selectedArmorId != 0) {

            Armor selectedArmor = Armor.getArmorObjbyId(selectedArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() <= this.getPlayer().getMoney()) {
                    System.out.println("You have bought a " + selectedArmor.getName() + " armor");
                    // balance=this.getPlayer().getMoney()-selectedArmor.getPrice();
                    // this.getPlayer().setMoney(balance);

                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    // same code one line

                    System.out.println("Your balance is: " + this.getPlayer().getMoney());

                    this.getPlayer().getInventory().setArmor(selectedArmor);
                } else
                    System.out.println("You do not have enough money to buy " + selectedArmor.getName());
            }
        }
    }

    public boolean sufficientMoneyForWeapon(Weapon selectedWeapon) {
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
