import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerTest {
    public static void main(String[] args) {
        //创建set对象传入一个参数比较器
        Set set = new TreeSet(new CustomerComparator());
        Customer customer1 = new Customer("Bluce", 15);
        Customer customer2 = new Customer("Jack", 18);
        Customer customer3 = new Customer("Rose", 25);
        set.add(customer1);
        set.add(customer2);
        set.add(customer3);
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            Customer customer  =(Customer)it.next();
            System.out.println(customer.getName() + "  " + customer.getAge());
        }
    }

}
