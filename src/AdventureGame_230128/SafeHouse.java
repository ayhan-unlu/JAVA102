package AdventureGame_230128;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House!");
        System.out.println("Your Health is completed!");
        completeHealth();
       // controlAwardInventory();
        return true;
    }

 /*   private void controlAwardInventory() {
        boolean condition1 = (this.getPlayer().getInventory().getCaveAward() == "Food");
        boolean condition2 = (this.getPlayer().getInventory().getForestAward() == "Firewood");
        boolean condition3 = (this.getPlayer().getInventory().getRiverAward() == "Water");
        if (condition1)

        if (condition2)

        if (condition3)

        if (condition1 && condition2 && condition3) {
            System.out.println("You have completed all of the sections in the game!!!\nYou are a WINNER!!!");

        }
    }
*/
    private void completeHealth() {
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
    }

}
