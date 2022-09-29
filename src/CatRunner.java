public class CatRunner {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Tom", 10, 2.4);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Kat",7, 2.4);
        cat2.printCatInfo();
        cat2.introduce();

    }

}
