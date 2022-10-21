package br.senai.sp.jandira.agenda.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

//definindo a classe como uma entidade do banco de dados
@Entity(tableName = "tbl_contact")
class Contact {

    //definindo a variável como um atributo PK
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var nome = ""
    var telefone = ""
    var email = ""

    @ColumnInfo(name = "data_nascimento")
    var dataNascimento: LocalDate? = null

    var foto: Drawable? = null

}