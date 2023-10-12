package com.hazrody.pixelWar.dao.entity;

import jakarta.persistence.*;

@Entity
public class Pixel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pixelId;

    private int xCoordinate;

    private int yCoordinate;

    private String color;

    public Pixel(int xCoordinate, int yCoordinate, String color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public Pixel() {

    }
}
