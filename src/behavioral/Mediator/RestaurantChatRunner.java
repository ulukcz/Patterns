package behavioral.Mediator;

import java.util.HashMap;

public class RestaurantChatRunner {
    public static void main(String[] args) {
        SimpleWorkChat chat = new SimpleWorkChat();
        User owner = new Owner(chat, "Chairman");

        User kebabMan1 = new KebabWorker(chat, "Rauf");
        User kebabMan2 = new KebabWorker(chat, "Malik");

        chat.setOwner(owner);
        chat.addWorkerToChat(kebabMan1);
        chat.addWorkerToChat(kebabMan2);

        kebabMan1.sendMessage("Hello, today i'm feeling no good, Rauf #1");
        kebabMan2.sendMessage("Today we have less meat than we need, Malik #2");
        owner.sendMessage("In this week We'll work without weekends, Chairman");
        
    }
}
