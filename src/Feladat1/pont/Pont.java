package Feladat1.pont;

public class Pont
{
    private int X;
    private int Y;

    public Pont()
    {
        X = 0;
        Y = 0;
    }

    public  Pont(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    public Pont(int n)
    {
        this.X = generate(n);
    }

    private int generate(int n)
    {
        return  (int) (Math.random() * ((2 * n) + 1 )) - n;
    }

    public double origoTavolsag()
    {
        return  Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2));
    }

    @Override
    public String toString() {return String.format("(%d, %d)", this.X, this.Y);}
}
