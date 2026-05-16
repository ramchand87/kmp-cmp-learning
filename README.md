# kmp-cmp-learning
Learning Kotlin Multiplatform (KMP) and Compose Multiplatform (CMP) for mobile development.

## 🗂️ Project Structure & Index

This repository serves as a step-by-step learning workspace for developers transitioning from Java or Node/TypeScript to KMP/CMP.

* **`KMP_CMP_LEARNING_PLAN.md`**: The master curriculum. It explains what KMP and CMP are, compares them to Java/Node paradigms, and outlines the 5 phases of our learning journey.
* **`Phase1_CrashCourse.kt`**: A standalone Kotlin script acting as a cheat sheet. It covers variable declarations, null safety, data classes, extension functions, and coroutines.
* **`KMP/`**: Directory reserved for pure Kotlin Multiplatform logic (sharing business logic without UI). *(Setup in progress)*
* **`CMP/`**: Directory reserved for Compose Multiplatform (sharing both business logic AND UI). *(Setup in progress)*

## 🧭 How to Navigate to Kotlin & Run the Code

Since Kotlin is usually managed by a build tool (Gradle), here is the best way to interact with this project:

1. **Recommended IDE**: Download and install [Android Studio](https://developer.android.com/studio) or [IntelliJ IDEA](https://www.jetbrains.com/idea/). These IDEs come with the Kotlin compiler and KMP plugins pre-installed.
2. **Opening the Project**: Instead of opening the individual `.kt` files as plain text, you will open the root `CMP` or `KMP` folder (once generated) using Android Studio. 
3. **The Gradle Wrapper (`gradlew`)**: You do **not** need to install the Kotlin compiler manually. When you open the project in Android Studio (or run `./gradlew` from the terminal), the Gradle Wrapper will automatically download the correct Kotlin version, set up your language server, and give you "Play" buttons next to your functions.

*If you are using VS Code, ensure you have the "Kotlin" extension installed, but note that the full language features will only activate inside the generated `CMP` or `KMP` folders containing a `build.gradle.kts` file.*
