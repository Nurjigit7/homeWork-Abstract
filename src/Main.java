public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(140, 8, "female", "juleta");
        Cow cow1 = new Cow(100, 6, "female", "juleta");
        Cow cow2 = new Cow(120, 9, "female", "juleta");
        Cow cow3 = new Cow(110, 10, "male", "junior");
        Cow cow4 = new Cow(90, 5, "male", "junior");


        Sheep sheep = new Sheep(100, 10, "female", "muli");
        Sheep sheep1 = new Sheep(80, 8, "female", "muli");
        Sheep sheep2 = new Sheep(60, 5, "female", "muli");

        Horse horse = new Horse(95, 11, "male", "troe");
        Horse horse1 = new Horse(110, 15, "male", "fili");

        Farm farm = new Farm("Tashkent", "Begzot", new Cow[]{cow, cow1, cow2, cow3, cow4},
                new Horse[]{horse, horse1},
                new Sheep[]{sheep1, sheep, sheep2});
        Farm farm1=new Farm("Osh","Doni",
                new Cow[]{cow},new Horse[]{horse},new Sheep[]{sheep});
        System.out.println(farm);
        System.out.println();
        System.out.println(farm1);

    }
}