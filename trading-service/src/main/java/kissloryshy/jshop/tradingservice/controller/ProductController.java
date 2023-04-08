package kissloryshy.jshop.tradingservice.controller;

import kissloryshy.jshop.tradingservice.entity.MessageModel;
import kissloryshy.jshop.tradingservice.entity.Product;
import kissloryshy.jshop.tradingservice.service.ProductService;
import kissloryshy.jshop.tradingservice.service.RabbitmqProducerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final RabbitmqProducerService rabbitmqProducerService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping("/rabbit")
    public void sendMessage(@RequestBody MessageModel messageModel) {
        rabbitmqProducerService.sendMessage(messageModel.getMessage(), messageModel.getRoutingKey());
    }
}
