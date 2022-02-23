package pl.wielgomasz.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class HotelDto
{
    private Integer id;
    private String name;
    private List<RoomsDto> rooms;

    public HotelDto(){

    }

    public HotelDto(Integer id, String name, List<RoomsDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomsDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomsDto> rooms) {
        this.rooms = rooms;
    }
}