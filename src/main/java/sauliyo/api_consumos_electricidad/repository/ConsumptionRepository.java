package sauliyo.api_consumos_electricidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sauliyo.api_consumos_electricidad.entity.ConsumptionEntity;

public interface ConsumptionRepository extends JpaRepository<ConsumptionEntity, Integer> {
}
