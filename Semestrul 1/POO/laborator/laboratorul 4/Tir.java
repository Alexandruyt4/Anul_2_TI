public class Tir {
    private int contor;
    private Remorca remorci[] = new Remorca[6]; // Cat de mare vrem sa fie vectorul

    public boolean adaugaRemorca(int nrCutii,String nrInmatriculare)
    {
        if(contor+1<=5)
        {
            contor++;
            remorci[contor] = new Remorca(nrInmatriculare,nrCutii); //Instanteaza fiecare element din vector
            return true;
        }
        return false;
    }

    public boolean adaugaRemorca(Remorca remo)
    {
        if(contor+1<=5)
        {
            contor++;
            remorci[contor] =remo;
            return true;
        }
        else
            return false;
    }

    public Remorca stergeRemorca(String nr_inmatriculare)
    {
        int i;
        Remorca a=null ;
        for(i=1;i<=contor;i++)
        {
            if(remorci[i].GetNrInmatriculare() == nr_inmatriculare)
            {
                a = remorci[i];
                for(int j=i;j<contor;j++)
                    remorci[j].SetRemorca(remorci[j+1]);

            }
        }
        return a;
    }

    public String toString()
    {
        String sir = new String();
        sir = sir + "T->";
        int i;
        for(i=1;i<=contor;i++)
            sir = sir +"("+ remorci[i].GetNrInmatriculare() + "," + remorci[i].GetNrCutii()+")->";
        return sir;
    }


  

    public boolean equals(Object obj)
    {
        if(obj instanceof Tir)
        {
            Tir comparingTir = (Tir) obj;

            int s1=0,s2=0;
            if(contor == comparingTir.contor)
            {
                for(int i=1;i<=contor;i++)
                {
                    s1=s1 + comparingTir.remorci[i].GetNrCutii();
                    s2 = s2 + remorci[i].GetNrCutii();
                }
                return s1==s2;
            }
        }
        return false;
    }
}
