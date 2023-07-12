import java.util.ArrayList;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{   // here consumer is an functionalInterface
    public void accept(Integer i){
        System.out.println(i);
    }
}

interface A{
    public void show(int i);
}

// class lambda implements A{
//     public void show(){
//         System.out.println("hello");
//     }
// }

public class LambdaDemo {
    public static void main(String args[]){

        // A obj = new lambda();
        // obj.show();

        A obj;
        // obj = new A()
        // {                                 // anonymous Inner class
        //     public void show(){
        //         System.out.println("hello world ");
        //     }
        // };
        // obj.show();
        
        // OR

        obj = (i) -> System.out.println("hello world " + i);
        obj.show(4);



        
        ArrayList<Integer> values = new ArrayList<Integer>(6);
        values.add(1);
        values.add(12);
        values.add(13);
        values.add(15);
        values.add(45);

        for(int i=0;i<values.size();i++){   //  for loop
            System.out.println(values.get(i));
        }

        for(int i : values){   // unhanced for loop
            System.out.println(i);
        }

        values.forEach(i -> System.out.println(i));  // for each loop and lambda function
        
        Consumer<Integer> con = new ConsImpl(); 
        values.forEach(con);


        Consumer<Integer> c = new Consumer<Integer>()
        {
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        values.forEach(c);

        Consumer<Integer> c1 = (i -> System.out.println(i));
        values.forEach(c1);

        values.forEach(i -> System.out.println(i));
    }
}
