package edu.dio.collections.map.event;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Appointment {
    private Map<LocalDate, Event> events;
    
    public Appointment() {
        this.events = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String Attraction) {
        Event event = new Event(name, Attraction);

        events.put(date, event);
    }

    public void showAppointment() {
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(events);
        
        System.out.println(eventsTreeMap);
    }

    public void nextEvent() {
        LocalDate now = LocalDate.now();
        Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(events);

        for (Map.Entry<LocalDate, Event> entry : eventsTreeMap.entrySet()) {
            if(entry.getKey().isEqual(now) || entry.getKey().isAfter(now)) {
                System.out.println("Next envent: " + entry.getValue() + " - Date: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Appointment appointment = new Appointment();

        appointment.addEvent(LocalDate.of(2024, Month.MAY, 2), "Event 1", "Attraction 1");
        appointment.addEvent(LocalDate.of(2024, Month.MAY, 1), "Event 2", "Attraction 2");
        appointment.addEvent(LocalDate.of(2024, Month.MAY, 3), "Event 3", "Attraction 3");

        appointment.showAppointment();

        appointment.nextEvent();
    }
}
