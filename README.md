# springboot-graphql
GraphQL is an alternative to REST for Web APIs

GraphQL is an API that was invented and open sourced by Facebook as a better replacement for REST. It can be understood as Querby language for APIs, which enables declarative data fetching by exposing a single endpoint and responds to queries. In REST, there is always a dedicated endpoint for each type of request and can't be customized.

In GraphQL, the client decides what data they need and that's the reason the client sends a query (payload) to the server and the server sends the data back as per the query request. There is where they get the name GraphQL

Let's look at an example to understand the technical details. In this example, we will build a simple book store application using graphQL.

Things to do:
1. Clone this repo: git clone https://github.com/hendisantika/springboot-graphql.git
2. Go to the folder: `cd springboot-graphql`
3. Run the app: `mvn clean spring-boot:run`

Start the SpringbootGraphqlApplication and then call the GraphQL endpoint as shown below using Postman:

In Postman, use the Post URL: http://localhost:8080/bookstore/getAllBooks  
and Body:  `query{ allBooks{bookId,bookName }}` 

You can add more fields in the body part and, accordingly, it will retrieve the data from server.

That's all for this talk. Enjoy the power of GraphQL.