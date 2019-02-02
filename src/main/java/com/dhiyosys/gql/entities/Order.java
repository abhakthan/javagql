package com.dhiyosys.gql.entities;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Order {

    @NonNull
    private int id;

    @NonNull
    private String orderNo;

    @NonNull
    private String custNo;

    @NonNull
    private int totalCost;

}
