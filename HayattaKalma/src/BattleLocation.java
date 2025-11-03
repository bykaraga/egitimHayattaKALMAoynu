public abstract class BattleLocation extends Location{
   protected Obstacle obstacle;
     BattleLocation(Player player,String name,Obstacle obstacle) {
        super(player);
        this.name=name;
        this.obstacle=obstacle;

    }

    @Override
    public boolean getLocation() {
        int obsCount = obstacle.Count();
        System.out.println("Suan "+this.getName() +"Buradasiniz");
        System.out.println("Dikkatli ol Burada " + obsCount + " tane dusman " + obstacle.getName()+" var !");
        System.out.println("<S>avas veya <K>ac" );
        String selCase = scan.next();
selCase = selCase.toUpperCase();
if(selCase.equals("S")){
    if(combat(obsCount)){
        System.out.println(this.getName()+ " bolgesindeki Tum dusman yaratiklari temizlediniz");
        return true;
    }else {
        System.out.println("Oldunuz ");
        System.out.println("Game over");
        return false;
    }
}
         return true;
    }
    public boolean combat(int obsCount){
        for (int i = 0 ; i <obsCount ; i++){
            playerStats();
            enemyStats();
        }
         return true;
    }
    public void playerStats(){
        System.out.println("Player stats\n-------------");
        System.out.println("can : "+player.getHealth());
        System.out.println("Hasar : "+player.getTotalDamage());
        System.out.println("Para : "+player.getMoney());
        if(player.getInv().getDamage()>0){
            System.out.println("Silah : "+player.getInv().getwName());
        } if(player.getInv().getArmor()>0){
            System.out.println("zirh : "+player.getInv().getaName());
        }

    }
    public void enemyStats(){
        System.out.println(obstacle.getName()+" stats\n-------------");
        System.out.println("can : "+obstacle.getHealth());
        System.out.println("Hasar : "+obstacle.getDamage());
        System.out.println("Odul : "+obstacle.getAward());
    }
}
