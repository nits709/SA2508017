 //Arithmetic Operator

 let a = 10, b = 5;


//  console.log("Addition is "+ (a+b)) //105
//  console.log(`Mulitple is  ${a*b}`)
//  console.log(`Substraction is ${a-b}`)
//  console.log(`Division is  ${a/b}`)
//  console.log(`modulos is ${a%b}`)


// console.log(90/0) // Infinity
// console.log(-90/0) //-Inifinity

// console.log("hi"/0) // not a number NAN
// console.log(0/0); // not a number NAN
// console.log(1/0) // Infinity


// //String + concatation with some number
// console.log("10"+10) // 1010


/*
increement and decrement
a=10  | a++ ; post increment | ++a pre-increment                    
b=20 | b-- post decrement | --b pre decrement
*/

// let a1=100;

// console.log(a1); //100
// console.log(a1++);//100
// console.log(a1); //101


// let b1= 200;
// console.log(b1); // 200
// console.log(++b1); //201
// console.log(b1); // 201


// let x = 90;
// console.log(x); // 90
// let y = x++; // value will assign first then increment happened
// console.log(x); //91
// console.log(y); //90



// let c= 189;
// let d = c++;

// console.log(c); //190
// console.log(d); // 189

// //post decrement

let m = 188;
let n = m--;

// console.log(m) // 187
// console.log(n) // 188

/*
(variable++) post increment | frist value assinge then increment happened
variable = variable++ | value assign to variable then incrment
++variable = variable  got update/latest value (pre-incrment then value prints)
variable = ++ variable | value got inicrment first then assigned

*/

let p = 145;
let q = ++p;

console.log(p) // 146
console.log(q) //146

let u = 567;
let v = ++u;

console.log(u) //568
console.log(v) //568


//pre-decrement

let i = 689
let j = --i;

console.log(i); //688
console.log(j) //688


/*
Relational opertator
 < less than
 <=
 >
 >=
 !=
*/

console.log(p>i) // false
console.log(p>=q) // true
console.log(i>=m); // true
console.log(m<=n) // true

/*
Logical Operator

a          b             a&&b            a||b            a!            
true     true            true            true          false  
true     false           false           true          false
false    true            false           true          true
false   false            false           false       true

//Equality
 1. Strict - === a===b | value along with it checks the datatype also
 2. loose equality  == checks the values of variables only. not datatypes
*/


console.log("10" == 10) //true

// datatype of undefined - undefined
// data of null          -  object 
// developer create null in javascript -- which means not a value
// let a = undefined ()                   not having a value 



//false + true =  0 + 1
console.log(null === undefined) // false 
console.log(null == undefined)   //true 2 empty box 
console.log(false + true); //1
console.log(""+10)//10
console.log(false==null); //false  | loose equality | null - not a value | empty box
console.log(false===null); // false boolean === object
console.log(undefined+100) //NAN