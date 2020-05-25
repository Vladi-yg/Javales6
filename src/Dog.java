import java.util.Scanner;

public class Dog extends Animals{
    private int maxrunlenght;
    private int maxjumpheight;
    private float height;
    private boolean swimmskill;
    private int swimmlenght;
    private int distance;
    Scanner scanner = new Scanner(System.in);
    public Dog(String color, String name, int maxjumpheight, boolean swimmskill, int swimmlenght, int distance, int maxrunlenght, int height) {
        super(color, name);
        this.maxjumpheight = maxjumpheight;
        this.swimmskill = swimmskill;
        this.swimmlenght = swimmlenght;
        this.distance = distance;
        this.maxrunlenght = maxrunlenght;
        this.height = height;
    }
    public void getInfoDog() {
        System.out.println("Information about: " + name);
        System.out.println(name + " " + "runs only " + maxrunlenght + " meters");
        System.out.println(name + " " + "jumps only " + maxjumpheight + " meters");
        System.out.println(name + "' color is" + color);
        if (swimmskill == true) {
            System.out.println(name + " can swimm only " + swimmlenght + " meters");
        } else  System.out.println("Dogs can swimm");
    }
    public void run(){
        int runlenght = scanner.nextInt();
        distance = distance + runlenght;
        if (distance > maxrunlenght) {
            System.out.println("Dog can't run so long. Max distance is " + maxrunlenght);
        } else System.out.println("Dog has ran " + distance);
    }
    public void jump() {
        float jumpheight = scanner.nextFloat();
        height = height + jumpheight;
        if (height > maxjumpheight) {
            System.out.println("Dog can't jump so height. Max height is " + maxjumpheight + " meter");
        } else {
            System.out.println("Dog has jumped " + height);
    }

    }
}
