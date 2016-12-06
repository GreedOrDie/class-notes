import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jeff on 11/30/16.
 */
public class TextAdventure {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome traveler");

        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseLocation();
        player.setDamage(10);
        player.setHealth(100);

        Enemy ogre = new Enemy();
        ogre.setHealth(50);
        ogre.setDamage(10);

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(player);
        characters.add(ogre);

        player.battle(ogre);
    }
}
