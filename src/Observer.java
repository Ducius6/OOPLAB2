public abstract class Observer {
    private NumberSequence numberSequence;

    public Observer(NumberSequence numberSequence) {
        this.numberSequence = numberSequence;
        numberSequence.addObserver(this);
    }

    public NumberSequence getNumberSequence() {
        return numberSequence;
    }

    public abstract void doAction();
}
