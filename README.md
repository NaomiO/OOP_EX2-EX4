# OOP_EX2-Ex4

#Packman Game

#Map
A class that represents a map that contains a map image file and all the necessary parameters of its alignment to a global coordinate system. The class enables conversion of global representation coordinates to pixel in image and vice versa. In addition, the department enables the calculation of studies in meters between two "pixels in an image" and the angle of their sons.

#Packman
A class representing a "robot" with location, orientation and mobility

#fruits
A department that represents a "target" in a known geographic location, without movement

#game
A class that includes a collection of fruits and a collection of Pacman, the department has the ability to build from the csv file and save its information to such a file and save a file to kml

#Path2KML
A function in game that allows to keep track of the movement of a robot or robots in a file
KML, the track is saved and can be run on GoogleEwwwarth and see the robots and the "eating" of the fruit.

#path
A route made up of a GPS point collection. Longitude and additional geographic information by
Need.

#ShortestPathAlgo
 A class that accepts a game that is a collection of robots and fruits and calculates the optimal route ie the shortest so that all fruits will "eat" as fast as possible
This is a central algorithmic class that includes calculating "fruit tracks" for each of the vendors.
The goal of the algorithm is to minimize the time it takes for all the people to eat all the fruits - the current score at each time point of each Pacman is the sum of the weights of all the fruit he has eaten so far, and the general score at each point in time is that sum.

#Main window 
A graphical class that allows robots and fruits to be displayed on the map,
The activity of algorithms, the preservation of data, and the recovery of data from csv files or the creation of a game by selecting robots and fruits and positioning them on the map.


