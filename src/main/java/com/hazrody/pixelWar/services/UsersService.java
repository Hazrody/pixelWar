package com.hazrody.pixelWar.services;

import com.hazrody.pixelWar.dao.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    
}
