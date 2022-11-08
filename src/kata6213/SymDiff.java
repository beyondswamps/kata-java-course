package kata6213;

import java.util.HashSet;
import java.util.Set;

public class SymDiff {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
//        Set<T> operatingSet = new HashSet<>(set1);
//        operatingSet.retainAll(set2);
//        Set<T> sharedElements = operatingSet;
//        operatingSet = new HashSet<>(set1);
//        operatingSet.addAll(set2);
//        operatingSet.removeAll(sharedElements);
//        return operatingSet;
        Set<T> copySet1 = new HashSet<>(set1);
        Set<T> copySet2 = new HashSet<>(set2);
        copySet1.removeAll(set2);
        copySet2.removeAll(set1);
        copySet1.addAll(copySet2);
        return copySet1;


    }

    public static void main(String[] args) {

    }
}
