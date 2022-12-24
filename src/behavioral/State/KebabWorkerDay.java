package behavioral.State;

public class KebabWorkerDay {

    public static void main(String[] args) {
        Requirments requirments = new PrepareMeat();
        KebabWorker kebabWorker = new KebabWorker();

        kebabWorker.setRequirments(requirments);

        for (int i = 0; i < 20; i++) {
            kebabWorker.action();
            kebabWorker.changeRequirments();
        }
    }
}
