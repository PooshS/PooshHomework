package oop.week2.homework.project_2_2_service_centre.model;


import java.io.Serializable;
import java.util.Date;

public class WorkLog implements Serializable {

    private Date from;

    private Date to;
    private Technics technics;
    private Repairer repairer;
    private Client client;

    public WorkLog() {
    }

    public WorkLog(Date from, Date to, Technics technics, Repairer repairer, Client client) {
        this.from = from;
        this.to = to;
        this.technics = technics;
        this.repairer = repairer;
        this.client = client;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Technics getTechnics() {
        return technics;
    }

    public void setTechnics(Technics technics) {
        this.technics = technics;
    }

    public Repairer getRepairer() {
        return repairer;
    }

    public void setRepairer(Repairer repairer) {
        this.repairer = repairer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
