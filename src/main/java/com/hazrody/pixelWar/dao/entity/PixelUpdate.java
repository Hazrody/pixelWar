package com.hazrody.pixelWar.dao.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pixel_updates")
public class PixelUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "update_id")
    private Long updateId;

    @ManyToOne
    @JoinColumn(name = "pixel_id", referencedColumnName = "pixel_id")
    private Pixel pixel;

    @Column(name = "new_color", nullable = false)
    private String newColor;

    @Column(name = "update_time", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime updateTimestamp;
}
