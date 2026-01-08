import {test,expect} from '@playwright/test'


test('Handling simple alert',async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/")


    // ok -- accept()
    // cancel -- dismiss();
    //enabling dialog window (alerts)
    // page.on block has to be there before perform any action on alert
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('alert');
        expect(dialog.message()).toContain('I am an alert box!');
        await dialog.accept(); // ok
    })

    await page.locator('#alertBtn').click();
})

test('Handling confirmation alert',async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/")


   //confirmaitonalert - confirm
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('confirm');
        expect(dialog.message()).toContain('Press a button!');
        await dialog.accept(); // ok
       // await dialog.dismiss();
    })

    await page.locator('#confirmBtn').click();
     const alertText =   await page.locator('#demo');
     await expect(alertText).toHaveText('You pressed OK!')


})

test('Handling prompt alert',async({page})=>{
    await page.goto("https://testautomationpractice.blogspot.com/")


    // promptalert -- prompt
    page.on('dialog',async dialog=>{
        //assertion.
        expect(dialog.type()).toContain('prompt');
        expect(dialog.message()).toContain('Please enter your name:');
        expect(dialog.defaultValue()).toContain('Harry Potter')
       //await dialog.accept();  // accept alert
    await dialog.accept('John') // first enter data into dialog then accepts the alert
       
       // await dialog.dismiss();
    })

    await page.locator('#promptBtn').click();
     const alertText =   await page.locator('#demo');
     await expect(alertText).toHaveText('Hello John! How are you today?')


})