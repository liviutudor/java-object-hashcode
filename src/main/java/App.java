import hash.BaseClass;
import hash.specialized.SubSpecializedChild;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {
        SubSpecializedChild child1 = new SubSpecializedChild();
        child1.setLocale(new Locale(("en")));

        SubSpecializedChild child2 = new SubSpecializedChild();
        child2.setLocale(new Locale(("en")));

        Set<BaseClass> set = new HashSet<>();

        System.out.println("EQUALS : " + child1.equals(child2));
        System.out.println("HASH 1 : " + child1.hashCode());
        System.out.println("HASH 2 : " + child2.hashCode());

        set.add(child1);
        set.add(child2);
        System.out.println("SET :");
        set.forEach(entry -> System.out.println("ENTRY : " + entry));
    }
}
