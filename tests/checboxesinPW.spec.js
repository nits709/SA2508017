import {test,expect} from '@playwright/test'

test('checkbox in PW', async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/")

    // click and check function
    await page.locator("[value='sunday']").check();
    await page.locator("//input[@id='monday' and @type='checkbox']").click();

    //multiple checkbox
            const checkbox = await page.locator("[class='form-check-input'][type='checkbox']")  // return 7 checkbox 
                    const ccCount = await checkbox.count();
                 await expect(checkbox).toHaveCount(7); // assertion on count


                 for(let i =0; i<ccCount;i++){
                    await checkbox.nth(i).check(); // checked
                   // await checkbox.nth(i).check(); // unchecked
                 }


                 await page.waitForTimeout(2000)


                // click on same checkbox to uncheck // assignment 
})