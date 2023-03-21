package Seminar6.HW1.Model;

public class NotebookBuilder {
    private static NotebookBuilder instance = null;
    Notebook obj;

    private NotebookBuilder() {

    }

    public static NotebookBuilder getInstance() {
        if (instance == null)
            instance = new NotebookBuilder();
        instance.obj = new Notebook();

        return instance;
    }

    public NotebookBuilder setBrand(String name) {
        obj.setBrand(name);
        return this;
    }



    public NotebookBuilder price(int price) {
        obj.setPrice(price);
        return this;
    }

    public NotebookBuilder ram(int ram) {
        obj.setRam(ram);
        return this;
    }
    public NotebookBuilder ssd(int ssd) {
        obj.setSsd(ssd);
        return this;
    }
    public NotebookBuilder os(String os) {
        obj.setOs(os);
        return this;
    }


    public Notebook build(){
        return obj;
    }

    @Override
    public String toString() {
        return "NotebookBuilder " +
                "obj=" + obj +
                '|';
    }
}
