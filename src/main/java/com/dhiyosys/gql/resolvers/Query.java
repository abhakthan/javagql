package com.dhiyosys.gql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dhiyosys.gql.entities.Item;
import com.dhiyosys.gql.entities.Order;
import com.dhiyosys.gql.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    OrderService orderService;

    public List<Order> orders() {
        return orderService.getOrders();
    }

    public List<Item> items() {
        return orderService.getItems();
    }
}
