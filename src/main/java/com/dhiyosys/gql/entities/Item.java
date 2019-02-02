package com.dhiyosys.gql.entities;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Item {

    @NonNull
    private int id;

    @NonNull
    private int orderId;

    @NonNull
    private String docNumber;

    @NonNull
    private String productName;

    @NonNull
    private String productType;

    @NonNull
    private int quantity;

    @NonNull
    private int unitCost;

}
