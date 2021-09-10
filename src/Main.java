public class Main {

    public static void main(String[] args){
        NumberSequence numberSequence = new NumberSequence(new KeyboardSource());
        ActionSum actionSum= new ActionSum(numberSequence);
        ActionMedian actionMedian = new ActionMedian(numberSequence);
        ActionDates actionDates = new ActionDates(numberSequence, "dates.txt");
        try {
            numberSequence.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
