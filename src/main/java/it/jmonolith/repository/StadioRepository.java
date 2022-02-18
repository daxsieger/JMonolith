package it.jmonolith.repository;

import it.jmonolith.domain.Stadio;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Stadio entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StadioRepository extends JpaRepository<Stadio, Long> {}
