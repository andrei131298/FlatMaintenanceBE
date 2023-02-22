package blocks.maintenance.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "players")
public class Association {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "association_name")
    private String associationName;

    @Column(name = "bank_account")
    private String bankAccount;

    @OneToMany(targetEntity= Block.class, mappedBy="association",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonIgnore
    private List<Block> blocks = new ArrayList<>();
}
