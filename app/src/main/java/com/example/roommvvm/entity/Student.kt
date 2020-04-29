package com.example.roommvvm.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//class yg digunakan untuk menentukan struktur dalam tabel Student
@Entity
data class Student (
    //menentutukan primary key tabel (autoGenerate berfungsi seperti auto increment)
    @PrimaryKey(autoGenerate = true) var id: Int? = null,

    //columnInfo untuk mendeklarasikan struktur tabel
    //dalam tabel ini tersedia 1 field yaitu nama bertipe data string
    @ColumnInfo var name: String = ""
)