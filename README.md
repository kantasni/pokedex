## Usage
```http request
create pokemon:
localhost:8080/uncaught
 {
        "name": "Blaziken",
        "type":"Fire",
        "caught": true,
        "moves": [
            {
                "name":"Blaze Kick",
                "type" : "Fire"
            },
             {
                "name":"High Kick",
                "type" : "Fighting"
            }
        ]
    }
get all uncaught pokemons
localhost:8080/uncaught
```