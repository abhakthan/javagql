CREATE TABLE customer_order (
  id        INTEGER PRIMARY KEY,
  orderNo   VARCHAR(30),
  custNo    VARCHAR(30),
  totalCost INTEGER
);

CREATE TABLE order_items (
  id          INTEGER PRIMARY KEY,
  orderId     INTEGER,
  docNumber   VARCHAR(30),
  productName VARCHAR(30),
  productType VARCHAR(30),
  quantity    INTEGER,
  unitCost    INTEGER
);
