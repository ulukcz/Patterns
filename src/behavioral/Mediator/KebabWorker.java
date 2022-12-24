package behavioral.Mediator;

public class KebabWorker implements User {
    Chat chat;
    String name;

    public KebabWorker(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }


    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }
}
