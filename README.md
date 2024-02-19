# About
Super lang is a toy language made with only functions, no parsers or lexers. More about it is in the description, for now here are some imports in this toy "language" and how to use it.
# Imports
1. Super.func - Imports the main toy "language"
2. Super.func.math - Imports the math functions
3. Super.func.input - Import input-output
4. Super.func.Set - Imports sets *basically arrays*
5. Super.func.Map - Imports maps *basically hashmaps*
6. Super.func.Calender - Imports a calender *I don't know what I am adding anymore, pls help*
7. Super.time - Imports time
8. Super.gui - Imports gui
9. Super.console - Imports more mays to edit the console output
10. Super.external - Imports functions that interact outside the console
11. Super.autoMake - Imports pre-made games as functions
12. Super.files - Imports a file reader and writer *Note - this import automatically creates a text file, you can change the file name and extension in the source code*
# How to use
There are two ways to use it:
# First way:
1. Import Super.func
2. Create a object of it, like - Super.func main = new func();
3. Use a function, like if you want use if - main.$if("x","=","y","hello"). Explanation - The first statement is x and the operator is equals and the second statement is y. So this is seeing if that x equals y and if it's true then it will print hello and it's false because x dosen't equal y so it will not print hello.
4. If you want to import, lets say... Math, you would do first do step one then after doing it you will do this - Super.func.math math = main.new math(); then if you want to print cos of 10 you would do - main.$print(math.cos(10));
# Second way:
1. Extend any import
2. Create a object of it, like - gui g = new gui();
3. Functions - g.$Addtext("hello");
Rest is same as the first way
# Tip
1. If you want to understand this deeper then I recommend reading the code
2. I recommend extending files instead of importing
3. Put your files inside the package for it to work
