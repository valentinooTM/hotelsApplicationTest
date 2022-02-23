package pl.wielgomasz.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomReservationDto> reservations;
    private PersonReservationDto person;

    public ReservationDto(){

    }

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomReservationDto> reservations, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.reservations = reservations;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<RoomReservationDto> reservations) {
        this.reservations = reservations;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
