package model;

import java.util.ArrayList;
import java.util.List;

public class RoomManage {

    private static List<RoomEntity> room = new ArrayList<>();;

    public RoomManage() {
        initialize();
    }

    public void initialize() {
        //It will add same room every time that we refresh the page. because we init at its constructor.
        room.add(new RoomEntity("A101", "Free", "$100"));
        room.add(new RoomEntity("A102", "Full", "$200"));
        room.add(new RoomEntity("A103", "Free", "$300"));
    }

    public List<RoomEntity> ListRoom() {
        return room;
    }

    public void AddRoom(String name, String access, String price) {
        room.add(new RoomEntity(name, access, price));
    }

    public void DelRoom(int index) {
        room.remove(index);
    }
}
