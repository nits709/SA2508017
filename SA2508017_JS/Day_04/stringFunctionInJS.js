/*

String is a collection of individual character



*/

let info = "selenium  WebDriver is function automation tool ";
console.log(info);

//total length of my entire String.
console.log(info.length)

let h1 = "Hello ALL"; //index starts with 0
console.log(h1.length)
console.log(h1.toUpperCase());
console.log(h1.toLowerCase());

console.log(h1.charAt(4));

// trim(); =" remove space from either side "
// trailing and starting

let sString = "Software testing, having manual and automation testing";
console.log(sString)

// replace some part of string into use replace function
console.log(sString.replace("testing","*****"));
console.log(sString.replaceAll("testing","*****"));


// this function acts as contains of java
console.log(sString.includes("Software")); // true
                 //0    1     2     3    4   5
let statement = "Your total amount bill is 5000";
let bill = statement.split(" ")[5]; // 5000

console.log(bill);
