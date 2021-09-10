public class ActionSum extends Observer {
    public ActionSum(NumberSequence numberSequence) {
        super(numberSequence);
    }

    @Override
    public void doAction() {
        int sum = 0;
        for (int number : getNumberSequence().getNumberList()) sum += number;
        System.out.println("Sum is:");
        System.out.println(Integer.toString(sum));
    }
}
