class Logical
{
    public static void main(String[] args)
    {
        int a=10, b=20, c=30, d=40;
        System.out.println("NOT(0 & 0) = "+(!((a>b)&&(c>d))));
        System.out.println("0 & 0 = "+((a>b)&&(c>d)));
        System.out.println("0 & 1 = "+((a>b)&&(c<d)));
        System.out.println("1 & 0 = "+((a<b)&&(c>d)));
        System.out.println("1 & 1 = "+((a<b)&&(c<d)));
        System.out.println("0 || 0 = "+((a>b)||(c>d)));
        System.out.println("0 || 1 = "+((a>b)||(c<d)));
        System.out.println("1 || 0 = "+((a<b)||(c>d)));
        System.out.println("1 || 1 = "+((a<b)||(c<d)));
        System.out.println("0 || 0  & 1 = "+((a>b)||(c>d)&&(a<b)));//AND and OR operator has same priority
    }   //so executes from left to right 
}
