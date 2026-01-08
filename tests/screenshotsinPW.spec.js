// in pw mulitple way to take screenshot
//1. pageview - page appears on browser view port
//2. fullpage -- end to end application on single page.
//3 .locator 


import {test,expect} from '@playwright/test'

test('pageview Screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');


   // await page.screenshot({path:'Homepage.png'});  // syntax

   await page.screenshot({path:'tests/screenshots/pageView/'+Date.now()+'_Homepage.png'})

})

test('fullpage Screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');

   // await page.screenshot({path:'Homepage.png'});  // syntax
   await page.waitForTimeout(2000)
   await page.screenshot({path:'tests/screenshots/FullPage/'+Date.now()+'_fullPage.png',fullpage:true})

})


test('element Screenshot',async({page})=>{
    await page.goto('https://demoblaze.com');

   // await page.screenshot({path:'Homepage.png'});  // syntax
   await page.waitForTimeout(2000)
   //await page.screenshot({path:'tests/screenshots/Homepage1.png',fullpage:true})

   await page.locator('.d-block.img-fluid').first().screenshot({path:'tests/screenshots/locator/'+Date.now()+'_locators.png'});

})



