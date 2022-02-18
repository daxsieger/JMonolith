package it.jmonolith.repository;

import it.jmonolith.domain.Produttore;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Produttore entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProduttoreRepository extends JpaRepository<Produttore, Long> {}
