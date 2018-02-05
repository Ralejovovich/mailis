/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailis;

/**
 *
 * @author Rauno Hietanen
 */
public class MailisData {
    private int user;
    private int date;
    private int id;
    private int km;
    private String purpose;

    public MailisData(int user, int date, int id, int km, String purpose) {
        this.user = user;
        this.date = date;
        this.id = id;
        this.km = km;
        this.purpose = purpose;
    }

    public int getUser() {
        return user;
    }

    public int getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public int getKm() {
        return km;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    //TODO setUser = "username logged in"

    @Override
    public String toString() {
        return "MailisData{" + "user=" + user + ", date=" + date + ", id=" + id + ", km=" + km + ", purpose=" + purpose + '}';
    }
    
    
    
}
