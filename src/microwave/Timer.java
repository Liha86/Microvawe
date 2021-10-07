
package microwave;

import java.util.concurrent.TimeUnit;


public class Timer
{
    private int minutes;
    private int seconds;
    
   Timer(int minutes, int seconds)
   {
       this.minutes = minutes;
       this.seconds = seconds;
   }

    public int getMinutes()
    {
        return minutes;
    }

    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }
    String cookTime() throws Exception
    {
        TimeUnit timeUnit = TimeUnit.SECONDS;//TIme unit calc
        int cookTimeInSeconds = getMinutes() * 60 + getSeconds();
        timeUnit.sleep(cookTimeInSeconds);
        return"Ding!";
    }

}   
