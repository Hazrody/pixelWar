package com.hazrody.pixelWar.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.hazrody.pixelWar.dao.entity.Pixel;
import com.hazrody.pixelWar.dao.repository.PixelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PixelService {

    @Autowired
    private PixelRepository pixelRepository;

    public Optional<Pixel> getPixelByXY(int x, int y) {
        return pixelRepository.findByxCoordinateAndYCoordinate(x, y);
    }

    public void savePixel(Pixel pixel) {
        pixelRepository.save(pixel);
    }

    public List<Object> getAllPixel() {
        return pixelRepository.findAllPixel();
    }
}
