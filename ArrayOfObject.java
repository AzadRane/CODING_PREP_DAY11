import java.util.*;

class Student
{
    int rno;
    String name;
    double percentage;
    static int cnt = 0;



    Student(int rno,String name,double percentage)
    {
        this.rno=rno;
        this.name=name;
        this.percentage=percentage;
        cnt++;
    }

    static void CountOfObj()
    {
        System.out.println("No of objects created :"+cnt);
    }

    void show()
    {
        System.out.println("Roll no :"+rno);
        System.out.println("Name :"+name);
        System.out.println("P4ercentage :"+percentage);
        System.out.println();
    }

    static void sort(Student s[])
    {
        Student temp;

        for(int i=s.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(s[j].percentage>s[j+1].percentage)
                {
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
}

public class ArrayOfObject
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of objects to be created");
        int n = sc.nextInt();

        Student []aob = new Student[n];

        for(int i=0;i<aob.length;i++)
        {
            System.out.println("Enter the Name");
            String name = sc.next();

            System.out.println("Enter the percentage");
            double percentage = sc.nextDouble();

             aob[i] = new Student(i+1,name,percentage);
        }

        System.out.println("BEFORE SORT");

        for(int i=0;i<aob.length;i++)
        {
            aob[i].show();
        }

        System.out.println(Student.cnt);

        sc.close();

        Student.sort(aob);

        System.out.println("AFTER SORT");
        
        for(int i=0;i<aob.length;i++)
        {
            aob[i].show();
        }


    }
}