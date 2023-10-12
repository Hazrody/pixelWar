package com.hazrody.pixelWar.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pixels")
public class Pixel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pixel_id")
    private Long pixelId;

    @Column(name = "x_coordinate", nullable = false)
    private int xCoordinate;

    @Column(name = "y_coordinate", nullable = false)
    private int yCoordinate;

    @Column(name = "color", nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users user;

}
