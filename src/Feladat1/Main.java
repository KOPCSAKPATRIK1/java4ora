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
        Pont p6 = new Pont(100);
        Pont p7 = new Pont(100);
        Pont p8 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.getClass());
        System.out.println(p4);

        System.out.print("Tavolsag az origotol\n");
        System.out.println(p5.origoTavolsag());

        System.out.print("P5 es P6 tavolsaga\n");
        System.out.println(p6.ketPontTavolsaga(p7));

        System.out.println(p8.onePont());
    }


}
