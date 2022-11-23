/*
 * Developed by 2022 Ji Sungbin
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/duckie-team/DependencyHandlerExtensions/blob/main/LICENSE
 */

@file:Suppress("SpellCheckingInspection", "unused")

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler

class DependencyHandlerExtensions : Plugin<Project> {
    override fun apply(target: Project) = Unit // do nothing

    companion object {
        private const val Api = "api"
        private const val Kapt = "kapt"
        private const val Ksp = "ksp"
        private const val LintChecks = "lintChecks"
        private const val CompileOnly = "compileOnly"
        private const val Implementation = "implementation"
        private const val DebugImplementation = "debugImplementation"
        private const val TestImplementation = "testImplementation"
        private const val TestRuntimeOnly = "testRuntimeOnly"
        private const val AndroidTestImplementation = "androidTestImplementation"

        fun DependencyHandler.apis(vararg paths: Any) {
            delegate(
                method = Api,
                paths = paths,
            )
        }

        fun DependencyHandler.kapts(vararg paths: Any) {
            delegate(
                method = Kapt,
                paths = paths,
            )
        }

        fun DependencyHandler.ksps(vararg paths: Any) {
            delegate(
                method = Ksp,
                paths = paths,
            )
        }

        fun DependencyHandler.lintCheckss(vararg paths: Any) {
            delegate(
                method = LintChecks,
                paths = paths,
            )
        }

        fun DependencyHandler.compileOnlys(vararg paths: Any) {
            delegate(
                method = CompileOnly,
                paths = paths,
            )
        }

        fun DependencyHandler.implementations(vararg paths: Any) {
            delegate(
                method = Implementation,
                paths = paths,
            )
        }

        fun DependencyHandler.debugImplementations(vararg paths: Any) {
            delegate(
                method = DebugImplementation,
                paths = paths,
            )
        }

        fun DependencyHandler.testImplementations(vararg paths: Any) {
            delegate(
                method = TestImplementation,
                paths = paths,
            )
        }

        fun DependencyHandler.testRuntimeOnlys(vararg paths: Any) {
            delegate(
                method = TestRuntimeOnly,
                paths = paths,
            )
        }

        fun DependencyHandler.androidTestImplementations(vararg paths: Any) {
            delegate(
                method = AndroidTestImplementation,
                paths = paths,
            )
        }

        private fun DependencyHandler.delegate(
            method: String,
            vararg paths: Any,
        ) {
            paths.forEach { path ->
                add(method, path)
            }
        }
    }
}
