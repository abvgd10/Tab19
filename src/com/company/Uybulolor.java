package com.company;

import java.util.Random;

public class Uybulolor extends Uybulo  implements KandayUydo {


    public Uybulolor(String jashaganJeri) {
        super(jashaganJeri);
    }



    @Override
    public void kandayUydo() {

        if (kandaiUydo == 1) {
            System.out.print("Канча адам жашайт = ");
            System.out.println(kvartAdam);
            System.out.println("Квартирада жашайт ком услуга толойт");
        } else if (kandaiUydo == 2) {
            System.out.print("Канча адам жашайт = ");
            System.out.println(objtAdam);
            System.out.println("Общежитиеде жашайт аренда  толойт");
        } else {
            System.out.print("Канча адам жашайт = ");
            System.out.println(gostAdam);
            System.out.println("Гостиницада жашайт аренда  толойт");
        }
    }




}
