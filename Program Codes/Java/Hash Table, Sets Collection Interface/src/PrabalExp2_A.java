import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class PrabalExp2_A {

    public static void main(String[] args) {


        Hashtable ht = new Hashtable();
        ht.put("KEY > 1", "ONE");
        ht.put("KEY > 2", "TWO");
        ht.put("KEY > 3", "THREE");

        System.out.println("<---- PRABAL MANHAS WORKSHEET 2.1 || 20BCS4513");

        Set st = ht.keySet();

        System.out.println("<--- KEYS IN THE SET CREATED FROM HASHTABLE ARE --->");

        Iterator itr = st.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        st.remove("KEY > 1");

        System.out.println("<--- HASHTABLE KEYS AFTER REMOVAL FROM SET ARE --->");
        Enumeration e = ht.keys();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}