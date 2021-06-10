# Qts Software Engineering Tech Task

This repository is a web service that will return flights matching the specified criteria.<br/>
The web service will return:
1) All flights
2) All flights by airline code
3) Provide the interface to create new flights

## Getting Started

If necessary, firstly unzip the file named "QantasTechTask.zip".<br/>
Using XCode, locate and open the file named "QantasTechTask.xcodeproj".<br/>
The project has no external framework dependancies.

### Prerequisites

The project is written for iOS, and will run on iPhone and iPad running iOS 14.5 and above.

### Installing

To compile the project, please use the latest version of XCode, currently version 14.5.<br/>
Set the target device to be an iPhone or iPad, or for the best experience, attach and install on physical device.<br/>
Using the iOS Simulator, press the run button, or from the menu, "Product->Run".

### About

The app will firstly present a loading indicator while retrieving a list of airports from the endpoint.<br/>
After the list has been loaded, scroll and select the required airport.<br/>
Once selected, details regarding the airport will appear.<br/>
To return to the list of airports, press the button labelled "Airports".<br/>
