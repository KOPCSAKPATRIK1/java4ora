package Feladat1;

import Feladat1.pont.Pont;

public class Main
{
    public static void main(String[] args)
    {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(2, 4);
        Pont p4 = new Pont(10);
        Pont p5 = new Pont(10, 15);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.print("Tavolsag az origotol\n");
        System.out.println(p5.origoTavolsag());

    }


}
