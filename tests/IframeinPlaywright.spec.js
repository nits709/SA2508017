import { test, expect } from '@playwright/test';
const testData = require('./testData.json');

// locator --- locator
// frame -- frameLocator
test('iframe', async ({ page }) => {

    //1 open the URL
    await page.goto(testData.url);

    //2 select iframe
    const frame = await page.frameLocator(testData.frameLocator);


    //3 verify element inside iframe | draggable and droppable
    const draggable = frame.locator('#draggable');
    const droppable = frame.locator('#droppable');

    await expect(draggable).toBeVisible();
    await expect(droppable).toBeVisible();

    //drag and drop operation in playwright native func of PW is call dragTo

    // await drag.dragTo(drop);
    await draggable.dragTo(droppable)

    await expect(droppable).toHaveText('Dropped!')





})