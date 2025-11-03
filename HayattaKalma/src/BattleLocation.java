public abstract class BattleLocation extends Location {
    protected Obstacle obstacle;
    protected String award;

    BattleLocation(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.Count();
        System.out.println("Suan " + this.getName() + " bolgesindesiniz.");
        System.out.println("Dikkatli ol! Burada " + obsCount + " tane dusman " + obstacle.getName() + " var!");
        System.out.print("<S>avas veya <K>ac : ");
        String selCase = scan.nextLine().toUpperCase();

        if (selCase.equals("S")) {
            boolean result = combat(obsCount);

            if (player.getHealth() <= 0) {
                System.out.println("Oldunuz!");
                System.out.println("Game over");
                return false;
            }

            if (result) {
                System.out.println(this.getName() + " bolgesindeki tum dusmanlari temizlediniz!");
                if (this.award.equals("Food") && !player.getInv().isFood()) {
                    System.out.println(this.award + " kazandiniz!");
                    player.getInv().setFood(true);
                } else if (this.award.equals("Water") && !player.getInv().isWater()) {
                    System.out.println(this.award + " kazandiniz!");
                    player.getInv().setWater(true);
                } else if (this.award.equals("Firewood") && !player.getInv().isFirewood()) {
                    System.out.println(this.award + " kazandiniz!");
                    player.getInv().setFirewood(true);
                }
            }

        } else if (selCase.equals("K")) {
            System.out.println("Kacmayi sectiniz, bolgeden ayriliyorsunuz...");
        } else {
            System.out.println("Gecersiz secim!");
            return getLocation();
        }

        return true;
    }

    public boolean combat(int obsCount) {
        for (int i = 0; i < obsCount; i++) {
            int defObsHealth = obstacle.getHealth();
            System.out.println("--------------------------");
            System.out.println((i + 1) + ". dusmanla karsilastin!");
            playerStats();
            enemyStats();

            while (player.getHealth() > 0 && obstacle.getHealth() > 0) {
                System.out.print("<V>ur veya <K>ac : ");
                String selcase = scan.nextLine().toUpperCase();

                if (selcase.equals("V")) {
                    System.out.println("Oyuncu vurdu!");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                    afterHit();

                    if (obstacle.getHealth() > 0) {
                        System.out.println(obstacle.getName() + " size vurdu!");
                        int obsDamage = obstacle.getDamage() - player.getInv().getArmor();
                        if (obsDamage < 0) obsDamage = 0;
                        player.setHealth(player.getHealth() - obsDamage);
                        afterHit();
                    }

                } else if (selcase.equals("K")) {
                    System.out.println("Kacmayi sectiniz!");
                    return false;
                } else {
                    System.out.println("Gecersiz secim!");
                }
            }

            if (obstacle.getHealth() <= 0 && player.getHealth() > 0) {
                System.out.println("Dusmani yendiniz!");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Guncel para: " + player.getMoney());
                obstacle.setHealth(defObsHealth);
            } else if (player.getHealth() <= 0) {
                return false;
            }

            System.out.println("**********************");
        }

        return true;
    }

    public void playerStats() {
        System.out.println("Player stats\n-------------");
        System.out.println("Can : " + player.getHealth());
        System.out.println("Hasar : " + player.getTotalDamage());
        System.out.println("Para : " + player.getMoney());
        if (player.getInv().getDamage() > 0) {
            System.out.println("Silah : " + player.getInv().getwName());
        }
        if (player.getInv().getArmor() > 0) {
            System.out.println("Zirh : " + player.getInv().getaName());
        }
        System.out.println();
    }

    public void enemyStats() {
        System.out.println(obstacle.getName() + " stats\n-------------");
        System.out.println("Can : " + obstacle.getHealth());
        System.out.println("Hasar : " + obstacle.getDamage());
        System.out.println("Odul : " + obstacle.getAward());
        System.out.println();
    }

    public void afterHit() {
        System.out.println("Oyuncu Cani : " + player.getHealth());
        System.out.println(obstacle.getName() + " Cani : " + obstacle.getHealth());
        System.out.println();
    }
}
