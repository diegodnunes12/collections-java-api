package edu.dio.collections.map.event;

public class Event {
    private String name;
    private String attraction;
    
    public Event(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Event [name=" + name + ", attraction=" + attraction + "]";
    }
}
