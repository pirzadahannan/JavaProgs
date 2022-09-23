import java.util.*;

class sqre{
 static int number(int x){
 return x*x;
 }
}
class qs2{
public static void main(String args[]){
Scanner i= new Scanner(System.in);
int a = i.nextInt();
int x = sqre.number(a);
System.out.println("Square is" + x);
}
}