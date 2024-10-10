class Complex {
    private double real;
    private double imaginar;

    public Complex(double r,double i)
    {
        real = r;
        imaginar = i;
    }

    public void afisare()
    {
        System.out.println(real + "+i*" + imaginar);
    } 


    public Complex Suma(Complex a)
    {
        Complex sum = new Complex(0, 0);
        sum.real = real + a.real;
        sum.imaginar = imaginar + a.imaginar;
        return sum;
    }

}

class main{
    public static void main(String argv[])
    {
        Complex nr1 = new Complex(2, 3);
        Complex nr2 = new Complex(3, 2);
        nr1.afisare();
        nr1 = nr1.Suma(nr2);
        nr1.afisare();
    }
}
