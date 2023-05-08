package memento.zadanie;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;

    void addMemento(OperatingSystemMemento operatingSystemMemento) {
        this.operatingSystemMemento = operatingSystemMemento;
    }

    OperatingSystemMemento getMemento() {
        return operatingSystemMemento;

    }
}
