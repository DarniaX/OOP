package geometric;
import java.util.*;

public class AreaSorter implements Comparator<Geometric>{
    public int compare(Geometric o1, Geometric o2){
        return (int)(o1.get_area()-o2.get_area());
    }
}
