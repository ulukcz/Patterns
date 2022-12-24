package behavioral.Memento;

public class WorkersEditor {
    public static void main(String[] args) {
        KebabWorker kebabWorker;
        WorkerList workerList;

        kebabWorker = new KebabWorker("Abdul", "Prague 10");
        workerList = new WorkerList();

        System.out.println("Set salary in 1000 to new worker: ");
        kebabWorker.setSalary(1000);

        System.out.println(kebabWorker);

        System.out.println("Saving his data in worker list...");
        workerList.setSave(kebabWorker.save());

        System.out.println("Worker change his address and up his salary...");
        kebabWorker.setAddress("Tuchomerice");
        kebabWorker.setSalary(1200);

        System.out.println("The new data is...");
        System.out.println(kebabWorker);


        System.out.println("Worker back in his old address...");
        kebabWorker.load(workerList.getSave());


        System.out.println("Worker address after update...");
        System.out.println(kebabWorker);
    }
}
