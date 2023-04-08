package kissloryshy.jshop.tradingservice.service;

import kissloryshy.jshop.tradingservice.entity.Product;
import kissloryshy.jshop.tradingservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
