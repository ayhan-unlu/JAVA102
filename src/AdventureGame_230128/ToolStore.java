package AdventureGame_230128;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
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

    public void printWeapon() {
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Weapons:");
    }

    public void printArmor() {
        System.out.println("Armor:");
    }

    public void menu() {

    }

    public void buy() {

    }

    public void sufficientMoney() {

    }
}
