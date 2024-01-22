# About
Super lang is a toy language made with only functions, no parsers or lexers. More about it is in the description, for now here are some imports in this toy "language" and how to use it.
# Imports
1. Super.func; - Imports the main toy "language"
2. Super.func.math; - Imports the math functions
3. Super.func.input - Import input-output
4. Super.func.set; - Imports sets *basically arrays*
5. Super.time.CurrentDate; - Imports the CurrentDate function which gives the current date
6. Super.time.CurrentTime; - Imports the CurrentTime function which gives the current time
7. Super.time.CurrentDateTime - Imports the CurrentDateTime function which gives the current date and time
# How to use
1. Import Super.func
2. Create a object of it like - Super.func main = new func();
3. Use a function, like if you want use if - main.$if("x","=","y","hello"). Explanation - The first statement is x and the operator is equals and the second statement is y. So this is seeing if that x equals y and if it's true then it will print hello and it's false because x dosen't equal y so it will not print hello.
4. If you want to import, lets say... Math, you would do first do step one then after doing it you will do this - Super.func.math math = main.new math(); then if you want to print cos of 10 you would do - main.$print(math.cos(10));
# Tip
If you want to understand this deeper then I recommend reading the code
