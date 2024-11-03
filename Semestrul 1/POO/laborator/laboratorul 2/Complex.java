class Complex {
    public static int numardenr ;
    private double re =0;
    private double im =0;


    public Complex(double re,double im)
    {
        numardenr++;
        this.re = re;
        this.im = im;
    }

    public void afisare()
    {
        System.out.println(re + "+i*" + im);
    } 


    public Complex Suma(Complex a)
    {
        Complex sum = new Complex(0, 0);
        sum.re = re + a.re;
        sum.im = im + a.im;
        return sum;
    }
    public double modul()
    {
        return Math.sqrt(re*re+im*im);
    }
    public static int getNumber()
    {
        return numardenr;
    }
}

