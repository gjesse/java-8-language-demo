

# java8 language capabilities

inspired (stolen, really) from Venkat Subramaniam's talk at No Fluff, Just Stuff. Source material:  http://agiledeveloper.com/presentations/java_8_language_capabilities.zsubramaniam

examples run on 
java version "1.8.0-ea"
Java(TM) SE Runtime Environment (build 1.8.0-ea-b97)
Java HotSpot(TM) 64-Bit Server VM (build 25.0-b39, mixed mode)


# talking points

## external to internal iterators

Previously Java has only provided external iterators, but now we will also have internal iterators

external example: we're familiar with this

```python
elements = [1, 2, 3, 4, 5];
for i in elements:
    print i
```

internal example: not so much (unless you write a lot of ruby)

```ruby
beatles = ['George', John', 'Paul', 'Ringo']
beatles.each { |beatle| puts beatle }
```

In the internal example we pass a block of code (anonymous, lambda, etc) to the array to execute on each item. 

```java
// calls action.accept(item) for each item in the list 
numbers.forEach(Consumer<?> action);
```

## mapping operations - eliminating mutability

- simple demo of streams functionality, using stream, mapToInt and sum

Stream operations are divided into two categories: intermediate and terminal.
After a terminal operation is performed, the stream can no longer be used.

## default methods

How do we get this new functionality on collections? with default methods.

This means we can now have an implementation in an interface, which allows migrating an interface specification. Default implementations must have no state and no member values. Methods are prefixed with the keyword `default`.

Demonstrate default methods and multi-inheritance gotchas with vehicle demo.

also see http://blog.loxal.net/2013/05/java-8-default-interface.html 

## implementing strategy pattern with lambdas

Demo how using lambda expressions can simplify code using the asset totaling example.

Higher order functions and functional interfaces `@functional`

- `Consumer`: returns `void`, produces side effects
- `Predicate`: returns `Boolean` (filter)
- `Function`: returns `Object` (map)


## other resources

http://www.lambdafaq.org/
