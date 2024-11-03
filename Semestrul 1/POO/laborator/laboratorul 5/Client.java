import java.io.*;
import java.util.Random;

public class Client
{
    public static void main(String argv[]) throws IOException
    {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);
        int n = Integer.parseInt(bf.readLine());
        Telefon telefoane[] = new Telefon[n];
        for(int i=0;i<n;i++)
        {
                String nume = bf.readLine();
                telefoane[i] = new Telefon();
                telefoane[i].setNume(nume);

        }
        int A = Integer.parseInt(bf.readLine());
        for(int i=1;i<=A;i++)
        {
            Random rand = new Random();
            int x = 0;
            int y = 0;
            do{
                x = rand.nextInt(n);
                y = rand.nextInt(n);
            }while(x==y);
            telefoane[x].apeleaza(telefoane[y]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(telefoane[i].toString());
        }
    }

}