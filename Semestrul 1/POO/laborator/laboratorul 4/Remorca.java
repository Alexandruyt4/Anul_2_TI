public class Remorca {

    private int nrCutii;
    private String nrInmatriculare;
    private static int nrCutiiAnterioare;
    public Remorca(String nrInmatriculare,int nrCutii)
    {
        this.nrCutii = nrCutii;
        this.nrInmatriculare = nrInmatriculare;
        nrCutiiAnterioare = nrCutii;
    }

    public Remorca(String nrInmatriculare)
    {
        this.nrInmatriculare = nrInmatriculare;
        if(nrCutiiAnterioare == 0)
            this.nrCutii = 10;
        else
            this.nrCutii = 1+ nrCutiiAnterioare;
        nrCutiiAnterioare = nrCutii;
    }

    public void SetRemorca(Remorca rem)
    {
        this.nrCutii = rem.nrCutii;
        this.nrInmatriculare = nrInmatriculare;
    }

    public String GetNrInmatriculare()
    {
        return nrInmatriculare;
    }

    public int GetNrCutii()
    {
        return nrCutii;
    }

}
