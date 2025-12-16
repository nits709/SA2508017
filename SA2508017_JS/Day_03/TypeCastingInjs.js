/*
Typecasting - Conversion of one type of data into other data type.

1. Implicit Conversion | Coersion (implicit type casting taken care by javascript automatically)

2. Explicit Conversion (through code)
    1. String
    2. Number
    3. Boolean

*/


//String coversion | Implicit 

// let num1 =  "10"+20;  // 20 will coersed to string "20";

// console.log(num1); // 1020
// console.log(typeof num1);


// let num2 = 2+5+"10"; // 710
// console.log(num2)


// let num3= 10 + "15" + 30; // 10 and 30 will be coresed with 30

// console.log(num3) // 101530

// let num4 = "Hi"+true; // Hitrue

// console.log(num4)



console.log("==================Number (-,*,/,%)================")

// console.log("A"+"B"+"C") //ABC
// console.log("20"+"10"+"20") //201020 
// console.log(20+10+20) // 50

// console.log("20"-10); // 20 coersed with number 20-10 = 10
// console.log(typeof ("20"-10))  //number
// console.log("20"+10)//
// console.log(typeof ("20"+10))

// console.log("100"*5)// 100 coersed with number | 100*2 = 200
// console.log(typeof ("100"*5))

// console.log("hi"*10)// NAN



console.log("=================Explicit Type casting====================")
 //Number, boolean, String


//  let data = "200"; // string
//  console.log(typeof data)

//  console.log(data+200) //200200

 //addition --> string to number

//  let addition = Number(data)
//     console.log(addition) // 200

//     console.log(typeof addition)
//     console.log(addition+200) // 400


//     console.log(Number("600")); //600
//     console.log(Number("Nitin")) // Nan
//     console.log(Number(true)) // 1
//     console.log(Number(false)) // 0
//     console.log(Number(null)) // 0
//     console.log(Number(undefined)) // nan



    console.log("======================Number to string================")

    // let num = 2000;

    // console.log(typeof num)

    // console.log(num-1000) // 1000
    // console.log(num+1000) // 3000


    // let numToStringConvert = String(num) // 2000
    // console.log(typeof numToStringConvert)
    // console.log(numToStringConvert+1000) // 20001000

    // console.log(Number(numToStringConvert)-1000)//1000
    // console.log(numToStringConvert-1000) // 1000


    console.log("======Boolean convserion=============")
    //for true - truthy | mean any value in boolean context represents as true
    //for false - falsy | mean any value in boolean context represents as false
    //non-zero, 1,2, and "123", "nitin" except ""
//falsy - 0,"",null,NAN,false, undefined

    console.log(Boolean(90))  // true
    console.log(Boolean(-90))  // true
    console.log(Boolean("Nitin"))  // true
    console.log(Boolean(true))  //true
    console.log(Boolean(80.00))  //true
    console.log(Boolean(90.999))



    console.log(Boolean(0))
    console.log(Boolean(false))
    console.log(Boolean(""))
    console.log(Boolean(undefined))
    console.log(Boolean(NaN))
    console.log(Boolean(null))



    





