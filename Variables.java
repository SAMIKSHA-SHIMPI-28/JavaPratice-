public class Variables {

    int b =10;
    static int  c =20;


    public static void main(String[]args) {
        int a =15;
        System.out.println("main a:" +a);
        // System.out.println("b:"+b);  // instance variable not allow in static context
        System.out.println("c:"+ c);

        // check();
        Variables v = new Variables();
        System.out.println("V:"+v);
        v.check();
    }
    void check(){
        int a =20;
        System.out.println("check a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);


    }
}
