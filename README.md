![](https://i.ibb.co/nfRXxQn/ertext-Logo-P.png)


<h3 align="center">
  Domain-Specific Language Implementation for Conceptual Modelling of Relational Databases

<h4 align="center"> 

![](https://img.shields.io/github/last-commit/ProjetoDSL/ERDSL?style=for-the-badge) 

![](https://img.shields.io/badge/Eclipse%20IDE-2020‑06-yellow) ![](https://img.shields.io/badge/Xtext-2.21.0-blue)

---

<a href="https://imgbb.com/"><img src="https://i.ibb.co/xgzx9XQ/gif1.gif" alt="gif1" border="0" /></a>

<a href="https://imgbb.com/"><img src="https://i.ibb.co/yVB30nV/gif2.gif" alt="gif2" border="0" /></a>

## Requirements (for development and/or use) ##

+ Openjdk version "11.0.7" 2020-04-14

+ OpenJDK Runtime Environment (build 11.0.7+10-post-Ubuntu-3ubuntu1)

+ OpenJDK 64-Bit Server VM (build 11.0.7+10-post-Ubuntu-3ubuntu1, mixed mode, sharing)

+ Eclipse IDE 2020-03 or newer.

+ Xtext 2.17.0 or newer.

---

## Project Building 



1. You can fork the repository, creating your local copy. Forking a repository allows you to freely experiment changes without affecting the original project.

2. Alternatively, you can clone this project directly with a simple command:

	```bash
	$ git clone https://github.com/ProjetoDSL/ERDSL.git
	```
3. To build the project, you need to start the Eclipse IDE and open the directory containing the project. 

4. There will be 5 more subprojects, the majority of the implementation manually made being contained in the subdirectories.

	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl

	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/generator

	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/scoping

	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/validation

5. If you want to change some aspect of the grammar of the language, go to:
	
	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/ErDsl.xtext


	5.1.After changes or additions, rigth click *ErDsl.xtext* file.

	5.2. In the context menu select *Run As* **>>** *Generate Xtext Artifacts*. 

6. If you want to change any aspect of the generator responsible for the transformation between the models, go to:
	
	> /org.xtext.unipampa.erdsl/src/org/xtext/unipampa/erdsl/generator/ErDslGenerator.xtend
	
7. To generate the language plugin go to the top bar menu: 
	
	7.1. Click in *File* **>>** *Export* .

	7.2. Type "plugin" in the wizard.

	7.3. Select *Deployable plugins and fragments*.
	
	7.4. For the options that appear, generate at least the plug-in for:
	
	> org.xtext.unipampa.erdsl

	> org.xtext.unipampa.erdsl.ide

	> org.xtext.unipampa.erdsl.ui

---


## Using the Generated Plugin

1. Move the set of generated plugins in your Eclipse's plugin folder (/eclipse/plugins).

2. Open the Eclipse IDE with a new workspace.

3. Start a empty java project.

4. Create a file with the .erdsl extension in *src* directory 

5. If asked by IDE if you want to change the view mode to the xtext context, accept.

6. Start building your model.

7. When you finish your model, see if the IDE validates it and then save.

8. Look at the *src-gen* directory and see the generated .html file, the result of transforming the conceptual model into a logical model.

---

# Contributions, suggestions, and bug reports are extremely welcome - please create an issue or contact the maintainer.

---

Initially made by **[Jonnathan](https://jonnathanriquelmo.github.io)** of **[LESSE](http://lesse.com.br/site/)** research group. This project is licensed under the **[EPL-2.0](https://github.com/ProjetoDSL/ERDSL/blob/master/LICENSE "EPL-2.0")** license.
