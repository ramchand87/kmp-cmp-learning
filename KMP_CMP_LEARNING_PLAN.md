# KMP & CMP for Java Developers

Welcome to the world of Multiplatform development! Since you come from a Java background, transitioning to Kotlin and its multiplatform capabilities is one of the smoothest leaps you can make.

## What are KMP and CMP?

### 1. KMP (Kotlin Multiplatform)
* **What it is:** A technology built by JetBrains (the creators of IntelliJ and Kotlin) that allows you to write code once and run it on multiple platforms (Android, iOS, Desktop, Web).
* **The Core Philosophy:** "Share business logic, keep UI native." Traditionally, KMP is used to write your networking, database, and domain logic in a shared module. You then write the Android UI in Jetpack Compose and the iOS UI in SwiftUI.
* **Java Dev Perspective:** Imagine writing a core `.jar` file containing your business logic. KMP does this, but it compiles the Kotlin code into JVM bytecode for Android and uses Kotlin/Native (via LLVM) to compile into native ARM binaries for iOS. No Java Virtual Machine is required on iOS!

### 2. CMP (Compose Multiplatform)
* **What it is:** A declarative UI framework built *on top* of KMP. It brings Jetpack Compose (Android's modern UI toolkit) to iOS, Web, and Desktop.
* **The Core Philosophy:** "Share everything (Business Logic + UI)."
* **Java Dev Perspective:** If you remember JavaFX or Swing, those are *imperative* UI frameworks (you find a button, then call `button.setText()`). CMP is *declarative*. You declare what the UI should look like based on the current state, and the framework handles updating the screen when the state changes. 

## Key Concepts for Java Developers

* **Kotlin vs. Java:** Kotlin runs on the JVM and is 100% interoperable with Java. It removes boilerplate (no semicolons, introduces `data classes` instead of POJOs with getters/setters, and has built-in null-safety).
* **Coroutines vs. Threads:** Instead of Java `Thread` or `ExecutorService`, Kotlin uses **Coroutines** for asynchronous tasks (like network calls). They are extremely lightweight threads that can suspend execution without blocking the underlying OS thread.
* **Expect/Actual:** This is KMP's way of handling platform-specific code. You declare an `expect` function in the shared module (like a Java interface), and provide the `actual` implementation in the Android and iOS specific modules.

---

## 🚀 Learning Plan (Executed in this Workspace)

We will use this workspace (`c:\Users\gramc\OneDrive\Documents\kmp`) to step through the following phases. Whenever you are ready, just tell me: **"Let's start Phase 1!"**

### Phase 1: Kotlin Crash Course (For the Java Mind)
* Setting up a scratch file.
* Kotlin syntax, Null Safety (`?`), and `val` vs `var`.
* Data classes and Extension functions.
* Introduction to Coroutines.

### Phase 2: KMP Project Setup & Structure
* We will use a tool to generate a barebones KMP/CMP project in this workspace.
* Deep dive into the project structure:
  * `commonMain` (Shared code)
  * `androidMain` (Android specific)
  * `iosMain` (iOS specific)
* Understanding `build.gradle.kts` (Kotlin DSL for Gradle).

### Phase 3: Compose Multiplatform (The UI)
* Introduction to `@Composable` functions.
* Building basic layouts (Rows, Columns, Boxes).
* Understanding State (`remember`, `MutableState`) and Recomposition.

### Phase 4: Shared Business Logic & Networking
* Adding **Ktor** (A multiplatform HTTP client, think of it as OkHttp/Retrofit for KMP).
* Adding **Kotlinx.Serialization** (Think of it as Jackson/Gson).
* Making a network request from `commonMain`.

### Phase 5: Building a Mini-App
* We will combine everything to build a simple "Fact of the Day" or "Weather" app.
* Fetch data via Ktor, store it in state, and display it using Compose Multiplatform on an Android emulator (and Desktop/iOS if your setup allows).

---
*Whenever you are ready to begin, just let me know!*
