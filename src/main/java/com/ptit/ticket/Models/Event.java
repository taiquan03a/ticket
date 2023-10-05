package com.ptit.ticket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
    @Id
    private int event_id;
    private String name_event;
    private  String event_image;
    private String Mo_ta_ngan_gon;
    private String Mo_ta_chi_tiet;
    private String Noi_bat;
    private String Address;
    private int price;
    private int competitive_price;
    private String time;
    private String ticket_category;

    public Event(int event_id, String name_event, String event_image, String mo_ta_ngan_gon, String mo_ta_chi_tiet, String noi_bat, String address, int price, int competitive_price, String time, String ticket_category) {
        this.event_id = event_id;
        this.name_event = name_event;
        this.event_image = event_image;
        Mo_ta_ngan_gon = mo_ta_ngan_gon;
        Mo_ta_chi_tiet = mo_ta_chi_tiet;
        Noi_bat = noi_bat;
        Address = address;
        this.price = price;
        this.competitive_price = competitive_price;
        this.time = time;
        this.ticket_category = ticket_category;
    }
    public int event_id() {
        return event_id;
    }
    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }
    public String name_event() {
        return name_event;
    }
    public void setName_event(String name_event) {
        this.name_event = name_event;
    }
    public String event_image() {
        return event_image;
    }
    public void setEvent_image(String event_image) {
        this.event_image = event_image;
    }
    public String Mo_ta_ngan_gon() {
        return Mo_ta_ngan_gon;
    }
    public void setMo_ta_ngan_gon(String mo_ta_ngan_gon) {
        Mo_ta_ngan_gon = mo_ta_ngan_gon;
    }
    public String Mo_ta_chi_tiet() {
        return Mo_ta_chi_tiet;
    }
    public void setMo_ta_chi_tiet(String mo_ta_chi_tiet) {
        Mo_ta_chi_tiet = mo_ta_chi_tiet;
    }
    public String Noi_bat() {
        return Noi_bat;
    }
    public void setNoi_bat(String noi_bat) {
        Noi_bat = noi_bat;
    }
    public String Address() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public int price() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int competitive_price() {
        return competitive_price;
    }
    public void setCompetitive_price(int competitive_price) {
        this.competitive_price = competitive_price;
    }
    public String time() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String ticket_category() {
        return ticket_category;
    }
    public void setTicket_category(String ticket_category) {
        this.ticket_category = ticket_category;
    }
}
