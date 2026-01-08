import {test,expect} from '@playwright/test'

test('fileWithDateName',async({page})=>{

    const cDate = new Date();

    console.log("Date "+ cDate.getDate());
    console.log("Month "+ cDate.getMonth());
    console.log("Year "+ cDate.getFullYear());

    const dd = cDate.getDate();
    const mm = cDate.getMonth();
    const yy = cDate.getFullYear();

    const fileName = `filename-${dd}-${mm}-${yy}`;
    console.log(`filname by date  ${fileName}`)
    
})