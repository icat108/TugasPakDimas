package com.as6d46ad5a62a6dsd26qqd2a32dq6d.www.tugaspakdimas
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //membuat aksi ketika button di klik
        val tombolAksi: Button = findViewById(R.id.textButton)
        tombolAksi.setOnClickListener{
            ubahTeks()
        }

    }



    //fungsi ketika tombol di klik akan di panggil fungsi ini
    private fun ubahTeks () {
//        Toast nya saya comand supaya 'BUTTON CLICKED' tidak tampak ketika di klik disini
//        Toast.makeText(this , "BUTTON CLICKED",
//            Toast.LENGTH_SHORT).show()


        //mengubah isis tet box
        val txthello: TextView = findViewById(R.id.txthello)
        val txtdadu2: TextView = findViewById(R.id.txtdadu2)
        val txtdadu3: TextView = findViewById(R.id.txtdadu3)
        val txtdadu4: TextView = findViewById(R.id.txtdadu4)

        val randomInt = (1..954125).random()
        val tes = (1 until 954125).random()
        val tes2 = (1 until 954125).random()
        val tes3 = (1 until 954125).random()
        val tes4 = (1 until 954125).random()

        txthello.text = tes.toString()
        txtdadu2.text = tes2.toString()
        txtdadu3.text = tes3.toString()
        txtdadu4.text = tes4.toString()

    }




}
