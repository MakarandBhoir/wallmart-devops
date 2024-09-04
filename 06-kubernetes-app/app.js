const express = require('express');
const os = require('os');
const app = express();

app.get('/', (req, res) => {
  res.send(`
    <h1>Hello!!! Welcome To Kubernetes World!</h1>
    <p><b>${os.hostname()} is serving your request.</b></p>
    <p>Send a request to /error to crash.</p>
  `);
});

app.get('/error', (req, res) => {
  process.exit(1);
});

app.listen(8080);
