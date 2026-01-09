import { test, expect } from '@playwright/test';

test('reusable function', async ({ page }) => {

    //approach -1 
     await page.goto('https://testautomationpractice.blogspot.com/')
    // const option = await page.locator('#country option');
    // const noOfOptions = await option.count(); // return total no of element present in element

    // console.log('noOfOptions '+ noOfOptions)
    // await expect(option).toHaveCount(10);// this function would check the size of element against the element

    //approach-2
    const option =  await page.locator('#country option');
    const noOfOptions = await option.count()
    console.log(`number of options present ${noOfOptions}`);


    let status = false;

    // function name?
    // for(const opt of option){
    //     let textOnElement = await opt.textContent(); // return the text.

    //     if(textOnElement.includes('France')){
    //         console.log('inside if block');
    //         status = true;
    //         break;
    //     }
    // }


    for(let i=0; i<noOfOptions;i++){
       let dv = await option.nth(i).textContent(); // return the text

       if(dv.includes('India')){
        console.log('inside if');
        status=true;
        break;
       }
    }


    console.log("status "+ status) // true




})
