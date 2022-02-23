package pl.wielgomasz.hotelsapplicationtest.remote.rest.dto.response;

public class PersonDto {
    private String name;
    private Integer phone;
    private String adress;
    private Integer floor;

    public PersonDto(){

    }

    public PersonDto(String name, int phone, String adress, int floor) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
