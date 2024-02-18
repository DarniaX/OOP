package geometric;
import java.util.*;

public class BottomSorter implements Comparator<Geometric>{
    public int compare(Geometric o1, Geometric o2){
        return (int)(o1.get_bottom_rect()-o2.get_bottom_rect());
    }
    
}
