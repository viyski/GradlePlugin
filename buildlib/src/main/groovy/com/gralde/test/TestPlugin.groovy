import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("Hello test plugin name " + project.name
                + "\n Des " + project.description
                + "\n path " + project.path
                +"\n displayName " + project.displayName
                +"\n displayName " + project.properties.get("")
                +"\n projects size " + project.allprojects.size());
    }
}
