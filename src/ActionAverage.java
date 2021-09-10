public class ActionAverage extends Observer {
    public ActionAverage(NumberSequence numberSequence) {
        super(numberSequence);
    }

    @Override
    public void doAction() {
        int sum = 0;
        int n = getNumberSequence().getNumberList().size();
        for (int number : getNumberSequence().getNumberList()) sum += number;
        System.out.println(Double.toString(sum * 1.0 / n * 1.0));
    }
}
