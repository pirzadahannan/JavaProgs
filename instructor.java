import java.util.*;

class person
{
char name="Swaid";
int contact=993456783;
char address="awantipora";
}


class employee extends person{
int empid=9800;
int salary;
void getsalary()
{
Scanner d=new Scanner(System.in);
salary=d.nextInt(); 
}
int calgross()
{
int c=salary+bonus;
return c;
}
void display()
{
Sytem.out.println("Name:"+name);
Sytem.out.println("Contact:"+contact);
Sytem.out.println("Address:"+address);
Sytem.out.println("Empid"+empid);
Sytem.out.println("Salary"+salary);
Sytem.out.println("Gross salary"+c);
}



}


class instructor extends employee
{
	
void getbonus()
{
Scanner d=new Scanner(System.in);
bonus=d.nextInt();
}

int calgross()
{
int c=salary+bonus;
return c;
}


public static void main (String ar[])
{
int bonus;

getsalary();
getbonus();
calgross();
display();
}

}