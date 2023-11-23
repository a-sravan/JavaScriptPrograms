console.log("Swapping of two numbers without using third vaiable");
x = x + y;
y = x - y;
x = x - y;
console.log("x=",x , "y=", y);

console.log("Swapping of two numbers with using temp variable");
temp = x;
x = y;
y = temp;
console.log("x=",x , "y=", y);