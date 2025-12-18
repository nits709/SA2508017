let testData = `{
  "id": "101",
  "email": "selenium@Automaiton.com",
  "project_id": "EcommerceProject",
  "status": "active",
  "metadata": {
    "plan": "pro"
  }
}`

// console.log(typeof testData) // string
// console.log("id "+ testData.id)
// console.log("email "+ testData.email)
// console.log("project_Id "+ testData.project_id)
// console.log("status "+ testData.status)
// console.log("plan "+ testData.metadata.plan)

//convert json data into js object

let testJSdata = JSON.parse(testData);
console.log(typeof testJSdata) // Object

console.log("id "+ testJSdata.id)
console.log("email "+ testJSdata.email)
console.log("project_Id "+ testJSdata.project_id)
console.log("status "+ testJSdata.status)
console.log("plan "+ testJSdata.metadata.plan)
