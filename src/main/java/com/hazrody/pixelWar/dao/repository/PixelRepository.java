package com.hazrody.pixelWar.dao.repository;

import com.hazrody.pixelWar.dao.entity.Pixel;
import netscape.javascript.JSObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PixelRepository extends JpaRepository<Pixel, Long> {
    @Query(value = "SELECT * from pixel where x_coordinate = :x and y_coordinate = :y", nativeQuery = true)
    Optional<Pixel> findByxCoordinateAndYCoordinate(@Param("x") int x, @Param("y") int y);
    @Query(value = "SELECT * from pixel", nativeQuery = true)
    List<Object> findAllPixel();

}
