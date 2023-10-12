package com.hazrody.pixelWar.dao.repository;

import com.hazrody.pixelWar.dao.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
