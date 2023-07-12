// import java.util.*;
// class outerClass{
//     int x = 10;

//     class innerClass{
//         int y = 20;
//     }
// }

// class Inner_Class{
//     public static void main(String args[]){
//         outerClass outer = new outerClass();
//         outerClass.innerClass inner = outer.new innerClass();
//         System.out.println(outer.x);
//         System.out.println(inner.y);
//     }
// }

import java.util.*;
class outerClass{
    int x = 10;

    static class innerClass{
        int method(){
            int y=20;
            return y;
        }
    }
}

class Inner_Class{
    public static void main(String args[]){
        // outerClass outer = new outerClass();
        outerClass.innerClass inner = new outerClass.innerClass();
        System.out.println(inner.method());
    }
}