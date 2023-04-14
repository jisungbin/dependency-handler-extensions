# dependency-handler-extensions

This Gradle plugin helps you easily do multiple `add`s on your `DependencyHandler`.

### Download ![maven-central](https://img.shields.io/maven-central/v/land.sungbin.dependency.handler.extensions/dependency-handler-extensions-plugin)

```gradle
plugins {
    id("land.sungbin.dependency.handler.extensions") version "$version"
}
```

or.. (if you want implementation)

```gradle
dependencies {
    implementation("land.sungbin.dependency.handler.extensions:dependency-handler-extensions-plugin:${version}")
}
```

_Note that this plugin uses JDK 17._

### Usage

```gradle
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

```gradle
// source: https://github.com/duckie-team/duckie-android/blob/c10ea3ca2b0bccda7069c02786e6a83eeaacd9d2/util-viewmodel/build.gradle.kts#L18-L27

dependencies {
    implementations(libs.kotlin.coroutines, projects.utilKotlin)
    testImplementations(libs.test.turbine, libs.test.coroutines)
}
```

### License

This project is licensed under the MIT License. Please refer to the [LICENSE file](LICENSE) for details.
