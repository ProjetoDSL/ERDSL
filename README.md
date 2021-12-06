<h3 align="center">

![](https://i.ibb.co/nfRXxQn/ertext-Logo-P.png)


<h3 align="center">
   Domain-Specific Language (DSL) Implementation for Conceptual Modelling of Relational Databases

<h4 align="center"> 

![](https://img.shields.io/github/last-commit/ProjetoDSL/ERDSL?style=flat-square) 
![](https://img.shields.io/badge/Eclipse%20IDE->=2020‑03-blue?style=flat-square) 
![](https://img.shields.io/badge/Xtext->=2.17.0-blue?style=flat-square)
![GitHub language count](https://img.shields.io/github/languages/count/ProjetoDSL/ERDSL?color=blue&style=flat-square)
![GitHub top language](https://img.shields.io/github/languages/top/ProjetoDSL/ERDSL?color=blue&style=flat-square)
![Lines of code](https://img.shields.io/tokei/lines/github.com/ProjetoDSL/ERDSL?color=blue&style=flat-square)
![License](https://img.shields.io/github/license/ProjetoDSL/ERDSL?color=blue&style=flat-square)

---


<a href=""><img src="https://github.com/ProjetoDSL/ERDSL/blob/master/ToolOverview.png" alt="ToolOverview" border="0" /></a>

---

<a href="https://imgbb.com/"><img src="https://i.ibb.co/xgzx9XQ/gif1.gif" alt="gif1" border="0" /></a>

<a href="https://imgbb.com/"><img src="https://i.ibb.co/yVB30nV/gif2.gif" alt="gif2" border="0" /></a>

---


### Recommended Requirements (for development and/or use) ##

+ Openjdk "11.0.7" version or newer;
+ Eclipse IDE 2020-03 version or newer;
+ Xtext 2.17.0 version or newer.

---

### Project Building 



1. You can fork the repository, creating your local copy. Forking a repository allows you to freely experiment changes without affecting the original project.

1. Alternatively, you can clone this project directly with a simple command:

	```zsh	
	$ git clone https://github.com/ProjetoDSL/ERDSL.git
	```
1. To build the project, you need to start the Eclipse IDE and open the directory containing the project. 

1. This project is composed of 5 related subprojects. Most of the DSL implementation is in the **org.xtext.unipampa.erdsl** project. This one contains the implementation of grammar, generators and scoping/validations. 


1. The other subprojects are related to testing, UI and IDE modifications.


1. If you want to change any aspect of the language's grammar, go to:
	
	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/ErDsl.xtext


	5.1.After changes, rigth click *ErDsl.xtext* file.

	5.2. In the context menu select *Run As* **>>** *Generate Xtext Artifacts*. 

1. If you want to change any aspect of the generators responsible for the transformation between the models, go to:
	
	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/generator/

1. There are currently 5 implemented generators: A main generator that dispatches the described models to subgenerators. These subgenerators are responsible for creating the supported files (conceptual diagram, textual logical model and SQL for PostgreSQL and MySQL DBMS).
	
1. To generate the language plugin go to the top bar menu: 
	
	1. Click in *File* **>>** *Export* .

	1. Type "plugin" in the wizard.

	1. Select *Deployable plugins and fragments*.
	
	1. For the options that appear, generate at least the plug-in for:
	
	> org.xtext.unipampa.erdsl

	> org.xtext.unipampa.erdsl.ide

	> org.xtext.unipampa.erdsl.ui

---



### Using the Tool

1. Move the set of generated plugins in your Eclipse's plugin folder (/eclipse/plugins).

2. Open the Eclipse IDE with a new workspace.

3. Start a ERtext project.

4. You can create more than one file with the .erdsl extension in the *src* directory. Anyway, the project wizard automatically creates an empty template file.

5. If asked by IDE if you want to change the view mode to the xtext context, accept.

6. Start building your model.

7. When you finish your model, see if the IDE validates it and then save.

8. Look in the * src-gen * directory to see the generated files: it is possible to generate a .png diagram representing the conceptual model made (and a .puml file with the description using PlantUML's DSL), a .html file as a logical description , and two SQL files for different DBMSs

---

Initially made by **[Jon](https://jonnathanriquelmo.github.io)** of **[LESSE](http://lesse.com.br/site/)** research group. This project is licensed under the **[EPL-2.0](https://github.com/ProjetoDSL/ERDSL/blob/master/LICENSE "EPL-2.0")** license.

<a href="http://with-eclipse.github.io/" target="_blank">
<img alt="with-Eclipse logo" src="http://with-eclipse.github.io/with-eclipse-0.jpg" />
</a>

