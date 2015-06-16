package jp.ac.it_college.std.s14011.pdp.composite;

/**
 * Created by s14011 on 15/06/11.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {
        printList(" ");
    }
    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
