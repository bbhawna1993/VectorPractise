import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparablePractise {

    public static void main(String[] args)
    {
        Employee1 e1=new Employee1(2,"aa");
        Employee1 e2=new Employee1(3,"bb");
        Employee1 e3=new Employee1(5,"cc");
        Employee1 e4=new Employee1(6,"dd");
        Employee1 e5=new Employee1(1,"ee");
        Employee1 e6=new Employee1(4,"ff");


        TreeSet t=new TreeSet(new MyComparator1());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);

        Iterator itr=t.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

class Employee1 implements Comparable
{
    int id;
    String name;

    Employee1(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public String toString()
    {
        return id+"-----"+name;
    }

    public int compareTo(Object obj)
    {
        int id1=this.id;
        Employee1 e=(Employee1)obj;
        int id2=e.id;

        if(id1<id2)
            return -1;
        else if(id1>id2)
            return +1;
        else
            return 0;
    }

}

class MyComparator1 implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Employee1 e1=(Employee1)obj1;
        Employee1 e2=(Employee1)obj2;

        String s1=e1.name;
        String s2=e2.name;

        return -s1.compareTo(s2);
    }
}