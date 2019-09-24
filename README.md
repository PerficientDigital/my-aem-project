##  Creating Your First Custom AEM Component Using React

Visit My Profile: https://blogs.perficientdigital.com/author/skamdi/

Blog link: https://blogs.perficientdigital.com/2019/09/17/creating-your-first-custom-aem-component-using-react-part-1/

### Example:
![Custom React Component in AEM by Suraj Kamdi](https://drive.google.com/uc?export=view&id=1Kd_UGKEbEBzHDyJkJj1TqRVM6-Tt_Hs6)

### AEM + project template

This is a project template for AEM-based applications.

### Modules

The main parts of the template are:

* core: Java bundle containing all core functionality like OSGi services, listeners or schedulers, as well as component-related Java code such as servlets or request filters.
* ui.apps: contains the /apps (and /etc) parts of the project, ie JS&CSS clientlibs, components, templates, runmode specific configs as well as Hobbes-tests
* ui.content: contains sample content using the components from the ui.apps
* my-aem-react-app: Contains sample react app

### How to build

To build all the modules run in the project root directory the following command with Maven 3:

    `mvn clean install`

If you have a running AEM instance you can build and package the whole project and deploy into AEM with  

    `mvn clean install -PautoInstallPackage -Padobe-public`

Or to deploy only the bundle to the author, run

    `mvn clean install -PautoInstallBundle -Padobe-public`

To build react modules, then use

    `npm run build`

### Maven settings

The project comes with the auto-public repository configured. To setup the repository in your Maven settings, refer to:

    http://helpx.adobe.com/experience-manager/kb/SetUpTheAdobeMavenRepository.html
