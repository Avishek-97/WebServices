/*As we know to test our rest API we have to use POSTMAN/SWAGGER etc..... tools (i'm using POSTMAN here)
 * we have to pass request body as shown as below and the api will give the response in below format
 * request in JSON format
 * =========================
 * {
    "name":"mobile",
    "cardType":"HDFC",
    "price":51000
}

*response in JSON format
*==========================
*{
    "name": "mobile",
    "cardType": "HDFC",
    "discount": 10,
    "price": 51000
}
*/

package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDroolsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDroolsDemoApplication.class, args);
	}

}
