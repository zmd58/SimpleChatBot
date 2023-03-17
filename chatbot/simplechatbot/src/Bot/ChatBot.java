package Bot;

public class ChatBot implements Bot {

    @Override
    public String reply(String message) {
        if (message.contains("hi")) {
            return "Bot: Greeting! \n";
        }
        if (message.contains("bye")) {
            return "Bot: See you next time! \n";
        }
        if (message.contains("how are you")) {
            return "Bot: I'm doing great and you? \n";
        }

        return "Bot: O.O ? ...?!? \n";
    }
}
