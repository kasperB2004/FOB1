
public class Main {
    public static void main(String[] args) {
        Time time = new Time(9,15,20);

        Time time2 = new Time(1,5,10);

        Time difference = time.compare(time2);
        difference.printTime();
        difference = time.compare2(time2);
        difference.printTime();


        Time time3 = new Time(0,10,10);
        Time time4 = new Time(2,20,25);
        Time difference2 = time3.compare(time4);
        difference2.printTime();
        difference2 = time3.compare2(time4);
        difference2.printTime();


        difference = time.comparevolgensopage(time2);
        difference.printTime();
        difference2 = time3.comparevolgensopage(time4);
        difference2.printTime();

        Time time5 = new Time(5,0,0);
        Time time6 = new Time(1,30,10);
        Time difference3 = time5.comparevolgensopage(time6);
        difference3.printTime();

    }
}