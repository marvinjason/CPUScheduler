
import java.util.ArrayList;
import java.util.List;

public abstract class CPUScheduler
{
    private final List<Row> rows;
    private final List<Event> timeline;
    
    public CPUScheduler()
    {
        rows = new ArrayList();
        timeline = new ArrayList();
    }
    
    public boolean add(Row row)
    {
        return rows.add(row);
    }
    
    public boolean remove(String name)
    {
        for (int i = 0; i < rows.size(); i++)
        {
            if (rows.get(i).getProcessName().equals(name))
            {
                rows.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public Event getEvent(Row row)
    {
        for (Event event : timeline)
        {
            if (row.getProcessName().equals(event.getProcessName()))
            {
                return event;
            }
        }
        
        return null;
    }
    
    public List<Row> getRows()
    {
        return rows;
    }
    
    public List<Event> getTimeline()
    {
        return timeline;
    }
    
    public abstract void process();
}

//First Come First Serve
//Shortest Job First
//Shortest Remaining Time
//Priority Scheduling
//Round Robin