## Background

[Cisco's DNA Center](https://www.cisco.com/c/en/us/products/cloud-systems-management/dna-center/index.html) is a centralized network control and management dashboard for Cisco DNA, an intent-based networking solution.

This project provides a sample Java application and client libraries to access the Center as a Platform REST APIs for the [Java](https://java.com) language. The included sample application performs the following functions:

* Authenticates with DNA Center
* Retrieves a count of the number of networking devices listed in the inventory
* Displays a high level summary of the networking devices listed in the inventory

By default the sample application has disabled SSL certificate checking when connecting to DNA Center, but this can be re-enabled if desired.

## Requirements

This Java sample application is a Maven project, the following is also required:

* [Java 1.8](https://java.com)
* [Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygen3a)
* [Maven](https://maven.apache.org/download.cgi)

Java Dna Client API is required to run this sample, it should be included in the download package zip file.

## Setup

##To run using an IDE 

* Install Java.
* Install Eclipse.
* Clone or download ZIP file.
* Unzip the downloaded ZIP file.
* Open Eclipse and specify the DNAC_JAVA-SDK-master directory created by unzip as your workspace.
* If prompted with a popup called "Discover m2e connectors", just click the "Finish" button, then follow the prompts to install the connectors, including the unsigned driver install. An Eclipse restart may be required.
* In Eclipse File -> Import -> Existing Maven Projects, Browse for and select DnacAppApi directory, Click Finish.
* In Eclipse File -> Import -> Existing Maven Projects, Browse for and select ClientApiTester directory, Click Finish.
* Edit the Application.java file in the ClientApiTester project and set username, password and basePath (DNAC server Ipaddress).
* You can then run the ClientApiTester by opening up the Application.java file, right click on the open window and select "Run As" and select "Java Application". 

##To run using command line

* Edit the Application.java file in the ClientApiTester project and set username, password and basePath (DNAC server Ipaddress).
* Change into the DnacAppApi directory and run the command: 

```shell
mvn clean install
```

* Change into the ClientApiTester directory and run the command: 

```shell
mvn clean install
```

* To run the sample program, from the ClientApiTester/target directory run the following command: 

```shell
java -cp ClientApiTester-1.0.1-SNAPSHOT-jar-with-dependencies.jar com.cisco.dna.ClientApiTester.Application
```

