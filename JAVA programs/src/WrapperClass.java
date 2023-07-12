public class WrapperClass {
    public static void main(String args[]){
        int a = 23;
        float f = -34.8909f;
        double d = 121.8908d;

        System.out.println(a);
        Integer a1 = 67;
        // Integer a2 = new Integer(a);   // this won't work...
        System.out.println(a1.intValue());
        System.out.println(a1);

        String s1 = Float.toString(f);    // converting float into string...
        System.out.println("String : "+s1);

        float f2 = Float.parseFloat(s1);  // converting string into float...
        System.out.println("Float : "+f2);
    }
}
