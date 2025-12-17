function orderFood(callback) {

    console.log("Food is being prepared.......")
    callback(); // callingback
}

function notifyCustomer() {
    console.log("your food is ready")
}

orderFood(notifyCustomer);


function bookCab(callback){
    console.log("Cab is on the way......")
    callback();
}

// function callCaustomer(){
//     console.log("cab arrived....")
// }

bookCab(callCaustomer); // function declaration

bookCab(()=>{
    console.log("cab arrived....")  // arrow function
})






console.log("---------calculator---------")

function add(a,b){
    return a+b;
}

function mult(a,b){
    return a*b;
}


function calculator(a,b,func){

    return func(a,b);

}

console.log("multiple "+ calculator(3,5,mult));
console.log("Addition "+ calculator(3,5,add));

console.log("==================================================")