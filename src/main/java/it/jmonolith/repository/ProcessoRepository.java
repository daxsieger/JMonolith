package it.jmonolith.repository;

import it.jmonolith.domain.Processo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Processo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {}
