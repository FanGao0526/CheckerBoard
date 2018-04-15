1. Reflect on (think about) the work you did for the challenge. How did you do? What did you get right? What did you get wrong? What did you do differently (and possibly better) than what was posted in the solution? What was hard to do?
In my implementation, I first built a checkerboard class to hold all the variable and methods for a single checkerboard object, this part is quite similar with the posted solution. The tricky part is the build function, in this function we should generate the checker with continuous rectangle, my way is checking the mod of the sum of row and column, which is the same mathematical meaning as the solution. Another point is the coordinate of row and column, just be aware when defining the for loops. The most differences happen at the controller part, my code did implement all the requirements, but lack of robustness, and not that reusable. The solution’s code use case to handle different occasions, like board size or color, while I separately build several functions, each binding with every button. I think the solution’s code is better, since it makes the whole thing concise and easy to understand. The listener settings are also different, the solution’s code separately define a render function, and call it every time a change happens, which is better than my way, my way is get the window information again and again, and update their values. 
I would say the difficulty is how to listen the changes and bind a proper reaction function, since I’m not that familiar with JavaFX, from code to view is the most impressive skill I learn.
And in my further study, I found the JavaFX is just a type of technique using MVC framework, as long as we get the key idea of separating the code and assign single duty to each part, we can always do development in this way.  

2. How well did you understand the programming concepts and foundational knowledge needed to complete the challenge?
The Object Oriented concept is definitely the most important thing when doing the coding work, a class shall be well designed to represent an object, containing all the essential variables and supportive functions, either passing values or modifying parameters. Another important part is understanding the MVC framework well, we need to understand why the code is divided into three parts and what’s the meaning behind them. I think the main advantage of MVC is the separation of code, each code segment has its own duty, decoupling the code and focus on specific requirements.

3. How well did you meet the requirements as set out in the challenge? What requirements did you not meet correctly (if any)?
Basically, all the requirements are met.

●	Like the checker part, using the mod operation to check the row and columns.

●	The resize of window, add listener to all the window related variables.

●	The change of color and checker scale, use case to do different operations.

4. How well does your solution match the posted solution? What is different?
From the aspect of functionality, all the requirements are implemented. The different is my code is not in a concise manner, some parts cause redundancy and some parts cannot handle all the possibilities well. Robustness is also what my code needs compared with solution’s code. 

5. How could you improve going forward? What don't you still understand that was required for the challenge?
Make the code more concise, reduce unnecessary code segments, try package codes into function and reuse it. Make sure in MVC framework each part focus one job, no unnecessary overlap of functionalities and passing values to call each other.
From my part, the design patterns are the part I still need time to get familiar with, with some industrial standard, the code will achieve higher quality.
