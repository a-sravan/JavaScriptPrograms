let str1 = "sravan";
let str2 = "sravan";
let revStr = "";
let temp = "";

console.log("Printing each character of a string");
for(let i=0; i < str1.length; i++) {
    console.log(str1[i], ",");
}

console.log("Printing reverse of a string with using temp variable");
for (let i=0; i < str1.length; i++) {
    temp = str1[i];
    revStr = temp +revStr;
    console.log(revStr, " ");
}