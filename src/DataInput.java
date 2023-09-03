public class DataInput {
    int time;
    int limit;
    public DataInput(int limit){
        this.limit=limit;
        this.time = 0;
    }
    public void setTime(int time){
        this.time=time;
    }
    public int getTime(){
        return time;
    }
    public int increment(){
       time=(time + 1)%limit;
       return time;
    }
}
