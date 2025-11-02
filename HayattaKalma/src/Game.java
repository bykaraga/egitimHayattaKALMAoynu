import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);
    public void login(){


        System.out.println("Hayatta kalma macera oyununa hosgeldiniz");
        System.out.println("Oyuna baslamadan once isminizi giriniz  : ");
String playerName = scan.nextLine();

         player = new Player(playerName);
        player.selectCha();
     start();
    }
    public void start(){
while(true){
    System.out.println();
    System.out.println("================================================");
    System.out.println();
    System.out.println("lutfen gitmek istediginiz bir yeri seciniz :");
    System.out.println("1. safe house --> size ait guvenli bir alan ");
    System.out.println("2. Magara --> karsiniza belki zombi cikabilir ");
    System.out.println("3. orman --> karsiniza belki vampir cikabilir ");
    System.out.println("4. nehir --> karsiniza belki ayi cikabilir ");
    System.out.println("5. magaza --> Silah veya zirh alabilirsiniz  ");
    System.out.print("Gitmek istediginiz yer : ");
    int selectionLock = scan.nextInt();
    while(selectionLock<1||selectionLock>5 ){
        selectionLock = scan.nextInt();
    }
    switch (selectionLock){
        case 1:
            location = new SafeHouse(player);
            break;

        case 5 :
            location = new ToolStore(player);
            break;
        default:
            location = new SafeHouse(player);
            break;
    }
   if( !location.getLocation()){
       System.out.println("GAME OVER");
       break;
   }
}
    }
}
