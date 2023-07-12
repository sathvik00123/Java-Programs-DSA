public class WrapperClasses {
    public static void main(String args[]){

        int i = 10;  // primitive datatype
        
        Integer ii = new Integer(i); // Boxing OR wrapping.

        int j = ii.intValue();  // Unboxing OR wrapping.

        Integer value = i; // AutoBoxing OR AutoWrapping.

        int aa = value; //AutoUnBoxing OR AutoUnWrapping.

    }
    
}
