import { test, expect } from '@playwright/test';
import { register } from 'node:module';


test("Assertion in PW", async ({ page }) => {

    await page.goto("https://demo.nopcommerce.com/register?returnUrl=%2F")

    //  1. await expect(locator).toBeEnabled()
    const searchElement = await page.locator('#small-searchterms');
    await expect(searchElement).toBeEnabled() // boolean true or false
    await expect(searchElement).toBeEditable(); // 0 || 1 
    await expect(searchElement).toHaveAttribute('aria-label', 'Search store')


    //2 await expect(locator).toBeChecked() | radio | checkbox

    const MaleGanderElment = await page.locator('#gender-male');
    await MaleGanderElment.click();
    await expect(MaleGanderElment).toBeChecked(); 
    
    //3await expect(locator).toBeChecked()
       const newLetterCheckbox =  await page.locator('#NewsLetterSubscriptions_0__IsActive')
       //await MaleGanderElment.click();
       await expect(newLetterCheckbox).toBeChecked();  // true


       await page.locator('#FirstName').fill("Selenium")
       const firstNameElement = await page.locator('#FirstName')
       await expect(firstNameElement).toHaveValue('Selenium')
       expect(firstNameElement).toHaveValue('Selenium') // js based assertion


       const registerButton = await page.locator('#register-button')
       await expect(registerButton).toHaveText('Register'); //check complete texted
       await expect(registerButton).toContainText('Reg'); // checks parital text.

})