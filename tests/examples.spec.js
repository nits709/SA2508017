
import { test, expect } from '@playwright/test'

test('myFirstTest', async ({ page }) => {
   await page.goto("https://google.co.in");// this will navigate to URL.
 
})