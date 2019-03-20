public class Main {
    public static void main(String[] args) throws InterruptedException {
        welcomeScreen ();
        Character player = CharacterCreator.characterCreatorInit();
        testCharacterCreation (player);




    }

    private static void testCharacterCreation(Character player) {
        System.out.println("imie to " + player.getName());
        System.out.println("klasa to " + player.getProffesion());
        System.out.println("masz tyle hp " + player.getHp());
        System.out.println("zadajesz dmg " + player.getDmg());
        System.out.println("zostalo ci pochodzni: " + player.getTorchTime());
    }


    private static void welcomeScreen() throws InterruptedException {
        System.out.println("*** witaj w labiryncie ***");
        System.out.println();
        System.out.println("Zostajesz wtrącony do ciemnego labiryntu. Przy sobie masz wyłącznie pochodnię i klucz do wyjścia. Twoje jedyna szansa na przetrwanie to znalezienie wyjścia zanim pochodnia się wypali. Po wilgotnych ścianach labirytntu odbija się echem nieludzki ryk. Nie jesteś tu sam.");
    }
}
