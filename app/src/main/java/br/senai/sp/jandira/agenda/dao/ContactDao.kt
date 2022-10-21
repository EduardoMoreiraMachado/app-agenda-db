package br.senai.sp.jandira.agenda.dao

import androidx.room.*
import br.senai.sp.jandira.agenda.model.Contact

@Dao
interface ContactDao {

    @Insert
    fun save(contact: Contact): Long

    @Delete
    fun delete(contact: Contact): Int

    @Update
    fun update(contact: Contact): Int

    @Query("select * from tbl_contact order by nome asc")
    fun getAll(): List<Contact>

    @Query("select * from tbl_contact where id = :id")
    fun getContactById(id: Int): Contact

}