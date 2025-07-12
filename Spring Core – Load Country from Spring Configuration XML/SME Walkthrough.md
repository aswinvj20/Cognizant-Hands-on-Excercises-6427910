(1) Bean Configuration:
     The <bean> tag defines a bean with id="country" and class com.cognizant.springlearn.Country.Inside the bean, <property> tags are used to inject values into the code and name fields of the Country object.The value attribute supplies literal values directly (e.g., "IN" and "India"), which are set via setter methods.
     Spring uses these properties to configure the bean before it's made available in the container.Each setter invocation is logged if debug logging is enabled.
     
(2) ApplicationContext and ClassPathXmlApplicationContext:
    ApplicationContext is the central Spring container (IoC container) responsible for managing the full lifecycle of beans.ClassPathXmlApplicationContext is a specific implementation that loads bean definitions from an XML file located in the classpath (like src/main/resources/country.xml).When the context is created, 
    Spring parses the XML and eagerly instantiates singleton beans by default.It also resolves dependencies and manages lifecycle methods (constructor, setters, etc.).

(3) context.getBean():
    context.getBean("country") retrieves the bean instance with ID "country".If the bean is not yet initialized (e.g., for prototype scope), it instantiates the Country class.It invokes the no-argument constructor (logged: "Inside Country Constructor").Then it injects dependencies by calling setCode() and setName() (logged individually).
    Finally, the fully initialized bean is returned and can be used or logged (e.g., via toString()).
