import java.util.*;

class CollectionsInJava{
    public static void main(String args[]){
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new LinkedList();
        List<Integer> l3 = new Vector();
        Vector<Integer> l4 = new Stack();

        Queue<Integer> q1 = new PriorityQueue<>();
        Deque<Integer> q2 = new ArrayDeque<>();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        SortedSet<Integer> s3 = new TreeSet<>();

        // Map<Integer,Integer> m1 = new AbstractMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        // Map<Integer,Integer> m3 = new EnumMap<>();
        SortedMap<Integer,Integer> m4 = new TreeMap<>();

        String str = new String();
    }
}