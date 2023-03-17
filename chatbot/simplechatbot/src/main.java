import UI.ChatFrame;
import UI.ChatUI;

public class main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        // create a chat
        ChatUI chatBox = new ChatFrame();
        chatBox.createFrame();
    }
}
