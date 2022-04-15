public class OuterClass1 {
    private int x = 15;
    private int y = 20;

    // member inner class
    class Inner{
        void msg(){
            System.out.println("x + y = " + (x + y));
        }
    }

    public OuterClass1(){
        OuterClass1.Inner innerClass = this.new Inner();
        innerClass.msg();
    }
}
