import java.util.ArrayList;
import java.util.List;

public class NumberSequence {
    private INumberSource numberSource;
    private List<Integer> numberList;
    private List<Observer> observerList;

    public NumberSequence(INumberSource numberSource) {
        this.numberSource = numberSource;
        numberList = new ArrayList<>();
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void updateSource(INumberSource numberSource) {
        this.numberSource = numberSource;
    }

    private void notifyObservers() {
        for (Observer observer : observerList) {
            observer.doAction();
        }
    }

    public void start() throws InterruptedException {
        int nextNumber = numberSource.loadNumber();
        while(nextNumber != -1){
            numberList.add(nextNumber);
            notifyObservers();
            Thread.sleep(1000);
            nextNumber = numberSource.loadNumber();
        }
    }

    public List<Integer> getNumberList(){
        return  numberList;
    }
}
