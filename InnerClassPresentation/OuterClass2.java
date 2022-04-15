abstract class Person{
    abstract void talk();
}


public class OuterClass2 {
    public static void talk(){
        // anonymous inner class
        Person p = new Person(){
            void talk(){
                System.out.println("bla bla bla");
            }
        };
        p.talk();
    }

    public OuterClass2(){
        this.talk();
    }
}
