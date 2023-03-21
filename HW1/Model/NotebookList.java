package Seminar6.HW1.Model;

import Seminar6.HW1.Model.Notebook;

import java.util.ArrayList;
import java.util.List;

public class NotebookList {
    private List<Notebook> notebookList = new ArrayList<>();
    public void initNotebook (List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    public Notebook getNotebooklist(String brand) {
        for (Notebook notebook : notebookList) {
            if (notebook.getBrand().equalsIgnoreCase(brand)) return notebook;
        }
        return null;
    }
}
