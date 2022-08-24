
let mysql = require('mysql');

let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    database: 'eCommerceDB'
});

let someVar = [];

connection.query("select * from customers;", function(err, rows){
  if(err) {
    throw err;
  } else {
    setValue(rows);
  }
});

function setValue(value) {
  someVar = value;
  console.log(someVar);
}
