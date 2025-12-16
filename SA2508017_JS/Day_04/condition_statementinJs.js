
console.log("simple condition statement if")
 let year = 2025;

 if(year== 2025){
    console.log("true current year "+ year)
 }

 console.log("========if else ==========")

 let age=18; 

 if(age>=18){
    console.log("user is eligible for voating")
 }else{
    console.log("usr is not eligible for voting")
 }

 console.log("=============ladder if ================")

let num=0;

if(num>0){
    console.log("Positive number")
}else if(num<0){
    console.log("negative number")
}else{
    console.log("number is not valid one")
}

console.log("=====Browser validation=====")

let bName="edge"; // default

// loose // Chrome
if(bName === "chrome"){
        console.log("test case executes on " +bName);
} else if(bName === "firefox"){
    console.log("testcases executes on "+bName);
}else{
    console.log("testcases executes on "+ bName);
}

console.log("nested if")

/*
marks are greather than equal 90 -- A
marks are greather than equal 95 -- A++
other wise  b grade
*/

let marks = 84;

if(marks>=90){

    if(marks>=95){
        console.log("A++");
    }else{

        console.log("A");
    }


}else{
    console.log("b")
}

console.log("========switch case statement=========")

let browser = "edge";

switch(browser)
{
        case "edge":
            console.log("edge browser is opening");
            break;

        case "safari":
            console.log("safari browser is opening")   
            break;
         
        default:
        console.log("chrome browser is opening")
        break;
}




let lightColor = "green";

switch(lightColor)
{
        case "red":
            console.log("stop");
            break;

        case "yellow":
            console.log("ready")   
            break;

        case "green":
                console.log("go")   
                break;   
         
        default:
        console.log("invalid color")
        break;
}