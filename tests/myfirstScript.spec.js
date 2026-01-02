import {test, expect} from '@playwright/test';

//what is page? | browser, window, tab
// page as an object in playwright (consider as driver in selenium)
//driver.get
//page.goto('URL');

test('myFristScript',async({page})=>{


    await page.goto('https://demoblaze.com/')  // this commands open the urls over browser
          const pageTitle =  await page.title();  // this method would return title of page.
          console.log("title of page "+ pageTitle)

          const pageURL = await page.url(); // this return the application url
          console.log("URL of page "+ pageURL)
          
            await expect(page).toHaveURL(pageURL);
            await expect(page).toHaveTitle(pageTitle);

            await page.close(); // closes the open browser.




})