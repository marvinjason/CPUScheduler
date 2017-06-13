
public class Event
{
    private final String processName;
    private final int startTime;
    private int finishTime;
    
    public Event(String processName, int startTime, int finishTime)
    {
        this.processName = processName;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }
    
    public String getProcessName()
    {
        return processName;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
    
    public int getFinishTime()
    {
        return finishTime;
    }
    
    public void setFinishTime(int finishTime)
    {
        this.finishTime = finishTime;
    }
}
