# springboot-graphql
GraphQL is an alternative to REST for Web APIs

Things to do:
1. Clone this repo: git clone https://github.com/hendisantika/springboot-graphql.git
2. Go to the folder: `cd springboot-graphql`
3. Run the app: `mvn clean spring-boot:run`

Start the SpringbootGraphqlApplication and then call the GraphQL endpoint as shown below using Postman:

In Postman, use the Post URL: http://localhost:8080/bookstore/getAllBooks  
and Body:  `query{ allBooks{bookId,bookName }}` 

You can add more fields in the body part and, accordingly, it will retrieve the data from server.

That's all for this talk. Enjoy the power of GraphQL.