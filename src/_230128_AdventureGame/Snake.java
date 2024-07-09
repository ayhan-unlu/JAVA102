package _230128_AdventureGame;


public class Snake extends Obstacle {
  //  private Player player;
  //  private static int percentage;
  //  private static int awardChange;
 //   private static int determiner;

    public Snake() {
        super("Snake", 4, (int)(Math.random()*4), 12, 0);
  //      this.player = player;
    }
/*
    public static int randomSnakeDamage() {
        Random r = new Random();
        droppedAwardMoney();
        return r.nextInt(4) + 3;
    }



    public static int assignAwardMoneyChance() {

        percentage = createPercentageChance();

        System.out.println("Assigned percentage is "+percentage);
        if (percentage < 45) {
            determiner = 0;
        }
        if ((percentage > 45) && (percentage < 60)) {
            determiner = 1;
        }
        if ((percentage > 60) && (percentage < 75)) {
            determiner = 2;
        }
        if ((percentage > 75) && (percentage < 100)) {
            determiner = 3;
        }
        System.out.println("Assigned determiner is "+determiner);
        return determiner;
    }

/*   
  public void winAWeapon() {
        Random r = new Random();
        int determiner = r.nextInt(100);
        if (determiner < 50) {
            player.getInventory().setWeapon(Weapon.getWeaponObjById(0));
        }
        if ((determiner >= 50) && (determiner < 80)) {
            determiner = 1;
        }
        if ((determiner >= 80) && (determiner < 100)) {
            determiner = 2;
        }
        if ((determiner > 75) && (determiner < 100)) {
            determiner = 3;
        }

    }
*/
 /*   public static int droppedAwardMoney() {
        int awardMoney = 0;

        switch (assignAwardMoneyChance()) {
            case 0:
                System.out.println("Sorry but this fight ended up with only killing Snake(s). No award won...");
                break;
            case 1:
                System.out.println("You have a chance to win a weapon as an award");
            //    winAWeapon();
                break;
            case 2:
                System.out.println("You have a chance to win an armor as an award");
            //    winAnArmor();
                break;
            case 3:
                System.out.println("You have a chance to win an award money");
             //   winAnAwardMoney();
                break;

            default:
                break;
        }
        return awardMoney;
    } */
}
