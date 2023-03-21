package Seminar6.HW1.Viewer;


import Seminar6.HW1.Model.Notebook;
import Seminar6.HW1.Service.NotebookService;
import Seminar6.HW1.Service.NotebookServiceImpl;

public class NotebookView {
    private NotebookService notebookService = new NotebookServiceImpl();
    public void getNotebook(Notebook notebook){
        notebookService.getN(notebook);
    }
}
