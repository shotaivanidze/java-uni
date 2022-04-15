public class OuterClass4 {
    static int data = 30;
    private int x = 10;

    // static nested class
    static class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
    }
    public OuterClass4(){
        OuterClass4.Inner obj = new OuterClass4.Inner();
        obj.msg();
    }
}
