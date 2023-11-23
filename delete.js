var x = 10;
y = 15;
let sum = 0;
function addition(arg1, arg2) {
    sum = arg1 +arg2;
    return sum;
}

addition(x, y);

console.log("Sum of x and y", sum);
console.log("Performinmg delete on variables:");
console.log(delete x); // cannot delete y as this is a variable
console.log(delete y); //exceptional case where you can delete the global variable like y;

console.log(delete sum);


// student object and it's properties
let student = {
    firstName: "Sravan",
    lastName: "Arimadla",
    phone: 63035758599,
    id: "B19ME190L"
}
console.log("performing delete operation on object properties:");
console.log(delete student.phone); //object properties can be deleted using delete
// console.log(delete student.id); 

console.log(student.firstName);
console.log(student.lastName);
console.log(student.phone);
console.log(student.id);


//you can delete array elements using delete
console.log("Performing delete on array elements:");
let arr = [1,2,3,4,5];
console.log(delete arr[0]);
console.log(delete arr[3]);

console.log(arr);