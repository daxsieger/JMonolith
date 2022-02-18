package it.jmonolith.repository;

import it.jmonolith.domain.Stato;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Stato entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StatoRepository extends JpaRepository<Stato, Long> {}
