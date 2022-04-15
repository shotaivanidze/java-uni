public class OuterClass3{
    private int x = 30;

    void display(){
        // Local inner class
        class LocalInnerClass{
            void msg(){
                System.out.println(x);
            }
        }
        LocalInnerClass innerObj = new LocalInnerClass();
        innerObj.msg();
    }
    public OuterClass3(){
        this.display();
    }
}