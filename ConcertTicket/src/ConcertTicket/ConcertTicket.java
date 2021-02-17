package ConcertTicket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 * This it the class ConcertTicket that stores the name of a concert, the price,
 * and the date.
 *
 * @author clatulip, mapq
 * @version Spring 2019
 */
public class ConcertTicket implements Comparable {

    private String name;
    private Date date;
    private double price;

    /**
     * Constructor with default value for all the fields.
     *
     * @param name of band
     * @param date of the concert
     * @param price of the ticket
     */
    public ConcertTicket(String name, Date date, double price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    /**
     * Default constructor for this class.
     */
    public ConcertTicket() {
        name = "";
        date = new Date();
        price = 0.0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name =name;
    }

    /**
     * Getter returning the date of the concert.
     *
     * @return the date of the concert
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter storing the date of the concert.
     *
     * @param date the date of the concert
     */
    public void setDate(Date date) {
        this.date=date;
    }

    /**
     * Getter returning the price for the ticket to the concert.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter to set the price of the ticket of the concert.
     *
     * @param price the price of the ticket
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method from Comparable that compares two concert ticket objects by
     * looking at ticket price.
     *
     * @param o
     * @return -1,0,1
     */
    @Override
    public int compareTo(Object o) {
        ConcertTicket ct = (ConcertTicket) o;
        
        int result = 0;
        // compare by price
        if (this.price < ct.price) {
            result = -1;
        }
        if (this.price > ct.price) {
            result = 1;
        }
        return result;
    }

    /**
     * Returns a string version of this object.
     *
     * @return string representation of this object
     */
    @Override
    public String toString() {
        return "ConcertTicket{" + "name=" + name + ", date="
                + date + ", price=" + price + '}';
    }

}
