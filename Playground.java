/**
 * Class to model a Playground
 *
 * Lab 4 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Playground
{
    public void run()
    {
        Person p = new Person();

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        p.setFirstName("Gary");
        p.setLastName("Tong");
        p.setAge(30);
        p.setHeight(180.5);

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        if(p.isOld())
        {
            System.out.println("Person is old.");
        }
        else
        {
            System.out.println("Person is young.");
        }

        if(p.isTall())
        {
            System.out.println("Person is tall.");
        }
        else
        {
            System.out.println("Person is short.");
        }
    }
    /**
     * Creates two instances of Person class.
     * 
     */
    public void run2()
    {
        Person person1 = new Person();
        //Person person2 = person1;
        Person person2 = new Person();
        
        person1.setFirstName("Gary");
         //person2.setFirstName("Gary");
         person2.setFirstName("Mary");
        if (person1.getFirstName().equals(person2.getFirstName()))
        {
            System.out.println("Same name!");
        }
        else
        {
            System.out.println("Different name!");
        }
        
    }
}
