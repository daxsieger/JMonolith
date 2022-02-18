package it.jmonolith.repository;

import it.jmonolith.domain.Transizioni;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Transizioni entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransizioniRepository extends JpaRepository<Transizioni, Long> {}
