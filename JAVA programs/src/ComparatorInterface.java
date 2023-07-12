import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparatorInterface {
    static public void main(String[] args){
        List<Integer> values = new ArrayList();

        values.add(234);
        values.add(543);
        values.add(756);
        values.add(123);
        values.add(654);
        values.add(908);

        Collections.sort(values,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : -1;
            }
        });

        // values.forEach(System.out::println);

        //  OR

        for(Integer val : values){
            System.out.println(val);
        }
    }
}
