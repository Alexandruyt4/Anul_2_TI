package laborator.recapitulare;

class Client{
    
    public static void main(String argv[])
    {
        int a=23,b=45;
        System.out.println("Hello World!");
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
        int s=0,i=0;
        for(i=1;i<=100;i=i+2)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
        for(i=2;i<=100;i=i+2)
        {
            s+=i;
        }
        System.out.println(s);

    }
}
