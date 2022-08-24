let mysql = require('mysql');

let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password',
    database: 'eCommerceDB'
});

connection.connect(function(err) {
    if (err) throw err;
    connection.query("SELECT * FROM items;", function (err, result, fields) {
      if (err) throw err;
      console.log(result);
    });
  });

  