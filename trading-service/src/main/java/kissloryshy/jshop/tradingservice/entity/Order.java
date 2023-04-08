package kissloryshy.jshop.tradingservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @jakarta.validation.constraints.Size(max = 128)
    @Column(name = "client", length = 128)
    private String client;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "\"time\"")
    private LocalTime time;

    @jakarta.validation.constraints.Size(max = 128)
    @Column(name = "address", length = 128)
    private String address;

}