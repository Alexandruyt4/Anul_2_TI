package laborator.recapitulare;

class Complex{
    private static int contor;
    private double re;
    private double im;

    Complex()
    {}


    Complex(double re,double im)
    {
        this.re = re;
        this.im = im;
    }

    public double modul()
    {
        return Math.sqrt(re*re + im*im);
    }

    public void afiseaza()
    {
        System.out.println(re + " + i*" + im);
        contor++;
    }

    public Complex suma(Complex nr)
    {
        Complex a = new Complex();
        a.re = re + nr.re;
        a.im = im + nr.im;
        return a;
    }
    public int contorizare()
    {
        return contor;
    }
}

class Laborator2 {
    public static void main(String[] argv)
    {
        Complex a = new Complex(2,3);
        Complex b = new Complex(1,1);
        
        System.out.println(a.modul());
        System.out.println(b.modul());
        Complex c =  a; //Aliasing
        c.afiseaza();
        a = c.suma(b);
        

 

    }
}
