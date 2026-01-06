import { test, expect } from 'playwright/test'


test('UploadFileInPW', async ({ page }) => {


    await page.goto("https://the-internet.herokuapp.com/upload")

    //use absolute file path supply fully qualified path of file)
    const filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_Notes/JavaScripts_Session_Material/JavaScript.pptx";

    await page.setInputFiles('#file-upload', filePath);
    await page.locator('#file-submit').click();

    const verifyText = await page.locator('#uploaded-files').textContent(); // playwright
    console.log("successfully text "+ verifyText)

    const verifyText1 = await page.locator('#uploaded-files').innerText();  // javascript
    console.log("successfully fetch Text "+ verifyText1);





})