public class Telefon {
    private String numePropietar ;
    private String proprietariApelanti[] = new String[100];
    private int contor;
    public boolean apeleaza(Telefon apelant)
    {
        if(contor<100)
        {
            contor ++;
            proprietariApelanti[contor] = apelant.numePropietar;
            return true ;
        }
        else
            return false;
    }

    public Integer numarDeApeluri(String Telefon)
    {
        int i,apeluri=0;
        for(i=1;i<=contor;i++)
        {
            if(Telefon == proprietariApelanti[i])
                apeluri++;

        }
        return apeluri;
    }
    public String toString()
    {
        String sir = numePropietar + "-> ";
        for(int i=1;i<=contor;i++)
        {
            sir = sir + proprietariApelanti[i] + ",";
        }
        return sir;
    }

    public void setNume(String nume)
    {
        numePropietar = nume;
    }
    public String getNume()
    {
        return numePropietar;
    }
}
