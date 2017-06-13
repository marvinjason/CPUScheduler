
import java.util.ArrayList;
import java.util.List;

public class Utility
{
    public static List<Row> deepCopy(List<Row> oldList)
    {
        List<Row> newList = new ArrayList();
        
        for (Row row : oldList)
        {
            newList.add(new Row(row.getProcessName(), row.getArrivalTime(), row.getBurstTime(), row.getPriorityLevel()));
        }
        
        return newList;
    }
}
