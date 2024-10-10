class client {
    public static void main(String args[])
    {
        Complex numar1 ,numar2 ;
        numar1 =new Complex(2.0,3.0);
        numar2 = new Complex(3.0, 5.0);
        Complex suma = numar1.Suma(numar2);
        suma.afisare();
        System.out.println(numar1.modul());
        System.out.println(Complex.getNumber());
    }    
}
