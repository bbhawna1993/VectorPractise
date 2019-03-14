import java.util.*;

public class DemoVector {

    public static void main(String[] args)
    {
        TreeSet s=new TreeSet();

        Employee e1=new Employee("aa",1);
        Employee e2=new Employee("bb",2);
        Employee e3=new Employee("cc",3);
        Employee e4=new Employee("dd",4);
        Employee e5=new Employee("ee",5);
        Employee e6=new Employee("ff",6);

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);
        s.add(e6);

        Iterator i= s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}

class Employee implements Comparable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString()
    {
        return name+ "-----"+id;
    }
    public int compareTo(Object o)
    {
        Employee e=(Employee)o;
        int id2=e.id;
        int id1=this.id;

        if(id1<id2)
            return -1;
        else if(id1>id2)
            return +1;
        else
            return 0;

    }
}


class MyComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Integer s1=(Integer)o1;
        Integer s2=(Integer)o2;

        return -s1.compareTo(s2);
    }
}