const express = require('express');
const router = express.Router();
const Student = require('../models/Student');

router.get('/', async (req, res) =>{
    try{
        const students = await Student.find();
        res.status(200).json(students);
    } catch(err){
        res.status(500).json({message: err.message});
    }
});

router.post('/', async(req, res) =>{
    const{studentId, name, gpa} =req.body;

    const newStudent = new Student({
        studentId,
        name,
        gpa,
    });

    try{
        await newStudent.save();
        res.status(201).json(newStudent);
    } catch(err){
        res.status(400).json({message: err.message});
    }
});

module.exports = router;