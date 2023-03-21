package Seminar6.CW1;

import Seminar6.CW1.Worker;

public class main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().setName("Vladimeir").salary(25000).build();
        System.out.println(worker);
    }
}
