// console.log("loops in js")
// // print hello 5

// for(let i =1 ; i<=5;i++){ // i = 1, 2, 3, 4 ,5 
//     console.log("Iteration no "+ i + " : " + "HELLO");
// }


// // // print number between 1 to 10
// // for(let i =1 ; i<=10;i++){ 
// //     console.log(i);
// // }

// // print all even number from certain range 1 - 10

// for(let i=1;i<=10;i++){

//     if(i%2==0){
//         console.log("number is even "+ i);
//     }

// }

// // factorial of number = 5

// let fact = 1;


// // 10*9*8*7*6
// for(let n= 10; n>=1;n--){
//     fact = fact*n;
// }

// console.log("factorial value of 5 is "+ fact)



// console.log("==================while loop===========")
// //print welcome for 10 times

// let i = 1;

// while(i<=10){
//     console.log("Welcome");
//     i++;
// }

// // break and continue;

// console.log("=====================")


// want to print variable value upto certain number 20
 //as soon as number reach 5 loops should breaks

 for(let k=1; k<=20;k++){

    if(k>10){
        break;
    }
    else{
       console.log(k)
    }
 }

console.log("===============")
 for(let k=1; k<=20;k++){

    if(k==8){
        continue;
    }
    else{
       console.log(k)
    }
 }