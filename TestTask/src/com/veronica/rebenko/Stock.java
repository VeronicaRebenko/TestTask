package com.veronica.rebenko;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock {
    private String name;
    private String address;

    public Stock() {
    }

    public Stock(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}