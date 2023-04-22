package org.example;

public class SimpleTask extends Task{
    private int id;
    private String title;

    public SimpleTask(int id, String title) {
        super(id);
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}
