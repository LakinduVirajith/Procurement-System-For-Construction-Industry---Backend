package com.procurement.system.construction.industry.repository;

import com.procurement.system.construction.industry.entity.AuthToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthTokenRepository extends JpaRepository<AuthToken, Long> {

    Optional<AuthToken> findByToken(String token);
    Optional<AuthToken> findByUserUserId(Long userId);
}
