/*
 * Developed by 2023 Ji Sungbin
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/DependencyHandlerExtensions/blob/main/LICENSE
 */

@file:Suppress("SpellCheckingInspection", "unused", "NOTHING_TO_INLINE")

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler

class DependencyHandler : Plugin<Project> {
    override fun apply(project: Project) = Unit
}

@PublishedApi
internal const val Api = "api"

@PublishedApi
internal const val Kapt = "kapt"

@PublishedApi
internal const val Ksp = "ksp"

@PublishedApi
internal const val LintChecks = "lintChecks"

@PublishedApi
internal const val CompileOnly = "compileOnly"

@PublishedApi
internal const val Implementation = "implementation"

@PublishedApi
internal const val DebugImplementation = "debugImplementation"

@PublishedApi
internal const val TestImplementation = "testImplementation"

@PublishedApi
internal const val TestRuntimeOnly = "testRuntimeOnly"

@PublishedApi
internal const val AndroidTestImplementation = "androidTestImplementation"

inline fun DependencyHandler.apis(vararg paths: Any) {
    delegate(method = Api, paths = paths)
}

inline fun DependencyHandler.kapts(vararg paths: Any) {
    delegate(method = Kapt, paths = paths)
}

inline fun DependencyHandler.ksps(vararg paths: Any) {
    delegate(method = Ksp, paths = paths)
}

inline fun DependencyHandler.lintCheckss(vararg paths: Any) {
    delegate(method = LintChecks, paths = paths)
}

inline fun DependencyHandler.compileOnlys(vararg paths: Any) {
    delegate(method = CompileOnly, paths = paths)
}

inline fun DependencyHandler.implementations(vararg paths: Any) {
    delegate(method = Implementation, paths = paths)
}

inline fun DependencyHandler.debugImplementations(vararg paths: Any) {
    delegate(method = DebugImplementation, paths = paths)
}

inline fun DependencyHandler.testImplementations(vararg paths: Any) {
    delegate(method = TestImplementation, paths = paths)
}

inline fun DependencyHandler.testRuntimeOnlys(vararg paths: Any) {
    delegate(method = TestRuntimeOnly, paths = paths)
}

inline fun DependencyHandler.androidTestImplementations(vararg paths: Any) {
    delegate(method = AndroidTestImplementation, paths = paths)
}

@PublishedApi
internal inline fun DependencyHandler.delegate(method: String, vararg paths: Any) {
    paths.forEach { path -> add(method, path) }
}
