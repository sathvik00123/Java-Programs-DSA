import java.util.*;

// ArrayList

// class collection{
//     public static void main(String args[]){
//         ArrayList<String> names = new ArrayList<String>();
//         names.add("sathvik");
//         names.add("keerthan");
//         names.add("harsha");
//         names.add("ram");

//         for(String i : names){
//             System.out.println(i);
//         }

//         names.remove("harsha");
//         System.out.println("\n");

//         System.out.println(names.get(1));
//         System.out.println("\n");

//         for(String i : names){
//             System.out.println(i);
//         }

//         names.set(1,"SATHVIK");
//         System.out.println("\n");
//         for(String i : names){
//             System.out.println(i);
//         }

        
//     }
// }



//  LinkedList

// class collection{
//     public static void main(String args[]){
//         int[] arr = {1,2,3,4,5};

//         for(int i : arr){
//             System.out.println(i);
//         }

//         LinkedList<String> variable = new LinkedList<String>();
//         variable.addFirst("Aaa");
//         variable.addFirst("Bbb");
//         variable.addLast("Ccc");
//         variable.addLast("Ddd");

//         for(String i : variable){
//             System.out.println(i);
//         }
//         System.out.println("\n");
//         System.out.println(variable.getFirst());
//         System.out.println(variable.getLast());

//         System.out.println("\n");
//         variable.removeFirst();
//         for(String i : variable){
//             System.out.println(i);
//         }
//     }
// }


// HashMap

// class collection{
//     public static void main(String args[]){
//         HashMap<String,Integer> details = new HashMap<String,Integer>();
//         details.put("shyam",1);
//         details.put("joe",2);
//         details.put("manish",3);
//         details.put("rajesh",4);
//         System.out.println(details);
//         System.out.println("\n");
//         System.out.println(details.get("joe"));
//         System.out.println("\n");
//         for(String i : details.keySet()){
//             System.out.println(i);
//         }
//         System.out.println("\n");
//         for(int i : details.values()){
//             System.out.println(i);
//         }
//         System.out.println("\n");
//         for(String i : details.keySet()){
//             System.out.println("keys : "+i+", values : "+details.get(i));
//         }
//     }
// }



// HashSet

class collection{
    public static void main(String args[]){
        HashSet<String> cars = new HashSet<String>();
        // Queue<Integer> q = new PriorityQueue<>();
        List<List<Integer>> l = new ArrayList();
        cars.add("BENZ");
        cars.add("AUDI");
        cars.add("BMW");
        cars.add("FERRARI");
        cars.add("LAMBO");
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("MAHENDRA"));
        System.out.println(cars);
        for(String i : cars){
            System.out.println(i);
        }
    }
}

