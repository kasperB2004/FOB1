public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(long secs) {
        if(secs < 0){
            secs = secs * -1;
        }
        addSeconds((int)secs);
    }


    public Time(int hours, int minutes, int seconds) {
        this((long)hours*3600+minutes*60+seconds);
    }

    public Time(int hours, int minutes) {
        this((long)hours*3600+minutes*60);
    }

    public Time(int hours) {
        this((long)hours*3600);
    }

    public int getTime() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    private void addHours(int hoursToAdd) {
        if (hoursToAdd > 0) {
            int totalHours = this.hours + hoursToAdd;
            this.hours = totalHours % 24;
        }
    }


    private void addMinutes(int minutesToAdd) {
        if (minutesToAdd > 0) {
            int totalMinutes = this.minutes + minutesToAdd;
            int extraHours = totalMinutes / 60;
            this.minutes = totalMinutes % 60;
            addHours(extraHours);
        }
    }

    private void addSeconds(int secondsToAdd) {
        if (secondsToAdd > 0) {
            int totalSeconds = this.seconds + secondsToAdd;
            int extraMinutes = totalSeconds / 60;
            this.seconds = totalSeconds % 60;
            addMinutes(extraMinutes);
        }
    }

    private void subtractHours(int hoursToSubtract) {
        if (hoursToSubtract > 0) {
            int totalHours = this.hours - hoursToSubtract;
            this.hours = (totalHours % 24 + 24) % 24;
        }
    }

    private void subtractMinutes(int minutesToSubtract) {
        if (minutesToSubtract > 0) {
            int totalMinutes = this.minutes - minutesToSubtract;
            while (totalMinutes < 0) {
                totalMinutes += 60;
                subtractHours(1);
            }
            this.minutes = totalMinutes;
        }
    }
    private void subtractSeconds(int secondsToSubtract) {
        if (secondsToSubtract > 0) {
            int totalSeconds = this.seconds - secondsToSubtract;
            while (totalSeconds < 0) {
                totalSeconds += 60;
                subtractMinutes(1);
            }
            this.seconds = totalSeconds;
        }
    }


    private void add(Time time){
        addSeconds(time.getTime());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Time compare(Time time){
        long differenceSeconds = time.getTime()-getTime();
        if (differenceSeconds < 0) {
            differenceSeconds += 24 * 3600;
        }
        return new Time(differenceSeconds);
    }
    public Time compare2(Time time){
        long differenceSeconds = getTime()-time.getTime();
        if(differenceSeconds <0)
        {
            differenceSeconds +=24 * 36000;
        }
        return new Time(differenceSeconds);
    }

    public Time comparevolgensopage(Time time){
        int temphour = hours - time.getHours();
        int tempminutes = minutes - time.getMinutes();
        int tempseconds = seconds - time.getSeconds();
        if(tempseconds <0){
            tempseconds += 60;
            tempminutes -= 1;
        }
        if(tempminutes <0){
            tempminutes += 60;
            temphour -= 1;
        }
        if(temphour <0){
            temphour += 24;
        }

        return new Time(temphour,tempminutes,tempseconds);
    }

    public void printTime(){
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timeString);
    }
}