### Tips
* Should not import everything in a package like( java.math.*), only import what is needed.
* implement equals & hashcode method of Object class in ur class if u want to compare the objects of that class.
* A class can only have two access modifiers public or default.
* Declaring a variable as public static final means it's a constant that u can use anywhere in the program with the class name.

###  Access modifiers
* They are the keyword used to enforce encapsulation.
* They help u decide what kind of things in ur class are accessible to ppl who write code outside ur class.
#### Types
#### public
* Classes, methods, or data members that are declared as public are accessible from everywhere in the program(accessible from different packages as well).
#### default(absence of any specific access modifier)
* The default access modifier is also called package-private, which means that all members are visible within the same package but aren't accessible from other packages.
#### protected
* The protected modifier specifies that the member can only be accessed within its own package (as with package-private/Default) and, in addition, by a subclass of its class in another package.
* A class cannot have this access modifier.
#### private
* Variables that are declared private cannot be accessed outside the class, unless public getter/setter methods are present in the class.
* Methods that are declared private are restricted to be access in the defining class only and are not inherited in their child class due to which are not eligible for overridden. However, we can define a method with the same name in the child class.
* A class cannot have this access modifier.

### Thought process on how to property encapsulate ur class/Thought process when deciding access modifier
* When u create ur class u need to decide what kind of things u want other classes to access.
* You need to think about what are the things my subclasses need to be able to access? You need to make them protected.
* What are the things every class need to access? You need to make them public.
* All other things should be private.
* You shouldn't make any of ur variables public, unless those are final variables which are not going to change in value, all other variables should remain private. You should allow access to these private variables through methods of various access levels.

### Non-Access modifiers
#### Types
#### final
* Final basically means cannot be overridden.
* If a class is declared as final, then it cannot be inherited(coz inheriting is basically overriding a class).
* Why do u want to make a class final? Whenever u think u don't want to allow extension of ur specific class, u don't want somebody to extend the functionality in ur class & modify the behaviour of ur class. One of the imp. things to realise is that whenever somebody extends ur class, they have the privilege of modifying some code of ur methods & that might not be something u want to allow in certain situations.
* If methods are declared as final they are inherited but cannot be overridden, the subclass can use this method.
* Why do u want to make a method final? If u want none of the subclasses to change the logic of a particular method.
* If a variable is declared as final, its value cannot be changed(i.e. value cannot be overridden).
* If a function argument is declared as final, its value cannot be changed later on inside the function(i.e. value cannot be overridden).
* Typically, final is recommended on all variables & arguments. Typically, u should assign values to variables & arguments only once, you should not keep modifying their values. This is called immutable programming & it's recommended because it leads to code which is easily understandable.
#### static
* The static keyword in Java is mainly used for memory management.
* Static keywords can be used with variables, methods, blocks, and nested classes.
* Static variables & methods belong to a class and not a particular instance. As a result, class initialization will initialize static variables.
* All the instances of a class share the class's static variables & methods.
* We can call static methods using the name of the class directly.
* Why we need static variables? Static variables are used to keep track of information that relates logically to an entire class, as opposed to information that varies from instance to instance.
* Why do we need static method? If a methods don't require any object state or If a method is working only on static variables or static methods.
* You cannot access instance(non-static) variable or instance method inside a static method.

### Nested class
* We use nested class to logically group classes and interfaces in one place to be more readable and maintainable.
#### Types
#### static nested class
* A static class that is declared inside a class.
* It can be accessed by outer class name.
* It can access only static members of the outer class, including private.
* Can exit without instance of outer class since it is static.
#### non-static nested class(Inner class)
* A non-static class that is declared inside a class.
* It can access all members of the outer class, including private.
* Cannot exit without instance of outer class since it is non-static.

### Anonymous class
* They are the class without any name & for which only a single object is created.
* Anonymous class can be useful when making an instance of an object with certain “extras” such as overriding methods of a class or interface, without having to actually subclass a class.
* They cannot have static members since Anonymous classes don't have a name to access them.
* They cannot have constructor since Anonymous classes don't have a name.
* Anonymous class can extend a one class or can implement one interface but not both at a time.
* Be careful when using anonymous classes coz they get hidden in code & ppl might not know if this similar logic is being performed somewhere else. So use it only in scenario where ur sure that this kind of logic will not be reused anywhere else.

### Enum
* Enumeration(enum) serve the purpose of representing a group of named constants in a programming language
* Eg: planets, days of the week, colors, directions, etc.
* Enum can contain variables, constructors & methods as well.
* Whenever u think there is a specific list of values & u want to stick to those values, in those cases use enums.