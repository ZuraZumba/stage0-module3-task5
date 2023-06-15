package lang.print.gaps.task5;

public class NumberDivider {
    void divide(double toBeDivided) {
        double result = toBeDivided/5;
        System.out.println(result);
    }
    public static void main(String args[]){
        NumberDivider divider = new NumberDivider();
        double number = 19;
        divider.divide(number);
    }
}
