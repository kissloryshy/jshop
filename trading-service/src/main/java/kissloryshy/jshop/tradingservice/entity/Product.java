package kissloryshy.jshop.tradingservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @jakarta.validation.constraints.Size(max = 128)
    @jakarta.validation.constraints.NotNull
    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @jakarta.validation.constraints.NotNull
    @Column(name = "price", nullable = false)
    private Integer price;

    @OneToMany(mappedBy = "product")
    private Set<PurchaseItem> purchaseItems = new LinkedHashSet<>();

}