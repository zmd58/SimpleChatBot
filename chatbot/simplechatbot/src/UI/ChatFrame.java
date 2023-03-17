package UI;

import Bot.ChatBot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame implements ChatUI {
    private JFrame frame = new JFrame();
    private JTextArea chatBox = new JTextArea();
    private JTextField chatText = new JTextField();
    private ChatBot bot = new ChatBot();

    @Override
    public void createFrame() {
        // frame properties
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Simple Chat Bot");

        // textarea properties
        chatBox.setSize(400, 300);
        chatBox.setLocation(45, 30);
        frame.add(chatBox);

        // textfield properties
        chatText.setSize(400, 50);
        chatText.setLocation(45, 380);
        chatText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = chatText.getText();
                chatBox.append("You: " + text + "\n");
                chatBox.append(bot.reply(chatText.getText()));
                chatText.setText("");
            }
        });
        frame.add(chatText);
    }
}
