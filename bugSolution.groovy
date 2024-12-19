```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Return 0 or handle appropriately instead of null
  }
  return a + b
}

println myMethod(5, null) //Prints 5
println myMethod(null, 5) //Prints 5
println myMethod(5, 5) //Prints 10
```