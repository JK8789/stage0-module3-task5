package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float seconds = 60 * minutes;
        System.out.println(seconds);
    }

    public static void main(String[] args) {
        TimeConvertor timeConvertor = new TimeConvertor();
        timeConvertor.convert(10);
    }
}
