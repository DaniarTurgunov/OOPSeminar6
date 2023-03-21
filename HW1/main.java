package Seminar6.HW1;

import Seminar6.HW1.Model.NotebookList;
import Seminar6.HW1.Viewer.NotebookView;
import Seminar6.HW1.Model.Notebook;
import Seminar6.HW1.Model.NotebookBuilder;


import static java.util.Arrays.*;

public class main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Notebook notebook1 = new Notebook();
        Notebook notebook2 = new Notebook();
        Notebook notebook3 = new Notebook();
        notebook = NotebookBuilder.getInstance().setBrand("HP").price(45900).ram(8).ssd(512).os("Windows").build();
        notebook1 = NotebookBuilder.getInstance().setBrand("Asus").price(65800).ram(16).ssd(1000).os("Linux").build();
        notebook2= NotebookBuilder.getInstance().setBrand("Apple").price(85800).ram(32).ssd(800).os("MacOs").build();
        notebook3 = NotebookBuilder.getInstance().setBrand("Lenovo").price(645800).ram(16).ssd(560).os("Windows").build();
        NotebookView notebookView = new NotebookView();
        NotebookList notebookList = new NotebookList();
        notebookList.initNotebook(asList(notebook,notebook1,notebook2,notebook3));
        notebookView.getNotebook(notebookList.getNotebooklist("Asus"));
    }
}
