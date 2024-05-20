public class DemoDriver{
public static void main(String[]args){
System.out.println("Enter the 2 numbers to print sum");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
Demo d=new DemoImpl();
System.out.println(d.sub(n1,n2));
}
}