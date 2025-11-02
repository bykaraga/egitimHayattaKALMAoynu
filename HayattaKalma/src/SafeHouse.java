public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player,"Safe House");
    }

    @Override
    public boolean getLocation() {
        player.setHealth(player.getrHealth());
        System.out.println("safe house a geldiginiz icin iyilestiniz...");

        return true;
    }
}
