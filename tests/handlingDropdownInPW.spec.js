import {test,expect} from '@playwright/test';

test('handling dropdown',async({page})=>{
await page.goto('https://testautomationpractice.blogspot.com/')

// select value from drop down using label | what is label in PW
 // label is visible text of element or inner text which present inbetween
 //<innerText|visibleText|lablel> 

 //await page.locator("//select[@id='country']").selectOption
//await page.locator(''#country).selectOption
//await page.locator('id='country').selectOption

//await page.locator('#country').selectOption({label:'India'}); // label

// select the value from dropdown by visible text
//await page.locator('#country').selectOption('China') // select value from visibletext

//select the value from dropdown by index. | index starts from 0 ( 1 option value at 0th index rest  according 1,2,3,4)

//await page.locator('#country').selectOption({index:3}) // select by index.

await page.selectOption('#country','India'); // javascript format. 

await page.locator('#country').screenshot({path:'tests/screenshots/locator/'+Date.now()+'_locators.png'});



})