package com.company;

public class Main {

    public static void main(String[] args) {


        Uybulolor uybulolor1 = new Uybulolor("Бишкек Аламедин-1");
        System.out.println(uybulolor1);
        uybulolor1.kandayUydo();

        System.out.println();
        Uybulolor uybulolor2 = new Uybulolor("Бишкек Васток-5");
        System.out.println(uybulolor2);
        uybulolor2.kandayUydo();

        System.out.println();
        Uybulolor uybulolor3 = new Uybulolor("Бишкек Учкун");
        System.out.println(uybulolor3);
        uybulolor3.kandayUydo();

        System.out.println();
        Uybulolor uybulolor4 = new Uybulolor("Бишкек Тунгуч");
        System.out.println(uybulolor4);
        uybulolor4.kandayUydo();

        System.out.println();
        Uybulolor uybulolor5 = new Uybulolor("Бишкек Кок-Жар");
        System.out.println(uybulolor5);
        uybulolor5.kandayUydo();
    }
}
