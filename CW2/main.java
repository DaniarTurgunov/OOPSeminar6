package Seminar6.CW2;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = CatBuilder.getInstance().setName("bars").setAge(8).setWeight(5).build();
        System.out.println(cat);
    }
}
