public class ActionMedian extends Observer {
    public ActionMedian(NumberSequence numberSequence) {
        super(numberSequence);
    }

    @Override
    public void doAction() {
        int n = getNumberSequence().getNumberList().size();
        if (n == 1) {
            System.out.println("Median is:");
            System.out.println(getNumberSequence().getNumberList().get(0));
            return;
        }
        if (n % 2 == 0) {
            int first = getNumberSequence().getNumberList().get((n / 2) - 1);
            int second = getNumberSequence().getNumberList().get((n / 2));
            System.out.println((double) (first + second) / 2.0);
        } else {
            System.out.println("Median is:");
            System.out.println(getNumberSequence().getNumberList().get((n / 2)));
        }
    }
}
