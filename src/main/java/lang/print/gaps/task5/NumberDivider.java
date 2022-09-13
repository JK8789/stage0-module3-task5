package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        float division = toBeDivided / 5f;
        System.out.println(division);
    }

    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();
        numberDivider.divide(14);
    }
}
