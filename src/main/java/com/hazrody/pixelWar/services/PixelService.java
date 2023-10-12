package com.hazrody.pixelWar.services;

import com.hazrody.pixelWar.dao.repository.PixelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PixelService {

    @Autowired
    private PixelRepository pixelRepository;
}
