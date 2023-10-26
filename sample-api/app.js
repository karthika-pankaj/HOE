const express = require('express');
const app = express();

app.get('/', (req, res) => {
  const word = req.query.word || 'Hello'; // Default word is 'Hello'
  const length = word.length;
  res.send(`Length of '${word}' is ${length}`);
});

app.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
