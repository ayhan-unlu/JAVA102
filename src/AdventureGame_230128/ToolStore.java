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

        System.out.print("Please choose the Id number of the weapon You want to buy(1-3): ");

        int selectedWeaponId = input.nextInt();

        while (selectedWeaponId < 1 || selectedWeaponId > Weapon.weapons().length) {
            System.out.println("You have enter an invalid Id. Please try again.");
            selectedWeaponId = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectedWeaponId);
        if (selectedWeapon != null) {
            if (sufficientMoney(selectedWeapon)) {
                System.out.println("You have bought a " + selectedWeapon.getName());
                int balance=calculateBalance(selectedWeapon);
                System.out.println("Your balance is: " + balance);
                this.getPlayer().setMoney(balance);

            } else
                System.out.println("You do not have enough money to buy " + selectedWeapon.getName());

        }
        /*
         * switch (selectWeapon) {
         * case 1:
         * 
         * break;
         * case 2:
         * 
         * break;
         * case 3:
         * 
         * break;
         * }
         */
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

    public void buy() {

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
}
