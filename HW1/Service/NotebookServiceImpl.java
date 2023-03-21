package Seminar6.HW1.Service;

import Seminar6.HW1.Model.Notebook;

public class NotebookServiceImpl implements NotebookService {
    @Override
    public void getN(Notebook notebook) {
        System.out.println(notebook.toString());
    }
}
