import java.util.Scanner;

public class CharacterCreator {


    private static String nameSelector (){
        System.out.println("Podaj imie");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int classSelector () {

        System.out.println();
        System.out.println("Wybierz postac:");
        System.out.println("1 - Barbarzyńca - zwiększona siła i wytrzymałość");
        System.out.println("2 - Złodziej - zmniejszone zużycie pochodni");
        System.out.println("3 - Mag - posiada magiczne światło, zmniejszona siła i wytrzymałość");

        Scanner scanner = new Scanner(System.in);
        int charClassChoice = scanner.nextInt();

        if ((charClassChoice == 1) || (charClassChoice == 2) || (charClassChoice == 3))
        {
            System.out.println("Interesujace!");
        } else
            {
         System.out.println("Wybierz 1, 2, lub 3");
         classSelector();
            }

        return charClassChoice;
    }

    static Character characterCreatorInit() throws InterruptedException {

        String newCharName = nameSelector();
        int charClassChoice = classSelector();
        ClassSheet charClass = ClassSheet.getStats(charClassChoice);
        return new Character(newCharName, charClass.getProffesion(), charClass.getHp(), charClass.getDmg(), charClass.getTorchTime());

    }

}
