INSERT INTO customer_order (id, orderNo, custNo, totalCost) VALUES (1, '2000817', 'IDON001579', 25);
INSERT INTO customer_order (id, orderNo, custNo, totalCost) VALUES (2, '2000818', 'IDON001570', 25);
INSERT INTO customer_order (id, orderNo, custNo, totalCost) VALUES (3, '2500226', 'IDON755140', 100);

INSERT INTO order_items (id, orderId, docNumber, productName, productType, quantity, unitCost)
VALUES (1, 1, '7826212', 'Certified patent', 'Utility patent', 1, 25);
INSERT INTO order_items (id, orderId, docNumber, productName, productType, quantity, unitCost)
VALUES (2, 3, '2002002002', 'Certified patent assignment', 'Patent reel and frame', 1, 35);
INSERT INTO order_items (id, orderId, docNumber, productName, productType, quantity, unitCost)
VALUES (3, 3, '12114900', 'Certified patent app as filed', 'Patent application', 4, 25);
