package behavioral.Mediator;

public class Owner implements User{
    Chat chat;
    String name;

    public Owner(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Recieving message: " + message + ".");
    }
}
