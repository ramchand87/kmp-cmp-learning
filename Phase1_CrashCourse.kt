/**
 * PHASE 1: Kotlin Crash Course for Java & Node/TS Developers
 * 
 * You can read through this file to see how Kotlin compares to Java and TypeScript.
 */

// =======================================================
// 1. VARIABLES: val vs var
// =======================================================

// Java: final String name = "Java";
// TS: const name = "TS";
val name = "Kotlin" // 'val' means immutable (read-only)

// Java: String mutableName = "Java"; mutableName = "Java 21";
// TS: let mutableName = "TS"; mutableName = "TS 5.0";
var mutableName = "Kotlin" 
// mutableName = "Kotlin 2.0" // 'var' is mutable


// =======================================================
// 2. NULL SAFETY
// =======================================================

// By default, variables CANNOT be null in Kotlin. 
// This prevents the dreaded NullPointerException (Java) or "TypeError: Cannot read properties of undefined" (JS/TS).

// var nonNullString: String = null // COMPILE ERROR!

// To allow nulls, you must append '?' to the type (similar to TS optional chaining or Java Optional).
var nullableString: String? = "I can be null"
// nullableString = null

// Safe calls:
// Java: if (nullableString != null) return nullableString.length() else return null;
// TS: nullableString?.length
val length = nullableString?.length // Returns null if nullableString is null

// Elvis Operator (Default value):
// Java: nullableString != null ? nullableString.length() : 0
// TS: nullableString?.length ?? 0
val lengthOrDefault = nullableString?.length ?: 0


// =======================================================
// 3. DATA CLASSES
// =======================================================

// Used to hold data/state. They automatically generate equals(), hashCode(), toString(), and copy().
// Java: You'd need a class, private fields, getters, setters, equals, hashCode, toString (or use Lombok @Data / Java 14 Records).
// TS: interface User { id: number; name: string }
data class User(val id: Int, val name: String)

fun testDataClass() {
    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob") // Easily create modified copies! user2 has id=1, name="Bob"
}


// =======================================================
// 4. EXTENSION FUNCTIONS
// =======================================================

// You can add new functions to existing classes (even ones you don't own, like String) WITHOUT inheriting from them.
// Java: You'd typically create a utility class like StringUtils.toSnakeCase("Hello")
// TS: You'd either write a utility function `toSnakeCase("Hello")` or hack the String.prototype (frowned upon).
fun String.shout(): String {
    return this.uppercase() + "!!!"
}

fun testExtensions() {
    val greeting = "hello".shout() // Result: "HELLO!!!"
}


// =======================================================
// 5. COROUTINES (Async Programming)
// =======================================================

// Kotlin's way of doing async, non-blocking code. 
// Java: Thread, ExecutorService, CompletableFuture, or Project Loom (Virtual Threads).
// TS: Promises and async/await.

// The 'suspend' keyword means this function can be paused and resumed.
// It is the Kotlin equivalent of the 'async' keyword in TS.
suspend fun fetchNetworkData(): String {
    // delay(1000) // Non-blocking delay (like `await new Promise(r => setTimeout(r, 1000))`)
    return "Data fetched!"
}

// In Kotlin, to call a `suspend` function, you must be inside a Coroutine scope (like how in TS you must be in an `async` function to use `await`).
// We will dive deeper into Coroutine scopes in Phase 2 when we set up our project!


// =======================================================
// PLAYGROUND
// =======================================================

fun main() {
    println("Welcome to Kotlin!")
    
    val myUser = User(id = 100, name = "Gram")
    println(myUser) // Data classes give us a nice toString() automatically: User(id=100, name=Gram)
    
    println("multiplatform".shout()) // Testing our extension function
}
