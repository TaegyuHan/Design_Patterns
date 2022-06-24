package ObserverPattern2;

import ObserverPattern2.editor.Editor;
import ObserverPattern2.listeners.EmailNotificationListener;
import ObserverPattern2.listeners.LogOpenListener;

public class Demo {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("text.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
