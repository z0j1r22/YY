import java.util.Comparator;

public class Customer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class CustomerComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Customer c1 = (Customer)obj1;
        Customer c2 = (Customer)obj2;
        if(c1.getName().compareTo(c2.getName())>0)
            return -1;//降序排列
        if(c1.getName().compareTo(c2.getName())<0)
            return 1;//降序排列
        return 0;
    }

}
