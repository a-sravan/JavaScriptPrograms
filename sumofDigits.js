//Program to print sum of digits;
let number = [1,2,3,4,5];
let sum = 0;
for (let i = 0; i < number.length; i++) {
    sum = sum + number[i];
    console.log(sum, " \n+ ");
}

console.log("Sum of digits = ",  sum);