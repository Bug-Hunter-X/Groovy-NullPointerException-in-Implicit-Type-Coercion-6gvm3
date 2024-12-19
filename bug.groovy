```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // This line is problematic
  }
  return a + b
}

println myMethod(5, null)
println myMethod(null, 5)
println myMethod(5, 5) 
```