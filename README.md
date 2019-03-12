# test-security

REST service with two endpoints secured by role-based Basic Authentication (In-memory)


#### To run

```
gradle bootRun
localhost:8080/anon  (user:user)
localhost:8080/api  (admin:admin)
```


[Source](https://www.developer.com/java/ent/what-is-spring-security.html)

The annotation *@EnableWebSecurity* enables Web security; otherwise, it remains disabled by default. 

Now, to configure the security, we can either implements the interface called **WebSecurityConfigurer** or extend the more convenient class called **WebSecurityConfigurerAdapter**. 

The advantage of extending the adapter class is that we can configure Web security by overriding only those parts that we are interested in; others can remain their default form. 

There are three variations of the configure method that we can override to configure and secure the application:

```
void configure( AuthenticationManagerBuilder auth): To configure user details services
void configure( HttpSecurity http): To configure how requests are secured by interceptors
void configure( WebSecurity web): To configure Spring Security's filter chain
```