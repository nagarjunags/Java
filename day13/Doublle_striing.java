class Marker
{
    String brand;
    double price;
    Marker(String brand,double price)
    {
        this.brand=brand;
        this.price=price;
    }
    @Override
    public String toString()
    {
        return "Marker[brand="+brand+",price="+price+"]";
    }
    @Override
    public boolean equals(Object o)
    {
        Marker a =(Marker)o;
        if(this.brand.equals(a.brand)&&this.price==a.price)
        
            return true;
        else
        
            return false;    
    }
    public static void main(String[]args)   
    {
        Marker a =new Marker("camlin",10.0);
        Marker b=new Marker("camlin",10.0);
        //the below 2 liine is written before overiding of the equals method
        System.out.println(a==b);//comparing two object address;bu it compares the content in the premitive members.
        System.out.println(a.equals(b)); //Same as above but above is operator and it is a method.Override the equals method to get the contentwise result but not based on the comparison of the address.
        int h1=a.brand.hashCode();
        int h2=a.hashCode();
        System.out.println(h1);
        System.out.println(h2);
        int h3=b.hashCode();
        System.out.println(h2==h3);

    }
} 