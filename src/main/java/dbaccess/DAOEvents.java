package dbaccess;

import entities.Event;

import java.util.List;

public interface DAOEvents {

    void newEvent ();
    void modifyEvent();
    void removeEvent();
    Event getEvent();
    List<Event> getAllEvents();

}
