
import { test, expect } from '@playwright/test';

test.skip('hard', async ({ page }) => {

    await page.goto('https://demoblaze.com/');
    console.log('A')
    await expect(page).toHaveTitle('STORE123') // positive assertions
    console.log('B')
    console.log('C')

})
//assert.all()
test('soft', async ({ page }) => {

    await page.goto('https://demoblaze.com/');
    console.log('A')
    await expect.soft(page).toHaveTitle('STORE123') // positive assertions
    console.log('B')
    console.log('C')

})