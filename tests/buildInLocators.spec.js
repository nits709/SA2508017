import { test, expect } from 'playwright/test';

// can access the element from page by using alt text attribute if available
// nth function is equal to the get function from list in selenium + java

test('getByAlttext', async ({ page }) => {
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    const comLogo = await page.getByAltText('orangehrm-logo').nth(1)  // 2 matching node

    const comLogo1 = await page.getByAltText('company-branding');


    //one checking logo is visible or not
    await expect(comLogo).toBeVisible();
    await expect(comLogo1).toBeVisible();
    await page.close();

})


test('getByplaceHolder | getByText', async ({ page }) => {
    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

    await page.getByPlaceholder('Username').fill("Admin")
    await page.getByPlaceholder('Password').fill("admin123")
    await page.locator("[type='submit']").click();

    let adminElement = await page.getByText('Admin');

    await expect(adminElement).toBeVisible();

    await page.close();
})

test('getBylabel', async ({ page }) => {
    await page.goto("https://the-internet.herokuapp.com/login")
    await page.getByLabel('Username').fill('tomsmith');
    await page.getByLabel('Password').fill('SuperSecretPassword!')
    await page.locator('[type="submit"]').click();

    let logOutElement = await page.getByText('Logout').nth(1)
    await expect(logOutElement).toBeVisible();
    page.close();
})

test('getByRole', async ({ page }) => {

    await page.goto("https://the-internet.herokuapp.com/login")
    await page.getByLabel('Username').fill('tomsmith');
    await page.getByLabel('Password').fill('SuperSecretPassword!')
    //heading', { name: 'Sign up' }
    await page.getByRole('button',{name: 'Login'}).click();

    let logOutElement = await page.getByText('Logout').nth(1)
    await expect(logOutElement).toBeVisible();
    page.close();

})