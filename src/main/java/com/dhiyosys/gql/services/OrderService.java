package com.dhiyosys.gql.services;

import com.dhiyosys.gql.entities.Item;
import com.dhiyosys.gql.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Order> getOrders() {

        List<Order> orders = jdbcTemplate.query(
                "select id, orderNo, custNo, totalCost from customer_order",
                new RowMapper<Order>() {
                    @Override
                    public Order mapRow(ResultSet rs, int ii) throws SQLException {
                        Order o = new Order(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getInt(4)
                        );

                        return o;
                    }
                });

        return orders;
    }

    public List<Item> getItems() {

        List<Item> items = jdbcTemplate.query(
                "select id, docNumber, productName, productType, quantity, unitCost from order_items",
                new RowMapper<Item>() {
                    @Override
                    public Item mapRow(ResultSet rs, int ii) throws SQLException {
                        Item i = new Item(
                                rs.getInt(1),
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getInt(5),
                                rs.getInt(6)
                        );
                        return i;
                    }
                });

        return items;
    }

}
