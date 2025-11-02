import java.util.Scanner;

public class Player {
    private int damage,health,money,rHealth;
    private  String name,cName;
   private Inventory inv;
Scanner scan=new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }
public void selectCha(){
      switch (charMenu()){
         //samuray
          case 1 :
              initPlayer("samuray",5,25,15);
              break;

              //okcu
              case 2 :
                  initPlayer("Okcu",7,18,20);
                  break;

         //sovalye
          case 3 :
              initPlayer("sovalye",8,24,5);
                   break;
          default:
              initPlayer("samuray",5,25,15);
              break;
      }
    System.out.println(getcName() + " karekterini sectiniz \t Hasar : "+getDamage()+"\t Saglik : "+ getHealth()+"\t para : "+getMoney());
}
public int charMenu(){
    System.out.println("Lutfen karekter seciniz : ");
    System.out.println("1 - Samuray  \t Hasar : 5 \t Saglik : 21 \t Para : 15");
    System.out.println("2 - Okcu  \t \t Hasar : 7 \t Saglik : 18 \t Para : 20");
    System.out.println("3 - Sovalye \t Hasar : 8 \t Saglik : 24 \t Para : 5");
    System.out.println("Karekter seciminiz : ");
    int chadID = scan.nextInt();

    while(chadID<1 || chadID>3){
        System.out.println("lutfen gecerli bir karekter seciniz ");
         chadID = scan.nextInt();
    }
    return chadID;
}
public int getTotalDamage(){
        return this.damage+this.getInv().getDamage();
}
public void initPlayer(String cName,int dmg,int hlty,int mny){
    setcName(cName);
    setDamage(dmg);
    setHealth(hlty);
    setMoney(mny);
    setrHealth(hlty);
}
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealth() {
        return rHealth;
    }

    public void setrHealth(int rHealth) {
        this.rHealth = rHealth;
    }
}
