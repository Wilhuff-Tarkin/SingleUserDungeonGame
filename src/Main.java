import Map.MainMap;
import Map.MapTile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        welcomeScreen ();
        Character player = CharacterCreator.characterCreatorInit();
        MainMap Mapa = new MainMap();
        player.setPositionX(4);
        player.setPositionY(4);
        MapTile position = Mapa.currentTile(player.positionX, player.positionY);
        testCharacterCreation (player, position);
        displayInstructions();
        startGame(player, position);

    }

    private static void startGame(Character player, MapTile position) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gdzie chce isc");
        String decision = scanner.next();

        switch (decision) {
            case "w": player.setPositionY(player.positionY+= 1); break;
            case "s": player.setPositionY(player.positionY-= 1); break;
            case "a:": player.setPositionX(player.positionX+= 1); break;
            case "d": player.setPositionX(player.positionX-= 1); break;
        }

        System.out.println("Twoja pozycja to " + position.getDescription());

    }

    private static void displayInstructions() {
        System.out.println("w s a d - zeby sie poruszac");

    }

    private static void testCharacterCreation(Character player, MapTile position) {
        System.out.println("imie to " + player.getName());
        System.out.println("klasa to " + player.getProffesion());
        System.out.println("masz tyle hp " + player.getHp());
        System.out.println("zadajesz dmg " + player.getDmg());
        System.out.println("zostalo ci pochodni: " + player.getTorchTime());
        System.out.println("twoja pozycja startowa to " + position.getDescription());

    }


    private static void welcomeScreen() throws InterruptedException {
        System.out.println("*** witaj w labiryncie ***");
        System.out.println();
        System.out.println("Zostajesz wtrącony do ciemnego labiryntu. Przy sobie masz wyłącznie pochodnię i klucz do wyjścia. Twoje jedyna szansa na przetrwanie to znalezienie wyjścia zanim pochodnia się wypali. Po wilgotnych ścianach labirytntu odbija się echem nieludzki ryk. Nie jesteś tu sam.");

    }
}
