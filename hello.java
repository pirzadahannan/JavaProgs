import java.util.*;

class hello
{
static int count;

public hello()
{
count++;
}
public int getcount()
{
	return count;
}
static{
	count=0;
}


public static void main (String ar[])
{
hello s1=new hello();
hello s2=new hello();
hello s3=new hello();

System.out.println(+hello.count);
}
}