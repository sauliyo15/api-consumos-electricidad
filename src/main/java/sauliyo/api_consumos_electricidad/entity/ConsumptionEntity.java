package sauliyo.api_consumos_electricidad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consumos")
public class ConsumptionEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "active_energy")
    private Double activeEnergy;

    @Column(name = "meter_date")
    private Date meterDate;

    @Column(name = "meter_id")
    private String meterId;

    @Column(name = "meter_hour")
    private String meterHour;
}
