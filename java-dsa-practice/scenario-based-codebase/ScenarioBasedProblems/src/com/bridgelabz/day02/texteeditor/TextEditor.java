package com.bridgelabz.day02.texteeditor;

import java.util.Stack;

public class TextEditor {
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();
    private String text = "";

    public void insert(String value) {
        undoStack.push(new Action("INSERT", value));
        text += value;
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Action action = undoStack.pop();
            if (action.type.equals("INSERT")) {
                text = text.substring(0, text.length() - action.content.length());
            }
            redoStack.push(action);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Action action = redoStack.pop();
            if (action.type.equals("INSERT")) {
                text += action.content;
            }
            undoStack.push(action);
        }
    }

    public String getText() {
        return text;
    }
}
