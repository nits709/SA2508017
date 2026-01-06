import {test,expect} from '@playwright/test';


test('locators in playwright',async ({page})=>{
    //launch the application URL
    await page.goto("https://demoblaze.com/index.html")
    const pageTitle = await page.title(); // returns the title() of page | getTitle() selenium
    console.log("page Title "+ pageTitle)

    //click on login element using property type locator
    //await page.locator('id=login2').click();   // property locator type  // coming from palywright
    await page.click('id=login2'); // javascript format.

    //enter the testdata into username


    // // playwright format
    // //to type the data into input field use fill funciton.
    // await page.locator('[id="loginusername"]').fill("pavanol"); // css format
    // await page.locator('#loginpassword').fill('test@123'); //css format
    // await page.locator('//button[normalize-space()="Log in"]').click(); // xpath


    //JS format
    await page.fill('[id="loginusername"]',"pavanol");
    await page.fill('#loginpassword',"test@123");
    await page.click('//button[normalize-space()="Log in"]');

    //await page.click('id=logout2');
    const logoutElement = await page.locator('id=logout2');
    await expect(logoutElement).toBeVisible(); // this checks element is coming on page.

    await page.click('id=logout2'); // this logout from application.

    await page.close();




})