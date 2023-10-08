import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class FeaturePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with (target) {
            dependencies {
                add("implementation", project(":core:designsystem"))
                add("implementation", project(":core:resource"))
            }
        }
    }
}