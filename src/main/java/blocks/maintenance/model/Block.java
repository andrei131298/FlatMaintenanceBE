package blocks.maintenance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "association_id")
    private Long associationId;

    @ManyToOne()
    @JoinColumn(name="association_id", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonIgnore
    private Association association;
}
