/**
 * What is an Array in JS (Non-primtive)
 * array in js are used to store multiple data value into single variable
 * can store different datatype in array
 * size is not fixed (dynamic in nature can grows or shrink)
 * indexed starts from 0th index.
 * 
 * keyword to use in for loop to get the index of array and value of an array
 * in java
 * String[] object = {"A","B"}
 * int arr = new int[2];
 * arr[0] = 12;
 * arr[1] = 40;
 * arr[4] = 60; //ArrayIndexOutofboundException
 * 
 * 
 */
// let arr= [];
// arr[0] = 10; //valie
// arr[5] = 50; // valid

// console.log(arr.length)//6
let arr = [10,20,30,40,50];
          //0, 1,2,3,4

// console.log(typeof arr)
// console.log(arr)
// console.log(arr.length) // return the size of an array in JS

// console.log("Element at index at 3 "+ arr[3])//40
// console.log("Element at wrong index "+ arr[10])// undefined

// for(let i=0;i<arr.length;i++){
//     console.log(arr[i] + " : " + i)
// }

// // of returs the value of array
// // in | returns the index of an array

// for(let e of arr){ // iterates over the value
//     console.log(e)  // [10,20,30,40,50]
// }


// for(let e in arr){ // iterates over the index
//     console.log(e)  // [0,1,2,3,4]
// }

console.log("=============Array Method=========================")

// let color = ["red","pink","orange","White","Blue"]
// console.log(color)

// unshift():
// push() :  Appends th element in existing array  at the end of array index
//and return the length of array

// console.log("=======Push=====")
// color.push("Black");
// console.log(color)


// console.log("=======Unshift=====")
// color.unshift("Yellow");
// console.log(color)


//splice(): delete an element of any index, add new element into it
//splice(0,1)
// let nameList = ["Ravi","Ketan","Arun","John","Chid","Venki"]
// console.log(nameList)
// let newNameList = nameList.splice(0,1);
// console.log(newNameList)
// console.log(nameList)


// //nameList.splice(0,1,"Kumar") // ketan
// let updateNameList = nameList.splice(0,1,"Kumar","Abhishek") // ketan
// console.log(nameList)//

// // below format doesnt remove any value from array
// nameList.splice(2,0,"Selenium")
// console.log(nameList)




console.log("---------------Multi D Array------------")

let testData = [["admin","admin123"],["Nikhil","Nikhil123"],["Neha","Neha123"]];
                    //0                     1                      2
console.log(testData.length)
console.log(testData)

console.log(testData[0])
console.log(testData[1][0]) // Nikhil, Nikhil123







