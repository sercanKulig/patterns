package com.example.patterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

    private String text = "";
    private Queue<Command> queue = new LinkedList<Command>();

    private void executeAction(Command command){
        command.action();
        queue.add(command);
    }

    private void undo() {
        Command command = queue.poll();
        if(command!=null) {
            command.undo();
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("1234");
        ClearTextCommand command = new ClearTextCommand(editor);
        editor.executeAction(command);
        System.out.println("Text is: " + editor.getText());
        editor.undo();
        System.out.println("Text is: " + editor.getText());
    }
}
