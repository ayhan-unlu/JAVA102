package _230128_AdventureGame;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), 3, "Firewood");
    }
}