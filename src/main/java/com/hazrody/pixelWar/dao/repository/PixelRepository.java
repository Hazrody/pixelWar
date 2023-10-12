package com.hazrody.pixelWar.dao.repository;

import com.hazrody.pixelWar.dao.entity.Pixel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PixelRepository extends JpaRepository<Pixel, Long> {
}
