# DependencyHandlerExtensions

This Gradle plugin helps you easily do multiple `add`s on your `DependencyHandler`.

### Download ![maven-central](https://img.shields.io/maven-central/v/land.sungbin.dependency.handler.extensions/dependency.handler.extensions.plugin)

```kotlin
plugins {
    id("land.sungbin.dependency.handler.extensions") version "$version"
}
```

### Usage

```kotlin
dependencies {
    classpaths(.., .., ..)
    apis(.., .., ..)
    kapts(.., .., ..)
    ksps(.., .., ..)
    lintCheckss(.., .., ..)
    compileOnlys(.., .., ..)
    implementations(.., .., ..)
    debugImplementations(.., .., ..)
    testImplementations(.., .., ..)
    testRuntimeOnlys(.., .., ..)
    androidTestImplementations(.., .., ..)
}
```

#### Real-World example

```kotlin
// source: https://github.com/duckie-team/duckie-android/blob/c10ea3ca2b0bccda7069c02786e6a83eeaacd9d2/util-viewmodel/build.gradle.kts#L18-L27

dependencies {
    implementations(
        libs.kotlin.coroutines,
        projects.utilKotlin,
    )
    testImplementations(
        libs.test.turbine,
        libs.test.coroutines,
    )
}
```

### License

This project is licensed under the MIT License. Please refer to the [LICENSE file](https://github.com/duckie-team/composable-function-reference-diagnostic-suppressor/blob/main/LICENSE) for details.
