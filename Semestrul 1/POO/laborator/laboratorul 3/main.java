public class main {

    public static void main(String argv[])
    {
        
        fisier file1 = new fisier("asd","asdasdasfgasgasfagasgasga");
        fisier file2 = new fisier();
        fisier file3 = new fisier();

        file1.salveazaVersiune(file2);
        file3.salveazaVersiune(file1);
        file2.concateneaza(file1);
        System.out.println(file3.toString());
        System.out.println(file2.numarConcatenari());
    }

}
