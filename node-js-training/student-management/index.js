const bodyParser = require('body-parser');
const express = require('express');
const mongoose = require('mongoose');
const studentRoutes = require('./routes/studentRoutes');

const app = express();
const PORT = process.env.PORT || 3000;

app.use(bodyParser.json());

mongoose.connect('mongodb://0.0.0.0:27017/studentManagement')
.then(() => console.log('MongoDB connected'))
.catch((err) => console.log(err));

//routes
app.use('/api/v1/students', studentRoutes);

app.listen(PORT, () => {
    console.log(`Server is running in port ${PORT}`);
});