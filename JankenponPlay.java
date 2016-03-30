
package jankenpon;
import java.util.*;
public class JankenponPlay {

    public static void main(String[] args) {
        Jankenpon human = new Jankenpon();
        Jankenpon monster = new Jankenpon();
        Scanner x = new Scanner(System.in);
        Random in = new Random();
        
        System.out.println("================================");
        System.out.println("            Jankenpon           ");
        System.out.println("================================");
        
        while(true){
            System.out.println("Pick One :");
            for(int i = 0; i < human.weapon.length; i++){
                System.out.println((i + 1) + ". " + human.weapon[i]);
            }
            System.out.print("Your Pick : ");
            human.setPick(x.nextInt()-1);
            monster.setPick(in.nextInt(3));
            System.out.println("Monster : " + monster.weapon[monster.getPick()]);
            human.versus(human, monster);
            System.out.println("\nPoint");
            System.out.println("Human   : " + human.getPoint());
            System.out.println("Monster : " + monster.getPoint());
            if((human.getPoint() == 0) || (monster.getPoint()== 0)){
                String win = (human.getPoint() < monster.getPoint()) ? "\nMonster Win !!!" : "\nManusia Win !!!";
                System.out.println(win);
                break;
            }
            System.out.println("");
        }
    }
    
}

