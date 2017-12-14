# Spring_Reference

In Spring if one Bean depends on another Bean class for some business logic,
then this type of dependency is called object dependency.In case of Object dependency in Spring, 
the spring IOC container is responsible for creating that required object and injecting into the dependent classes.


# In Spring we need to use <ref> element to inform spring container about the object dependency.


In Spring, beans can "access" to each other by specify the bean references in the same or different bean configuration file.In spring we can write multiple configuration xml file.Our associated bean may be in same xml or in other xml file.


Beans defined in different XML files

If you are trying to access bean from different XML file, then we need to use ‘ref‘ tag with ‘bean‘ attribute.


Syntax :

<ref bean="someBean"/>
