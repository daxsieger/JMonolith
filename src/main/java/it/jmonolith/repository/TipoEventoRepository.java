package it.jmonolith.repository;

import it.jmonolith.domain.TipoEvento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TipoEvento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long> {}
