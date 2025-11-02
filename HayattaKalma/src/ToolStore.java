public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Para : "+player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zirhlar");
        System.out.println("3. Cikis");
        int selTool = scan.nextInt();
        int selItemID;

        switch (selTool){
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
            selItemID = armorMenu();
            buyArmor(selItemID);
                break;
            default:
                break;
        }
        return true;
    }

    public int armorMenu(){
        System.out.println("1. hafif \t \t <Para : 15 , Hasar Koruma : 1 > ");
        System.out.println("2. orta \t \t <Para : 25 , Hasar Koruma : 3 > ");
        System.out.println("3. agir \t \t <Para : 45 , Hasar Koruma : 6 > ");
        System.out.println("4. IronMan \t <Para : 1500 , Hasar Koruma : 500 > ");
        System.out.println("5. Cikis");
        System.out.println("armor seciniz : ");
        int selArmorID =  scan.nextInt();
        return  selArmorID;
    }
    public void buyArmor(int itemID){
        int avoid =0,price = 0;
        String aName =null;
        switch (itemID){
            case 1:
                avoid = 1;
                aName = "hafif zirh";
                price = 15;
                break;

            case 2:
                avoid = 3;
                aName = "orta zirh";
                price = 25;
                break;
            case 3 :
                avoid = 6;
                aName = "agir zirh";
                price = 45;
                break;
            case 4 :
                avoid = 500;
                aName = "Ironman";
                price = 1500;
                break;
            case 5 :
                System.out.println("Cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz islem ! ");
                break;
        }
        if(price > 0 ){
            if(player.getMoney()>price ) {
             player.getInv().setArmor(avoid);
             player.getInv().setaName(aName);
                player.setMoney(player.getMoney()-price);
                System.out.println(aName+"armor satin aldiniz  , engellenen hasar : "+ player.getInv().getArmor() );
                System.out.println("Kalan para : " + player.getMoney());
            }
            else {
                System.out.println("para yetersiz !");
            }
        }

    }
    public int weaponMenu(){

        System.out.println("1. Tabanca \t \t <Para : 25 , Hasar : 2 > ");
        System.out.println("2. kilic \t \t <Para : 35 , Hasar : 3 > ");
        System.out.println("3. tufek \t \t <Para : 45 , Hasar : 7 > ");
        System.out.println("4. Lightsaber \t <Para : 1500 , Hasar : 500 > ");
        System.out.println("5. Cikis");
        System.out.println("Silah seciniz : ");
        int selWeaponID =  scan.nextInt();
        return  selWeaponID;
    }
    public void buyWeapon(int itemID){
        int damage =0,price = 0;
        String wName =null;
        switch (itemID){
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;

            case 2:
                damage = 3;
                wName = "kilic";
                price = 35;
                break;
            case 3 :
                damage = 7;
                wName = "tufek";
                price = 45;
                break;
            case 4 :
                damage = 500;
                wName = "Lightsaber";
                price = 1500;
                break;
            case 5 :
                System.out.println("Cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz islem ! ");
                break;
        }
   if(price > 0 ){
       if(player.getMoney()>price ) {
               player.getInv().setDamage(damage);
       player.getInv().setwName(wName);
       player.setMoney(player.getMoney()-price);
       System.out.println(wName+"Silah satin aldiniz  , Onceki hasar : "+player.getDamage()
               +"\t Yeni hasar : "+  player.getTotalDamage());
       System.out.println("Kalan para : " + player.getMoney());
     }
     else {
           System.out.println("para yetersiz !");
       }
   }

    }
}
