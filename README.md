# OAuth-Server-With-Resource-Server-Implementation-01
This project shows Authorization server and Resource server simple implementation

## Steps

### 1. Call Auth-token URI of Auth server to get the Access token.

    
    GET REQUEST : /oauth/token

    Authorization: username:mobile password:pin

    Body(FormUrlEncoded): grant-type: password, username:kiran, password:kiran123
    

It will return bearer access token on validation.

### 2.Then call resource(fetchAll- profile) on resource server(profile-service) with header 

    Authorization: bearer <Access-Token>

You should be able to access the resource.
