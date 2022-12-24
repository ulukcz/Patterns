package behavioral.Command;

public class Restaurant {
    public static void main(String[] args) {
        KebabMan kebabMan = new KebabMan();

        KebabWorker kebabWorker = new KebabWorker(new DoKebabResponsibility(kebabMan),
                new PrepareMeatResponsibility(kebabMan),
                new TakePaymentResponsibility(kebabMan),
                new GiveChangeResponsibility(kebabMan));

        kebabWorker.doKebabRecord();
        kebabWorker.giveChangeRecord();
        kebabWorker.prepareMeatRecord();
        kebabWorker.takePaymentRecord();
    }
}
