public class ClassSheet {

    public String getProffesion() {
        return proffesion;
    }

    private final String proffesion;
    private String className;
    private int hp;
    private int dmg;
    private int torchTime;

    public String getClassName() {
        return className;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getTorchTime() {
        return torchTime;
    }

    private ClassSheet(String proffesion, int hp, int dmg, int torchTime) {
        this.proffesion = proffesion;
        this.hp = hp;
        this.dmg = dmg;
        this.torchTime = torchTime;
    }

    private static ClassSheet createBarbarian  (){
        return new ClassSheet("Barbarzyńca", 10, 10, 20);
    }

    private static ClassSheet createThief  (){
        return new ClassSheet("Złodziej", 10, 10, 20);
    }

    private static ClassSheet createMage  (){
        return new ClassSheet("Złodziej", 10, 10, 20);
    }

    static ClassSheet getStats(int choice) {

        switch (choice) {
            case 1:
                return createBarbarian();
            case 2:
                return createThief();
            case 3:
                return createMage();
                default:
                    {
                break;
                    }
        }
        return new ClassSheet("inny", 23, 23, 23);
    }
}
