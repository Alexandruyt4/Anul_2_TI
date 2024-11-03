class fisier{
    private String nume_fisier;
    private String continut;
    private static int id_unic;
    private int concat;
    private fisier fisier_anterior;

    fisier(){}

    fisier(String nume_fisier,String continut)
    {
        this.nume_fisier = nume_fisier;
        this.continut = continut;
        id_unic++;
    }

    public void salveazaVersiune(fisier file1)
    {
        file1.fisier_anterior = fisier_anterior;
        fisier_anterior = file1;
        
        file1.nume_fisier = this.nume_fisier + "bak";
        file1.continut = this.continut ;
    }

    public String concateneaza(fisier file1)
    {
        concat++;
        return this.continut + file1.continut;
    }

    public int numarConcatenari()
    {
        return concat;
    }

    public String toString()
    {
        if(fisier_anterior != null)
            return id_unic + " " + this.nume_fisier+" "+this.continut  +" "+ fisier_anterior.toString()+"\n";
        else
            return id_unic + " " + this.nume_fisier+" "+this.continut+"\n";
    }   
}