public class Student
{
public statc void main ("String[] args")
{
int n,total=0,percentage;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int marks[]=new int[n];
for(i=0;i<n;i++)
{
marks[i]=s.nextInt();
total=total+marks;
}
System.out.println("Sum:"total);