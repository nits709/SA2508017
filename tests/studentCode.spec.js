import { test, expect } from '@playwright/test'


test("InteractMulitple Links ", async ({ page }) => {

    await page.goto("https://the-internet.herokuapp.com/")

    console.log("page loaded successfully")

    //driver.findElements('locators') | size();
    //get the total number of lins present on heroko app.   
    const noOfLinks = await page.locator("#content a"); //44 links
    const link = await noOfLinks.count();

    console.log(`total number of link ${link}`) //returns me total no. of links

    for (let i = 0; i < link; i++) { //nth
        const textOFLinks = noOfLinks.nth(i);
        const textOnElement = await textOFLinks.textContent();
        console.log(textOnElement)

        await textOFLinks.click();
        console.log("Title " + await page.title) // print the title from the page 
       await page.goBack(); // takes user to nexrt page.
        //page.goForward();

    }
})