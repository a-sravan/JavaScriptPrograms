//A for-in loop is used to loop through the properties of an object.

let obj = {
    firstName: "Sravan",
    lastName: "Arimadla",
    phone: 6303578599,
    email: "arimadlasravan@gmail.com"
}

for (let prop in obj) {
    console.log(prop + ':' + obj[prop]);
}