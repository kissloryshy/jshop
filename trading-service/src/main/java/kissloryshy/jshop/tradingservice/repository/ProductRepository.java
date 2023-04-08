package kissloryshy.jshop.tradingservice.repository;

import kissloryshy.jshop.tradingservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
