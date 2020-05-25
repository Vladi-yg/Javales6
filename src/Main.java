public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("brown", "Sharik", 2, true, 0, 0, 200, 0);
        cat.getInfoCat();
        cat.run();
        cat.jump();
        System.out.println();
        Dog dog = new Dog("brown", "Sharik", 1, true, 10, 0, 500, 0);
        dog.getInfoDog();
        dog.run();
        dog.jump();
    }
}
