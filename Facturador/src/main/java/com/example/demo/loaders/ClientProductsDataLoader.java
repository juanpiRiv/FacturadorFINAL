package com.example.demo.loaders;

import com.example.demo.entities.Client;
import com.example.demo.entities.Product;
import com.example.demo.services.ClientService;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class ClientProductsDataLoader implements CommandLineRunner {

    @Autowired
    private final ClientService clientService;

    @Autowired
    private final ProductService productService;

    public ClientProductsDataLoader(ClientService clientService, ProductService productService) {
        this.clientService = clientService;
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Creating clients using HashMap
        Map<String, Client> clients = new HashMap<>();
        clients.put("client1",
                new Client(UUID.fromString("04b6905f-36b2-4931-b695-2942b14631ea"), "12345678", "John", "Doe",
                        "john.doe@example.com", "123-456-7890"));
        clients.put("client2",
                new Client(UUID.randomUUID(), "87654321", "Jane", "Smith", "jane.smith@example.com", "098-765-4321"));
        clients.put("client3",
                new Client(UUID.randomUUID(), "11223344", "Alice", "Johnson", "alice.j@example.com", "321-654-9870"));
        clients.put("client4",
                new Client(UUID.randomUUID(), "44332211", "Bob", "Brown", "bob.brown@example.com", "654-321-0987"));

        // Save each client to the database
        for (Map.Entry<String, Client> entry : clients.entrySet()) {
            clientService.save(entry.getValue());
        }

        // Creating products using HashMap
        Map<String, Product> products = new HashMap<>();
        products.put("product1", new Product("Laptop", "High-performance laptop for work and gaming", 1200.00, 10));
        products.put("product2", new Product("Smartphone", "Latest model smartphone with advanced features", 800.00, 20));
        products.put("product3", new Product("Headphones", "Noise-cancelling wireless headphones", 150.00, 30));
        products.put("product4", new Product("Keyboard", "Mechanical keyboard with RGB lighting", 70.00, 15));
        products.put("product5", new Product("Monitor", "27-inch 4K Ultra HD monitor", 300.00, 8));

        // Save each product to the database
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            productService.save(entry.getValue());
        }
    }
}