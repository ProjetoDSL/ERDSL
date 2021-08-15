/*
 * generated by Xtext 2.25.0
 */
package org.xtext.unipampa.erdsl.ui.wizard


import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class ErDslProjectTemplateProvider implements IProjectTemplateProvider {
	override getProjectTemplates() {
		#[new ERtextProject]
	}
}

@ProjectTemplate(label="org.project.ertext.template", icon="project_template.png", description="<p><b> ERtext TEMPLATE</b></p> 
<p>This is a parameterized template for ERtext. You can set a parameter to modify the content in the generated file and a parameter 
to set the package the file is created in.</p>")
final class ERtextProject {
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val name = combo("Name:", #["Xtext", "World", "Foo", "Bar"], "The name to say 'Hello' to", advancedGroup)
	val path = text("Package:", "ERtext", "The package path to place the files in", advancedGroup)

	override protected updateVariables() {
		name.enabled = advanced.value
		path.enabled = advanced.value
		if (!advanced.value) {
			name.value = "Xtext"
			path.value = "ertext"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			addFile('''src/«path»/Model.erdsl''', '''
				/*
				 * This is an example model
				 */
«««				Hello «name»!
				Hello new user!
			''')
		])
	}
}