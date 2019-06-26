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
        startGame(player, position, Mapa);

    }

    private static void startGame(Character player, MapTile position, MainMap mapa) {
        Scanner scanner = new Scanner(System.in);


        while (player.hp > 0 && player.torchTime > 0){
            System.out.println("gdzie chce isc");
            String decision = scanner.next();

        switch (decision) {
            case "w":
                player.positionX -= 1;
                break;
            case "s":
                player.positionX += 1;
                break;
            case "a:":
                player.positionY -= 1;
                break;
            case "d":
                player.positionY += 1;
                break;
            case "x":
                int x = player.getPositionX();
                int y = player.getPositionY();
                System.out.println("x = " + x + ", y = " + y);
                break;

        }
            position = mapa.currentTile(player.positionX, player.positionY);
            System.out.println("Twoja pozycja to " + position.getDescription());

        }


    }

    private static void displayInstructions() {
        System.out.println("w s a d - zeby sie poruszac, x zeby zobaczyc gdzie jestes teraz");

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
