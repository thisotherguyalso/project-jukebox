To Do:

1. Two more classes for basic shapes (triangle, pentagon, octagon, etc.)
2. At least two (2) more classes that create composite shapes — a composite shape is onethat is created using a  combination of two or more instances of your basic shape classes. For example, you can create a Sun class, and inside that class, there is a Circle object (from the class that you created) for the sun's center, and a few Line objects (also from the class that you created) for the rays. Instead of using the Ellipse2D.Double and Line2D.Double classes, you must make use of your own Circle class and Line class for it to be considered a composite shape. You are allowed to augment them with any of the java.awt.geom classes, as long as you make use of at least two (2) of your own basic shape classes.
3. Elements
4. Figure out how we can incorporate a JButton (how it will function) to our program (The basic requirement for the animation is that you have one (1) button that, every time it is clicked, will move the objects in the scene. However, you are free to animate your project in different ways (e.g. clicking on the drawing instead of a JButton, continuous animation without any buttons, animation using keyboard keys, mouse assisted animation, etc.))
5. Javadoc comments - (kahit sa huli na)


Notes:

1. SceneCanvas.java
- where we will draw the elements of the animated scene
- the elements should be added/instantiated inside the constructor
2. SceneFrame.java
- contains the JFrame of the GUI
3. SceneStarter.java
- contains the main method that will instantiate the SceneFrame class