import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Character {

    String name;
    String proffesion;
    int hp;
    int dmg;
    int positionX;
    int positionY;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
       this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }



    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    Scanner scanner = new Scanner(System.in);



    int torchTime;

    public String getProffesion() {
        return proffesion;
    }

    List <String> equipment = new LinkedList<>();

    public Character(String name, String proffesion, int hp, int dmg, int torchTime) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.torchTime = torchTime;
        this.proffesion = proffesion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getTorchTime() {
        return torchTime;
    }

    public void setTorchTime(int torchTime) {
        this.torchTime = torchTime;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public void move (char direction){



    }














}
