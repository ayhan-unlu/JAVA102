package AdventureGame_230128;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forest", new Vampire(), 3, "Firewood");
    }
}