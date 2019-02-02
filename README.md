# javagql
Java Spring integration with GraphQL

# Run

> mvn clean install

> mvn spring-boot:run

> http://localhost:8080/graphiql

{
  orders {
    id
    orderNo
    custNo
    totalCost
  }
  items {
    id
    docNumber
    productName
    productType
    quantity
    unitCost
  }
}
