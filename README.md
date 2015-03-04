Reviews
========

This is a maven project to build and run it via Eclipse follow these steps
<ul>
<li>Right Click on Package Explorer</li>
<li>When menu comes up click on "import" menu option - This will bring up a dialog box</li>
<li>On the dialog box select the "Project from Git" option then click on "Clone URI"</li>
<li>On the "Clone URI" window enter this in the URI</li>
</ul>

Once the Git project has been cloned on your local machine do the following
<ul>
<li>Right Click on Package Explorer</li>
<li>When menu comes up click on "import" menu option - This will bring up a dialog box</li>
<li>On the dialog box select the "Maven -> Existing Maven Project" option then click on "Clone URI"</li>
<li>When that dialog box comes up click "browse" and find the location where you cloned the Git project into.  This will show you the pom.xml file from your project</li>
<li>Click finish.  This will bring the project into the package explorer</li>
</ul>

Once the project is in the package explorer right click on it and select the Maven menu. The maven memu will have a "Maven install" option.  Click on that option and that will grab the maven dependencies and apply them to the project.

Once the project has been build with Maven you can right click on it and Debug it or Run it by selected the proper "Run As" or "Debug As".  
