package sspu.ctq.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Transportation implements Serializable {

    private String bus;
    private String underground;
    private String airplane;
    private String train;
    private String foot;
    private String boat;

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getUnderground() {
        return underground;
    }

    public void setUnderground(String underground) {
        this.underground = underground;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public Transportation(String bus, String underground, String airplane, String train, String foot, String boat) {
        this.bus = bus;
        this.underground = underground;
        this.airplane = airplane;
        this.train = train;
        this.foot = foot;
        this.boat = boat;
    }
}
