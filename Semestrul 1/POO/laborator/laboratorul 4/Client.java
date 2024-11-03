public class Client {
    public static void main(String argv[])
    {
        Tir tir = new Tir();
        tir.adaugaRemorca(23,"MH 23 AVH");
        tir.adaugaRemorca(41,"TM 23 AVH");
        Tir tir2 = new Tir();
        tir2.adaugaRemorca(23,"MH 23 AVH");
        tir2.adaugaRemorca(41,"TM 23 AVH");
        System.out.println(tir.toString());
        System.out.println(tir.equals(tir2));
    }
    
}
