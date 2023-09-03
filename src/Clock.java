public class Clock {
    private DataInput hour;
    private DataInput minute;
    private DataInput seconds;

    public Clock(){
        hour=new DataInput(24);
        minute=new DataInput(60);
        seconds=new DataInput(60);
    }
    void setTime(int h,int m){
        hour.setTime(h);
        minute.setTime(m);
        seconds.setTime(1);
    }
    public void tick(){
        seconds.increment();
        if(seconds.getTime()==0){
        minute.increment();
        if((minute.getTime()) == 0){
            hour.increment();
             }
        }
    }
    public String display() {
        String formattedHour = String.format("%02d", hour.getTime());
        String formattedMinute = String.format("%02d", minute.getTime());
        String formattedSeconds = String.format("%02d", seconds.getTime());
        return formattedHour + ":" + formattedMinute + ":" + formattedSeconds;
    }


}
