# Human-benchmark-automated
this programs aims to automate the various tests/games that the website known as "Human Benchmark" has. 

as of right now the program almost certainly won't work on different machines due to me using .awt.robot package and hard coding the pixels into it. This will be fixed on a later date.


the file "tempo.java" has a single purpose and it is to allow me to get the exact pixel(s) I need and color(s) I need. you can use it to get the pixel you want to click and set it in ReactionTime.java. You can also use tempo.java to get the dimensions needed for AimTrainer.java to work on your machine. simply take the top left corner of your desired frame and take the bottom right corner.  then you take the x and y of your left corner lets say they are x1 and y1 while the bottom right corner's x and y are x2 and y2 respectfully. Simple perform x2 - x1 to find width and y2 - y1 to find height   and input them into the following object 
        Rectangle captureArea = new Rectangle(x1, y1, width, hieght);          
on my device it 
        Rectangle captureArea = new Rectangle(794, 134, 1016, 583);
if I didn't change it.

The code I've written isn't very clean and there is most definitely a lot of room for improvement so tell me ways I can do so and point out any bugs that you find/encounter.
