

//global
// var fname = "Atul";
// let id= 709;
// const email = "xyz@gmail.com";

// console.log("================calling variable at global level============")

// console.log(fname)
// console.log(id)
// console.log(email)


// function show(){   // function declaration  

// console.log("=================calling global variable from function==================")
// console.log(fname)
// console.log(id)
// console.log(email)
// }

// show();


// function display(){
//     let uName = "Ssachin";
//     var marks = 100;
//     const technologies = "Mobile Developer";

//     console.log("=================calling functions variable from function==================")
//     console.log(uName)
//     console.log(marks)
//     console.log(technologies)

// }

// display();    // js does not compiler 
// console.log(uName)
// console.log(marks)
// console.log(technologies)


//block scope;


// if(true){  // variable scope remain local and can access within block only
//     let AutomationName = "Playwright";
//     var playwrightVersion = 'xxxx';
//     const techsupport = 'yes';
//     console.log(AutomationName)
//     console.log(playwrightVersion)
//     console.log(techsupport)

// }

// console.log(AutomationName)
// console.log(playwrightVersion)
// console.log(techsupport)


// var data = "testing"; // declaration

// console.log("value of data "+ data)

// var data = "developer"; // re-declaration

// console.log("value of data "+ data)

// data = "datatesting" ; // re-assigned
// console.log("value of data "+ data)



// let browserName = "Chrome";
// console.log("value of browserName + "+ browserName)

// // let browserName = "Firefox";  // re-declaration is not allowed
// // console.log("value of browserName + "+ browserName)

// browserName = "Firefox"; // re-alocated the existing variable.
// console.log("update value of browserName "+ browserName)


//const act as final keyword in java.

// const automationTools = "cypress";
// console.log("automationTools "+ automationTools);

// automationTools = " selenium";
// console.log("automationTools "+ automationTools);


// console.log("=================Hositing in JS with var================")
// console.log(a); // error because compilation

// var a = "xyz";
// console.log(a);


// console.log("=================Hositing in JS with let================")


// console.log(y);
// let y = "123";

// console.log(y);



// console.log("=================Hositing in JS with const================")


// console.log(y);
// const y = "123";

// console.log(y);


sum();
function sum(){
    console.log("sum function is calling")
}




